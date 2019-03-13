package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.NhanVien;
import model.dao.NhanVienDao;

public class NhanVienBo {
	NhanVienDao nhanVienDao = new NhanVienDao();
	public ArrayList<NhanVien> hienThiDanhSachNhanVien () throws SQLException{
		return nhanVienDao.hienThiDanhSachNhanVien();
	}
	public NhanVien hienThiThongTinNhanVien(String maNhanVien) throws SQLException{
		return nhanVienDao.hienThiThongTinNhanVien(maNhanVien);
	}
	public void xoaNhanVien(String maNhanVien) throws SQLException{
		nhanVienDao.xoaNhanVien(maNhanVien);
	}
	public void suaNhanVien(NhanVien nhanVien) throws SQLException {
		nhanVienDao.suaNhanVien(nhanVien);
	}

}
