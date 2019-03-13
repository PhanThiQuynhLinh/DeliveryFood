package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.StringProcess;
import libs.ConnectionWithSql;
import model.bean.LichSuDatHang;

public class LichSuDatHangDao {
	public ArrayList<LichSuDatHang> danhSachLichSuDatHangCuaKhachHang(String maKhachHang){
		Connection conn = ConnectionWithSql.getConnect();
		
		String sql = "  SELECT * FROM KhachHang INNER JOIN HoaDon ON KhachHang.MaKhachHang = HoaDon.MaKhachHang"
				+ " INNER JOIN ChiTiet ON HoaDon.MaHoaDon = ChiTiet.MaHoaDon"
				+ " INNER JOIN MonAn ON ChiTiet.MaMonAn = MonAn.MaMonAn"
				+ " INNER JOIN NhaHang ON MonAn.MaNhaHang = NhaHang.MaNhaHang WHERE KhachHang.Email = ? AND TinhTrang = N'Đã Giao'";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maKhachHang);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ArrayList<LichSuDatHang> danhSachLichSuDatHang =new ArrayList<>();
		LichSuDatHang lichSuDatHang;
		
		try {
			while(rs.next()) {
				lichSuDatHang = new LichSuDatHang();
				lichSuDatHang.setMaDonHang(rs.getInt("MaHoaDon"));
				lichSuDatHang.setMaMonAn(rs.getString("MaMonAn"));
				lichSuDatHang.setTenMonAn(rs.getString("TenMonAn"));
				lichSuDatHang.setNgayXuatDon(rs.getString("NgayXuatHoaDon"));
				lichSuDatHang.setTenNhaHang(rs.getString("TenNhaHang"));
				lichSuDatHang.setTongTienThanhToan(StringProcess.formatNumber(rs.getInt("TongTienTT")));
				danhSachLichSuDatHang.add(lichSuDatHang);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return danhSachLichSuDatHang;
		
		
	}
}
