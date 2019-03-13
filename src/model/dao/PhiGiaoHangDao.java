package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import libs.ConnectionWithSql;

public class PhiGiaoHangDao {

	public int phiGiaoHangCuaNhaHangTrongKhuVuc(String maNhaHang, String maKhuVuc) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = " SELECT * FROM NhaHang INNER JOIN PhiGiaoHang ON NhaHang.MaNhaHang = PhiGiaoHang.MaNhaHang WHERE NhaHang.MaNhaHang = ? AND MaKhuVuc = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhaHang);
			pst.setString(2, maKhuVuc);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int phiGiaohang = 0;
		try {
			while (rs.next()) {
				phiGiaohang = rs.getInt("PhiGiaoHang");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return phiGiaohang;

	}
}
