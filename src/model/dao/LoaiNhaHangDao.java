package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import libs.ConnectionWithSql;
import model.bean.LoaiNhaHang;

public class LoaiNhaHangDao {

	public ArrayList<LoaiNhaHang> hienThiDanhSachLoaiNhaHang(){
		Connection conn = ConnectionWithSql.getConnect();
		
		String sql = "SELECT * FROM LoaiNhaHang";
		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<LoaiNhaHang> danhSachLoaiNhaHang = new ArrayList<>();
		LoaiNhaHang loaiNhaHang ;
		try {
			while(rs.next()) {
				loaiNhaHang = new LoaiNhaHang();
				loaiNhaHang.setMaLoaiNhaHang(rs.getString("MaLoaiNhaHang"));
				loaiNhaHang.setTenLoaiNhaHang(rs.getString("TenLoai"));
				danhSachLoaiNhaHang.add(loaiNhaHang);			
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return danhSachLoaiNhaHang;
		
	}
	
	public ArrayList<LoaiNhaHang> hienThiDanhSachLoaiNhaHangTrongKhuVuc(String maKhuVuc){
		Connection conn = ConnectionWithSql.getConnect();
		
		String sql = "SELECT DISTINCT TenLoai, LoaiNhaHang.MaLoaiNhaHang FROM LoaiNhaHang"
				+ " INNER JOIN NhaHang ON LoaiNhaHang.MaLoaiNhaHang = NhaHang.MaLoaiNhaHang"
				+ " INNER JOIN PhiGiaoHang ON NhaHang.MaNhaHang= PhiGiaoHang.MaNhaHang"
				+ " INNER JOIN KhuVuc ON PhiGiaoHang.MaKhuVuc=KhuVuc.MaKhuVuc WHERE KhuVuc.MaKhuVuc = ? ";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maKhuVuc);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<LoaiNhaHang> danhSachLoaiNhaHang = new ArrayList<>();
		LoaiNhaHang loaiNhaHang ;
		try {
			while(rs.next()) {
				loaiNhaHang = new LoaiNhaHang();
				loaiNhaHang.setMaLoaiNhaHang(rs.getString("MaLoaiNhaHang"));
				loaiNhaHang.setTenLoaiNhaHang(rs.getString("TenLoai"));
				danhSachLoaiNhaHang.add(loaiNhaHang);			
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return danhSachLoaiNhaHang;
	}
	
}	
