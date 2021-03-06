package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.StringProcess;
import libs.ConnectionWithSql;
import model.bean.HoaDon;

public class ThongKeDao {
	public ArrayList<HoaDon> danhSachHoaDon(String maNhaHang){
		Connection conn = ConnectionWithSql.getConnect();
		String sql = " SELECT * FROM HoaDon INNER JOIN ChiTiet ON HoaDon.MaHoaDon = ChiTiet.MaHoaDon"
				+ " INNER JOIN MonAn ON ChiTiet.MaMonAn = MonAn.MaMonAn WHERE MonAn.MaNhaHang = ? AND TinhTrang = N'Đã Giao'";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhaHang);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<HoaDon> danhSachHD = new ArrayList<>();
		HoaDon hoaDon;
		
		try {
			while(rs.next()) {
				hoaDon = new HoaDon();
				hoaDon.setMaHoaDon(rs.getString("MaHoaDon"));
				hoaDon.setTenNguoiNhan(rs.getString("TenNguoiNhan"));
				hoaDon.setMaKhachHang(rs.getString("MaKhachHang"));
				hoaDon.setNgayXuatHoaDon(rs.getString("NgayXuatHoaDon"));
				hoaDon.setTenMonAn(rs.getString("TenMonAn"));
				hoaDon.setTongTienThanhToan(StringProcess.formatNumber(rs.getInt("TongTienTT")));
				danhSachHD.add(hoaDon);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return danhSachHD;
	}
	
	public int tongHoaDon(String maNhaHang) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "    SELECT SUM(TongTienTT)  FROM HoaDon INNER JOIN ChiTiet ON HoaDon.MaHoaDon = ChiTiet.MaHoaDon INNER JOIN MonAn ON ChiTiet.MaMonAn = MonAn.MaMonAn WHERE MonAn.MaNhaHang = ? AND TinhTrang = N'Đã Giao' GROUP BY  TongTienTT";
		ResultSet rs = null;
		
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhaHang);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int tong = 0;
		try {
			while(rs.next()) {
				tong = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tong;
	}
	
}
