package model.bo;

import java.util.ArrayList;

import model.bean.KhuVuc;
import model.dao.KhuVucDao;

public class KhuVucBo {
	KhuVucDao khuVucDao = new KhuVucDao();

	public ArrayList<KhuVuc> hienThiDanhSachKhuVuc() {
		return khuVucDao.hienThiDanhSachKhuVuc();
	}
	
	public String hienThiTenKhuVuc(String maKhuVuc) {
		 return khuVucDao.hienThiTenKhuVuc(maKhuVuc);
	 }
}
