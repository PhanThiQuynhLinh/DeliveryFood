package model.bo;

import java.util.ArrayList;

import model.bean.HoaDon;
import model.dao.ThongKeDao;

public class ThongKeBo {
	
	ThongKeDao thongKeDao = new ThongKeDao();
	public ArrayList<HoaDon> danhSachHoaDon(String maNhaHang){
		return thongKeDao.danhSachHoaDon(maNhaHang);
	}
	
	public int tongHoaDon(String maNhaHang) {
		return thongKeDao.tongHoaDon(maNhaHang);
	}
}
