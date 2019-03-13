package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.StringProcess;
import libs.ConnectionWithSql;
import model.bean.MonAn;

public class MonAnDao {
	public int tinhSoLuongMonAn() {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT COUNT (MaMonAn) FROM MonAn";
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

	public ArrayList<MonAn> danhSachTopMonAnCuaNhaHang(String maNhaHang) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT TOP 3 * FROM MonAn INNER JOIN NhaHang ON MonAn.MaNhaHang = NhaHang.MaNhaHang where NhaHang.MaNhaHang = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhaHang);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ArrayList<MonAn> danhSachMonAn = new ArrayList<>();
		MonAn monAn;

		try {
			while (rs.next()) {
				monAn = new MonAn();
				monAn.setMaMonAn(rs.getString(1));
				monAn.setTenMonAn(rs.getString(2));
				monAn.setGiaBan(StringProcess.formatNumber(rs.getInt(3)));
				monAn.sethinhAnhMonAn(rs.getString(4));
				monAn.setSoLuong(rs.getInt(5));
				monAn.setMoTa(rs.getString(6));
				monAn.setMaNhaHang(rs.getString(7));
				monAn.setMaLoaiMonAn(rs.getString(8));
				monAn.setTenLoaiMonAn(rs.getString(10));
				danhSachMonAn.add(monAn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return danhSachMonAn;
	}

	public ArrayList<MonAn> danhSachMonAnCuaNhaHang(String maNhaHang) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT * FROM MonAn INNER JOIN LoaiMonAn ON MonAn.MaLoaiMonAn = LoaiMonAn.MaLoaiMonAn WHERE MaNhaHang = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhaHang);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList<MonAn> danhSachMonAn = new ArrayList<>();
		MonAn monAn;

		try {
			while (rs.next()) {
				monAn = new MonAn();
				monAn.setMaMonAn(rs.getString(1));
				monAn.setTenMonAn(rs.getString(2));
				monAn.setGiaBan(StringProcess.formatNumber(rs.getInt(3)));
				monAn.sethinhAnhMonAn(rs.getString(4));
				monAn.setSoLuong(rs.getInt(5));
				monAn.setMoTa(rs.getString(6));
				monAn.setMaNhaHang(rs.getString(7));
				monAn.setMaLoaiMonAn(rs.getString(8));
				monAn.setTenLoaiMonAn(rs.getString(10));
				danhSachMonAn.add(monAn);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return danhSachMonAn;

	}

	public ArrayList<MonAn> danhSachMonAnTheoLoai(String maNhaHang, String maLoaiMonAn) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT * FROM LoaiMonAn INNER JOIN MonAn ON LoaiMonAn.MaLoaiMonAn = MonAn.MaLoaiMonAn"
				+ " INNER JOIN NhaHang ON MonAn.MaNhaHang = NhaHang.MaNhaHang"
				+ " WHERE NhaHang.MaNhaHang = ? AND LoaiMonAn.MaLoaiMonAn = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maNhaHang);
			pst.setString(2, maLoaiMonAn);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList<MonAn> danhSachMonAn = new ArrayList<>();
		MonAn monAn;

		try {
			while (rs.next()) {
				monAn = new MonAn();
				monAn.setMaMonAn(rs.getString("MaMonAn"));
				monAn.setTenMonAn(rs.getString("TenMonAn"));
				monAn.setGiaBan(StringProcess.formatNumber(rs.getInt("GiaBan")));
				monAn.sethinhAnhMonAn(rs.getString("HinhAnh"));
				monAn.setSoLuong(rs.getInt("SoLuong"));
				monAn.setMoTa(rs.getString("MoTa"));
				monAn.setMaNhaHang(rs.getString("MaNhaHang"));
				monAn.setMaLoaiMonAn(rs.getString("MaLoaiMonAn"));
				monAn.setTenLoaiMonAn(rs.getString("TenLoaiMonAn"));
				danhSachMonAn.add(monAn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return danhSachMonAn;
	}

	public MonAn hienThiMonAn(String maMonAn) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT * FROM MonAn WHERE MaMonAn = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maMonAn);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		MonAn monAn = new MonAn();
		try {
			while (rs.next()) {
				monAn.setMaMonAn(rs.getString("MaMonAn"));
				monAn.setTenMonAn(rs.getString("TenMonAn"));
				monAn.setGiaBan(StringProcess.formatNumber(rs.getInt("GiaBan")));
				monAn.sethinhAnhMonAn(rs.getString("HinhAnh"));
				monAn.setSoLuong(rs.getInt("SoLuong"));
				monAn.setMoTa(rs.getString("MoTa"));
				monAn.setMaNhaHang(rs.getString("MaNhaHang"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return monAn;
	}

	public MonAn hienThiThongTinMonAn(String maMonAn) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = " SELECT * FROM MonAn WHERE MonAn.MaMonAn = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maMonAn);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		MonAn monAn = new MonAn();
		try {
			while (rs.next()) {
				monAn.setMaMonAn(maMonAn);
				monAn.setTenMonAn(rs.getString("TenMonAn"));
				monAn.setGiaBan(StringProcess.formatNumber(rs.getInt("giaBan")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return monAn;
	}
	
	public int hienThiGiaBanCuaMonAn(String maMonAn) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = " SELECT * FROM MonAn WHERE MonAn.MaMonAn = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maMonAn);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int giaBan = 0;
		try {
			while (rs.next()) {
				giaBan = rs.getInt("GiaBan");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return giaBan;
	}
	
	public ArrayList<MonAn> hienThiDanhSachMonAn(){
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT  * FROM     MonAn LEFT JOIN LoaiMonAn ON MonAn.MaLoaiMonAn = LoaiMonAn.MaLoaiMonAn";
		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ArrayList<MonAn> danhSachMonAn = new ArrayList<>();
		MonAn monAn;
		try {
			while (rs.next()) {
				monAn = new MonAn();
				monAn.setMaMonAn(rs.getString("MaMonAn"));
				monAn.setTenMonAn(rs.getString("TenMonAn"));
				monAn.setGiaBan(StringProcess.formatNumber(rs.getInt("GiaBan")));
				monAn.sethinhAnhMonAn(rs.getString("HinhAnh"));
				monAn.setSoLuong(rs.getInt("SoLuong"));
				monAn.setMoTa(rs.getString("MoTa"));
				monAn.setTenLoaiMonAn(rs.getString("TenLoaiMonAn"));
				monAn.setMaLoaiMonAn(rs.getString("MaLoaiMonAn"));
				danhSachMonAn.add(monAn);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(danhSachMonAn.size());
		return danhSachMonAn;
	}
}
