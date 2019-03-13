package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import libs.ConnectionWithSql;

public class PhiShip {
	public int phiShipTrongKhuVuc(String maNhaHang, String maKhuVuc) {
		Connection conn = ConnectionWithSql.getConnect();
		int phiGiaoHang = 0;
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
		
		try {
			while(rs.next()) {
				phiGiaoHang = rs.getInt("PhiGiaoHang");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return phiGiaoHang;
		
		
	}
}
