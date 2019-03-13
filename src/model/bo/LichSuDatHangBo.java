package model.bo;

import java.util.ArrayList;

import model.bean.LichSuDatHang;
import model.dao.LichSuDatHangDao;

public class LichSuDatHangBo {
	LichSuDatHangDao lichSuDatHangDao = new LichSuDatHangDao();
	public ArrayList<LichSuDatHang> danhSachLichSuDatHangCuaKhachHang(String maKhachHang){
		return lichSuDatHangDao.danhSachLichSuDatHangCuaKhachHang(maKhachHang);
	}
}
