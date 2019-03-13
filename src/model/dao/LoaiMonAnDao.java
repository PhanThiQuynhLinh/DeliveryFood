package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import libs.ConnectionWithSql;
import model.bean.LoaiMonAn;

public class LoaiMonAnDao {
	
	public ArrayList<LoaiMonAn> danhSachLoaiMonAn(String maNhaHang){
		
		Connection conn = ConnectionWithSql.getConnect();
		
		String sql = " SELECT DISTINCT LoaiMonAn.MaLoaiMonAn, TenLoaiMonAn FROM LoaiMonAn INNER JOIN MonAn ON LoaiMonAn.MaLoaiMonAn = MonAn.MaLoaiMonAn "
				+ "INNER JOIN NhaHang ON MonAn.MaNhaHang = NhaHang.MaNhaHang WHERE NhaHang.MaNhaHang = ?";
		
		ResultSet rs = null;
				
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhaHang);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<LoaiMonAn> danhSachLoaiMonAn = new ArrayList<>();
		LoaiMonAn loaiMonAn;
		try {
			while(rs.next()) {
				loaiMonAn = new LoaiMonAn();
				loaiMonAn.setMaLoaiMonAn(rs.getString("MaLoaiMonAn"));
				loaiMonAn.setTenLoaiMonAn(rs.getString("TenLoaiMonAn"));
				danhSachLoaiMonAn.add(loaiMonAn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return danhSachLoaiMonAn;
		
	}
}
