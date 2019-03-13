package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import libs.ConnectionWithSql;
import model.bean.KhachHang;

public class KhachHangDao {

	public boolean dangNhap(String email, String matKhau) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT TenKhachHang, MaKhachHang  FROM KhachHang WHERE Email = ? AND MatKhau = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, matKhau);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean dangKy(String tenKhachHang, String email, String soDienThoai, int gioiTinh, String matKhau,
			String ngaySinh, String diaChi, String maKhuVuc) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "INSERT INTO KhachHang (TenKhachHang, Email, MatKhau, GioiTinh, SoDienThoai, NgaySinh, DiaChi, MaKhuVuc) VALUES  (?,?,?,?,?,?,?,?)";
		int result = 0;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, tenKhachHang);
			pst.setString(2, email);
			pst.setString(3, matKhau);
			pst.setInt(4, gioiTinh);
			pst.setString(5, soDienThoai);
			pst.setString(6, ngaySinh);
			pst.setString(7, diaChi);
			pst.setString(8, maKhuVuc);
			result = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (result == 0) {
			return false;
		}
		return true;
	}

	public int tinhSoLuongKhachHang() {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT COUNT (MaKhachHang) FROM KhachHang ";
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

	public String tenKhachHang(String email) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT TenKhachHang FROM KhachHang WHERE Email = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tenKhachHang = null;
		try {
			while (rs.next()) {
				tenKhachHang = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tenKhachHang;
	}

	public KhachHang thongTinKhachHang(String email) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT * FROM KhachHang INNER JOIN KhuVuc ON KhachHang.MaKhuVuc = KhuVuc.MaKhuVuc WHERE Email = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		KhachHang khachHang = new KhachHang();
		try {
			while (rs.next()) {
				khachHang.setMaKhachHang(rs.getString("MaKhachHang"));
				khachHang.setTenKhachHang(rs.getString("TenKhachHang"));
				khachHang.setDiaChi(rs.getString("DiaChi"));
				khachHang.setGioiTinh(rs.getInt("GioiTinh"));
				khachHang.setNgaySinh(rs.getString("NgaySinh"));
				khachHang.setSoDienThoai(rs.getString("SoDienThoai"));
				khachHang.setMaKhuVuc(rs.getString("MaKhuVuc"));
				khachHang.setTenKhuVuc(rs.getString("TenKhuVuc"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return khachHang;
	}

	public String maKhachHang(String email) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT * FROM KhachHang WHERE Email = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String maKH = null;
		try {
			while (rs.next()) {
				maKH = rs.getString("MaKhachHang");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return maKH;
	}

	public ArrayList<KhachHang> hienThiDanhSachKhachHang() {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT  * FROM KhachHang LEFT JOIN KhuVuc ON KhachHang.MaKhuVuc = KhuVuc.MaKhuVuc";
		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<KhachHang> danhSachKhachHang = new ArrayList<>();
		KhachHang khachHang;
		try {
			while (rs.next()) {
				khachHang = new KhachHang();
				khachHang.setMaKhachHang(rs.getString("MaKhachHang"));
				khachHang.setTenKhachHang(rs.getString("TenKhachHang"));
				khachHang.setEmail(rs.getString("Email"));
				khachHang.setMatKhau(rs.getString("MatKhau"));
				khachHang.setGioiTinh(rs.getInt("GioiTinh"));
				khachHang.setSoDienThoai(rs.getString("SoDienThoai"));
				khachHang.setNgaySinh(rs.getString("NgaySinh"));
				khachHang.setDiaChi(rs.getString("DiaChi"));
				khachHang.setTenKhuVuc(rs.getString("TenKhuVuc"));
				danhSachKhachHang.add(khachHang);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return danhSachKhachHang;

	}

	public void suaKhachHang(KhachHang khachHang) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "UPDATE KhachHang"
				+ "SET  TenKhachHang = ?, Email = ?, MatKhau = ?, GioiTinh = ?, SoDienThoai = ?, NgaySinh = ?, DiaChi = ?, MaKhuVuc = ? where MaKhachHang = ?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, khachHang.getTenKhachHang());
			pst.setString(2, khachHang.getEmail());
			pst.setString(3, khachHang.getMatKhau());
			pst.setInt(4, khachHang.getGioiTinh());
			pst.setString(5, khachHang.getSoDienThoai());
			pst.setString(6, khachHang.getNgaySinh());
			pst.setString(7, khachHang.getDiaChi());
			pst.setString(8, khachHang.getMaKhuVuc());
			pst.setString(9, khachHang.getMaKhachHang());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public KhachHang hienThiThongTinKhachHang(String maKhachHang) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT KhuVuc.MaKhuVuc as MaKhuVuc, KhuVuc.TenKhuVuc, KhachHang.MaKhachHang, KhachHang.TenKhachHang, KhachHang.Email, KhachHang.MatKhau, KhachHang.GioiTinh, KhachHang.SoDienThoai, KhachHang.NgaySinh, KhachHang.DiaChi FROM   KhachHang INNER JOIN  KhuVuc ON KhachHang.MaKhuVuc = KhuVuc.MaKhuVuc WHERE MaKhachHang = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maKhachHang);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		KhachHang khachHang = new KhachHang();

		try {
			while (rs.next()) {
				khachHang.setMaKhachHang(rs.getString("MaKhachHang"));
				khachHang.setTenKhachHang(rs.getString("TenKhachHang"));
				khachHang.setEmail(rs.getString("Email"));
				khachHang.setMatKhau(rs.getString("MatKhau"));
				khachHang.setGioiTinh(rs.getInt("GioiTinh"));
				khachHang.setSoDienThoai(rs.getString("SoDienThoai"));
				khachHang.setNgaySinh(rs.getString("NgaySinh"));
				khachHang.setDiaChi(rs.getString("DiaChi"));
				khachHang.setTenKhuVuc(rs.getString("TenKhuVuc"));
				khachHang.setMaKhuVuc(rs.getString("MaKhuVuc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("abc");
		return khachHang;

	}

	public void xoaKhachHang(String maKhachHang) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "DELETE FROM KhachHang WHERE MaKhachHang = ?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, maKhachHang);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public boolean kiemTraTaiKhoan(String email) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "SELECT * FROM KhachHang WHERE Email = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
	
	public int diemTichLuy(String email) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "  SELECT SUM(TongTienTT) FROM HoaDon INNER JOIN KhachHang ON HoaDon.MaKhachHang = KhachHang.MaKhachHang WHERE KhachHang.MaKhachHang = ? GROUP BY TongTienTT";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int diem = 0;
		try {
			while(rs.next()) {
				diem = (int) (rs.getInt(1) * 0.1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return diem;
	}
	
	public void capNhatDiemTichLuy(String email, int diemTichLuy) {
		Connection conn = ConnectionWithSql.getConnect();
		String sql = "  UPDATE KhachHang SET DiemTichLuy = ? where Email = ? ";
		
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(2, email);
			pst.setInt(1, diemTichLuy);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
