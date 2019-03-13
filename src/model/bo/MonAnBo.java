package model.bo;

import java.util.ArrayList;

import model.bean.MonAn;
import model.dao.MonAnDao;

public class MonAnBo {
	MonAnDao monAnDao = new MonAnDao();

	public int tinhSoLuongMonAn() {
		return monAnDao.tinhSoLuongMonAn();
	}

	public ArrayList<MonAn> danhSachTopMonAnCuaNhaHang(String maNhaHang) {
		return monAnDao.danhSachTopMonAnCuaNhaHang(maNhaHang);
	}

	public ArrayList<MonAn> danhSachMonAnCuaNhaHang(String maNhaHang) {
		return monAnDao.danhSachMonAnCuaNhaHang(maNhaHang);
	}

	public ArrayList<MonAn> danhSachMonAnTheoLoai(String maNhaHang, String maLoaiMonAn) {
		return monAnDao.danhSachMonAnTheoLoai(maNhaHang, maLoaiMonAn);
	}
	
	public MonAn hienThiMonAn(String maMonAn) {
		return monAnDao.hienThiMonAn(maMonAn);
	}
	
	public int hienThiGiaBanCuaMonAn(String maMonAn) {
		return monAnDao.hienThiGiaBanCuaMonAn(maMonAn);
	}
	public ArrayList<MonAn> hienThiDanhSachMonAn(){
		return monAnDao.hienThiDanhSachMonAn();
	}
}
