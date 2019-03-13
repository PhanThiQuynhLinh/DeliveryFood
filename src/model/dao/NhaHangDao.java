package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.StringProcess;
import libs.ConnectionWithSql;
import model.bean.LoaiNhaHang;
import model.bean.NhaHang;

public class NhaHangDao {
	public int tinhSoLuongNhaHang() {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT COUNT (MaNhaHang) FROM NhaHang";
		int count = 0;
		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;

	}
	public int tongSoNhaHangTrongKhuVuc(String maKhuVuc) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT COUNT(NhaHang.MaNhaHang) FROM NhaHang INNER JOIN PhiGiaoHang ON NhaHang.MaNhaHang = PhiGiaoHang.MaNhaHang " 
					+ "INNER JOIN KhuVuc ON PhiGiaoHang.MaKhuVuc = KhuVuc.MaKhuVuc WHERE KhuVuc.MaKhuVuc = ?";
		int tong = 0;
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maKhuVuc);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			while(rs.next()) {
				tong = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tong;
	}
	
	public ArrayList<NhaHang> danhSachNhaHangTrongKhuVuc(String maKhuVuc){
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT * FROM LoaiNhaHang INNER JOIN NhaHang ON LoaiNhaHang.MaLoaiNhaHang = NhaHang.MaLoaiNhaHang "
				+ " INNER JOIN PhiGiaoHang ON NhaHang.MaNhaHang = PhiGiaoHang.MaNhaHang "
				+ " INNER JOIN KhuVuc ON PhiGiaoHang.MaKhuVuc = KhuVuc.MaKhuVuc " 
				+ " WHERE KhuVuc.MaKhuVuc = ? ";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maKhuVuc);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<NhaHang> danhSachNhaHang = new ArrayList<>();
		NhaHang nhaHang;
		try {
			while(rs.next()) {
				nhaHang = new NhaHang();
				nhaHang.setMaNhaHang(rs.getString("MaNhaHang"));
				nhaHang.setTenNhaHang(rs.getString("TenNhaHang"));
				nhaHang.setEmail(rs.getString("Email"));
				nhaHang.setSoDienThoai(rs.getString("SoDienThoai"));
				nhaHang.setDiaChi(rs.getString("DiaChi"));
				nhaHang.setTenLoaiNhaHang(rs.getString("TenLoai"));
				nhaHang.sethinhAnhNhaHang(rs.getString("HinhAnh"));
				nhaHang.setMoTa(rs.getString("MoTa"));
				nhaHang.setDonHangToiThieu(StringProcess.formatNumber(rs.getInt("DonHangToiThieu")));
				nhaHang.setMaLoaiNhaHang(rs.getString("MaLoaiNhaHang"));
				nhaHang.setMaKhuVuc(rs.getString("MaKhuVuc"));
				nhaHang.setPhiGiaoHang(StringProcess.formatNumber(rs.getInt("PhiGiaoHang")));
				nhaHang.setKhoangThoiGianShip(rs.getInt("KhoangThoiGianShip"));
				danhSachNhaHang.add(nhaHang);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return danhSachNhaHang;
	}
	
	public ArrayList<NhaHang> danhSachNhaHangTrongKhuVucTheoLoai(String maKhuVuc, String maLoaiNhaHang){
		Connection conn = ConnectionWithSql.getConnect();
		ArrayList<NhaHang> danhSachNhaHang = new ArrayList<>();
		String sql = "SELECT * FROM LoaiNhaHang INNER JOIN NhaHang ON LoaiNhaHang.MaLoaiNhaHang = NhaHang.MaLoaiNhaHang "
				+ " INNER JOIN PhiGiaoHang ON NhaHang.MaNhaHang = PhiGiaoHang.MaNhaHang "
				+ " INNER JOIN KhuVuc ON PhiGiaoHang.MaKhuVuc = KhuVuc.MaKhuVuc " 
				+ " WHERE KhuVuc.MaKhuVuc = ? AND LoaiNhaHang.MaLoaiNhaHang = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maKhuVuc);
			pst.setString(2, maLoaiNhaHang);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		NhaHang nhaHang;
		try {
			while(rs.next()) {
				nhaHang = new NhaHang();
				nhaHang.setMaNhaHang(rs.getString("MaNhaHang"));
				nhaHang.setTenNhaHang(rs.getString("TenNhaHang"));
				nhaHang.setEmail(rs.getString("Email"));
				nhaHang.setSoDienThoai(rs.getString("SoDienThoai"));
				nhaHang.setDiaChi(rs.getString("DiaChi"));
				nhaHang.setTenLoaiNhaHang(rs.getString("TenLoai"));
				nhaHang.sethinhAnhNhaHang(rs.getString("HinhAnh"));
				nhaHang.setMoTa(rs.getString("MoTa"));
				nhaHang.setDonHangToiThieu(StringProcess.formatNumber(rs.getInt("DonHangToiThieu")));
				nhaHang.setMaLoaiNhaHang(rs.getString("MaLoaiNhaHang"));
				nhaHang.setMaKhuVuc(rs.getString("MaKhuVuc"));
				nhaHang.setPhiGiaoHang(StringProcess.formatNumber(rs.getInt("PhiGiaoHang")));
				nhaHang.setKhoangThoiGianShip(rs.getInt("KhoangThoiGianShip"));
				danhSachNhaHang.add(nhaHang);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return danhSachNhaHang;
	}
	
	public String hienThiTenNhaHang(String maNhaHang) {
		Connection conn = ConnectionWithSql.getConnect();
		
		String sql = "SELECT TenNhaHang FROM NhaHang WHERE MaNhaHang = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhaHang);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String tenNhaHang = null;
		try {
			while(rs.next()) {
				tenNhaHang = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tenNhaHang;
		
	}
	
	public ArrayList<NhaHang> hienThiDanhSachNhaHang() {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT * FROM NhaHang INNER JOIN LoaiNhaHang ON NhaHang.MaLoaiNhaHang = LoaiNhaHang.MaLoaiNhaHang";
		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<NhaHang> danhSachNhaHang = new ArrayList<>();
		NhaHang nhaHang;
		try {
			while (rs.next()) {
				nhaHang = new NhaHang();
				nhaHang.setMaNhaHang(rs.getString("MaNhaHang"));
				nhaHang.setTenNhaHang(rs.getString("TenNhaHang"));
				nhaHang.setEmail(rs.getString("Email"));
				nhaHang.setSoDienThoai(rs.getString("SoDienThoai"));
				nhaHang.setDiaChi(rs.getString("DiaChi"));
				nhaHang.setTenLoaiNhaHang(rs.getString("TenLoai"));

				danhSachNhaHang.add(nhaHang);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return danhSachNhaHang;
	}
	
	public void xoaNhaHang(String maNhaHang) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "DELETE FROM NhaHang WHERE MaNhaHang = ?";
		
		
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhaHang);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public String maNhaHang(String email) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT * FROM NhaHang WHERE Email = ?";
		ResultSet rs= null;
		String maNH = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(rs.next()) {
				maNH = rs.getString("MaNhaHang");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maNH;
	}

}
