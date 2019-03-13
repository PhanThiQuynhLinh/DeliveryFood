package model.bo;

import java.util.ArrayList;

import model.bean.LoaiMonAn;
import model.dao.LoaiMonAnDao;

public class LoaiMonAnBo {
	LoaiMonAnDao loaiMonAnDao = new LoaiMonAnDao();
	
	public ArrayList<LoaiMonAn> danhSachLoaiMonAn(String maNhaHang){
		return loaiMonAnDao.danhSachLoaiMonAn(maNhaHang);
	}
}
