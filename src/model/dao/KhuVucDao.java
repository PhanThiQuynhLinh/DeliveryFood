package model.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import libs.ConnectionWithSql;
import model.bean.KhuVuc;

public class KhuVucDao {
	
	public ArrayList<KhuVuc> hienThiDanhSachKhuVuc(){
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT * FROM KhuVuc";
		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ArrayList<KhuVuc> danhSachKhuVuc = new ArrayList<>();
		KhuVuc khuVuc;
		try {
			while(rs.next()) {
				khuVuc = new KhuVuc();
				khuVuc.setMaKhuVuc(rs.getString("MaKhuVuc"));
				khuVuc.setTenKhuVuc(rs.getString("TenKhuVuc"));
				danhSachKhuVuc.add(khuVuc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return danhSachKhuVuc;
	}
	
	public String hienThiTenKhuVuc(String maKhuVuc) {
		Connection conn = ConnectionWithSql.getConnect();
		
		String sql = "SELECT TenKhuVuc FROM KhuVuc WHERE MaKhuVuc = ?";
		ResultSet rs = null;
		String tenKhuVuc = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maKhuVuc);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(rs.next()) {
				tenKhuVuc = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tenKhuVuc;
	}
	
	public ArrayList<KhuVuc> danhSachKhuVuc() throws SQLException{
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT KhuVuc.MaKhuVuc as MaKhuVuc, TenKhuVuc, MaNhaHang, PhiGiaoHang, KhoangThoiGianShip FROM     PhiGiaoHang RIGHT JOIN KhuVuc ON PhiGiaoHang.MaKhuVuc = KhuVuc.MaKhuVuc";
		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ArrayList<KhuVuc> dsKhuVuc = new ArrayList<>();
		KhuVuc khuVuc ;
		try {
			while(rs.next()) {
				khuVuc = new KhuVuc();
				khuVuc.setMaKhuVuc(rs.getString("MaKhuVuc"));
				khuVuc.setTenKhuVuc(rs.getString("TenKhuVuc"));
				khuVuc.setKhoangThoiGianShip(rs.getInt("KhoangThoiGianShip"));
//				khuVuc.setPhiGiaoHang(rs.getDouble("PhiGiaoHang"));
				dsKhuVuc.add(khuVuc);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				rs.close();
				}
			if(conn != null) {
				conn.close();
			}
		}
		return dsKhuVuc;
		
	}
}
