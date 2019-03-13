package model.bo;

import java.util.ArrayList;

import model.bean.KhachHang;
import model.dao.KhachHangDao;

public class KhachHangBo {
	KhachHangDao khachHangDao = new KhachHangDao();
	
	public boolean dangNhap(String email, String matKhau) {
		return khachHangDao.dangNhap(email, matKhau);
	}
	
	public boolean dangKy(String tenKhachHang, String email, String soDienThoai, int gioiTinh, String matKhau, String ngaySinh, String diaChi, String maKhuVuc) {
		return khachHangDao.dangKy(tenKhachHang, email, soDienThoai, gioiTinh, matKhau, ngaySinh, diaChi, maKhuVuc);
	}
	
	public int tinhSoLuongKhachHang() {
		return khachHangDao.tinhSoLuongKhachHang();
	}
	public String tenKhachHang(String email) {
		return khachHangDao.tenKhachHang(email);
	}
	
	public KhachHang thongTinKhachHang(String email) {
		return khachHangDao.thongTinKhachHang(email);
	}
	
	public String maKhachHang(String email) {
		return khachHangDao.maKhachHang(email);
	}
	
	public ArrayList<KhachHang> hienThiDanhSachKhachHang() {
		return khachHangDao.hienThiDanhSachKhachHang();
	}
	
	public void suaKhachHang(KhachHang khachHang)  {
		khachHangDao.suaKhachHang(khachHang);
	}
	
	public KhachHang hienThiThongTinKhachHang(String maKhachHang){
		return khachHangDao.hienThiThongTinKhachHang(maKhachHang);
	}
	
	public void xoaKhachHang(String maKhachHang)  {
		khachHangDao.xoaKhachHang(maKhachHang);
	}
	
	public boolean kiemTraTaiKhoan(String email) {
		return khachHangDao.kiemTraTaiKhoan(email);
	}
	
	public int diemTichLuy(String email) {
		return khachHangDao.diemTichLuy(email);
	}
	
	public void capNhatDiemTichLuy(String email, int diemTichLuy) {
		khachHangDao.capNhatDiemTichLuy(email, diemTichLuy);
	}
}
