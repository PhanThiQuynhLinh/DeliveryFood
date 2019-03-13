package model.bo;

import java.util.ArrayList;

import model.bean.LoaiNhaHang;
import model.dao.LoaiNhaHangDao;

public class LoaiNhaHangBo {
	LoaiNhaHangDao loaiNhaHangDao = new LoaiNhaHangDao();
	
	public ArrayList<LoaiNhaHang> hienThiDanhSachLoaiNhaHang(){
		return loaiNhaHangDao.hienThiDanhSachLoaiNhaHang();
	}
	
	public ArrayList<LoaiNhaHang> hienThiDanhSachLoaiNhaHangTrongKhuVuc(String maKhuVuc){
		return loaiNhaHangDao.hienThiDanhSachLoaiNhaHangTrongKhuVuc(maKhuVuc);
	}
}
