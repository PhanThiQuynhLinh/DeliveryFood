package model.bo;

import java.util.ArrayList;

import model.bean.HoaDon;
import model.dao.HoaDonDao;

public class HoaDonBo {
	HoaDonDao hoaDonDao = new HoaDonDao();
	
	public ArrayList<HoaDon> danhSachHoaDon(String maNhaHang){
		return hoaDonDao.danhSachHoaDon(maNhaHang);
	}
	
	public void capNhatHoaDon(String maDonHang) {
		hoaDonDao.capNhatHoaDon(maDonHang);
	}
}
