package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import libs.ConnectionWithSql;
import model.bean.NhanVien;

public class NhanVienDao {
	public ArrayList<NhanVien> hienThiDanhSachNhanVien() throws SQLException{
		Connection conn = ConnectionWithSql.getConnect();
		
		String sql = "SELECT * FROM NhanVien LEFT JOIN NhaHang ON NhaHang.MaNhaHang = NhanVien.MaNhaHang";
		
		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
		NhanVien nhanVien;
		try {
			while(rs.next()) {
				nhanVien = new NhanVien();
				nhanVien.setMaNhanVien(rs.getString("MaNhanVien"));
				nhanVien.setHoTenNhanVien(rs.getString("HoTenNhanVien"));
				nhanVien.setNgaySinh(rs.getString("NgaySinh"));
				nhanVien.setMatKhau(rs.getString("MatKhau"));
				nhanVien.setGioiTinh(rs.getInt("GioiTinh"));
				nhanVien.setSoDienThoai(rs.getString("SoDienThoai"));
				nhanVien.setDiaChi(rs.getString("DiaChi"));
				nhanVien.setEmail(rs.getString("Email"));
				nhanVien.setMaNhaHang(rs.getString("MaNhaHang"));
				nhanVien.setTenNhaHang(rs.getString("TenNhaHang"));
				danhSachNhanVien.add(nhanVien);
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
		return danhSachNhanVien;
	}
	
	public NhanVien hienThiThongTinNhanVien(String maNhanVien) throws SQLException {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT distinct * FROM NhanVien LEFT JOIN NhaHang ON NhaHang.MaNhaHang = NhanVien.MaNhaHang where MaNhanVien=?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhanVien);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		NhanVien nhanVien = new NhanVien();
		try {
			while(rs.next()) {
				nhanVien.setMaNhanVien(rs.getString("MaNhanVien"));
				nhanVien.setHoTenNhanVien(rs.getString("HoTenNhanVien"));
				nhanVien.setNgaySinh(rs.getString("NgaySinh"));
				nhanVien.setMatKhau(rs.getString("MatKhau"));
				nhanVien.setGioiTinh(rs.getInt("GioiTinh"));
				nhanVien.setSoDienThoai(rs.getString("SoDienThoai"));
				nhanVien.setDiaChi(rs.getString("DiaChi"));
				nhanVien.setEmail(rs.getString("Email"));
				nhanVien.setMaNhaHang(rs.getString("MaNhaHang"));
				nhanVien.setTenNhaHang(rs.getString("TenNhaHang"));
				
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
		return nhanVien;
	}
	
	public void xoaNhanVien(String maNhanVien) throws SQLException{
		Connection conn = ConnectionWithSql.getConnect();
		String sql ="DELETE FROM NhanVien WHERE MaNhanVien = ?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhanVien);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				conn.close();
			}
		}
	}
	
	public void suaNhanVien(NhanVien nhanVien)throws SQLException {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "UPDATE NhanVien SET  HoTenNhanVien = ?, MatKhau = ?, NgaySinh = ?, GioiTinh = ?, SoDienThoai = ?, DiaChi = ?, Email = ? where MaNhanVien = ?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, nhanVien.getHoTenNhanVien());
			pst.setString(2, nhanVien.getMatKhau());
			pst.setString(3, nhanVien.getNgaySinh());
			pst.setInt(4, nhanVien.getGioiTinh());
			pst.setString(5, nhanVien.getSoDienThoai());
			pst.setString(6, nhanVien.getDiaChi());
			pst.setString(7, nhanVien.getEmail());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				conn.close();
			}
		}
	}

}
