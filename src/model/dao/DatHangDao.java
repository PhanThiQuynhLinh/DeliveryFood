package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import libs.ConnectionWithSql;

public class DatHangDao {

	public void themDonHang(String tenNguoiNhan, String ngayXuatHoaDon, String soDienThoai, String diaChi,
			String tinhTrang, int tongTienTT, String maKachHang, String id) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "INSERT INTO HoaDon(TenNguoiNhan,NgayXuatHoaDon,SoDienThoaiNguoiNhan,DiaChiGiao, TinhTrang, TongTienTT, MaKhachHang, ID)"
				+ "	VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, tenNguoiNhan);
			pst.setString(2, ngayXuatHoaDon);
			pst.setString(3, soDienThoai);
			pst.setString(4, diaChi);
			pst.setString(5, tinhTrang);
			pst.setInt(6, tongTienTT);
			pst.setString(7, maKachHang);
			pst.setString(8, id);
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void themChiTietDonHang(int maHoaDon, String maMonAn, int soLuong) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "INSERT INTO ChiTiet(MaHoaDon, MaMonAn, SoLuong) VALUES (?,?,?)";

		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, maHoaDon);
			pst.setString(2, maMonAn);
			pst.setInt(3, soLuong);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int maHoaDon(String id) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT * FROM HoaDon WHERE ID = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int mDH = 0;
		try {
			while(rs.next()) {
				mDH = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mDH;
	}

}
