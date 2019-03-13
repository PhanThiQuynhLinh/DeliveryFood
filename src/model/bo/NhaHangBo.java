package model.bo;

import java.util.ArrayList;

import model.bean.NhaHang;
import model.dao.NhaHangDao;

public class NhaHangBo {
	NhaHangDao nhaHangDao = new NhaHangDao();
	
	public int tinhSoLuongNhaHang() {
		return nhaHangDao.tinhSoLuongNhaHang();
	}
	
	public int tongSoNhaHangTrongKhuVuc(String maKhuVuc) {
		return nhaHangDao.tongSoNhaHangTrongKhuVuc(maKhuVuc);
	}
	
	public ArrayList<NhaHang> danhSachNhaHangTrongKhuVuc(String maKhuVuc){
		return nhaHangDao.danhSachNhaHangTrongKhuVuc(maKhuVuc);
	}
	
	public ArrayList<NhaHang> danhSachNhaHangTrongKhuVucTheoLoai(String maKhuVuc, String maLoaiNhaHang){
		return nhaHangDao.danhSachNhaHangTrongKhuVucTheoLoai(maKhuVuc, maLoaiNhaHang);
	}
	
	public String hienThiTenNhaHang(String maNhaHang) {
		return nhaHangDao.hienThiTenNhaHang(maNhaHang);
	}
	
	public ArrayList<NhaHang> hienThiDanhSachNhaHang() {
		return nhaHangDao.hienThiDanhSachNhaHang();
	}
	
	public void xoaNhaHang(String maNhaHang) {
		nhaHangDao.xoaNhaHang(maNhaHang);
	}
	
	
	public String maNhaHang(String email) {
		return nhaHangDao.maNhaHang(email);
	}
}
