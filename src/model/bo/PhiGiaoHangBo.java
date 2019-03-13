package model.bo;

import model.dao.PhiGiaoHangDao;

public class PhiGiaoHangBo {
	PhiGiaoHangDao phiGiaoHangDao = new PhiGiaoHangDao();
	
	public int phiGiaoHangCuaNhaHangTrongKhuVuc(String maNhaHang, String maKhuVuc) {
		return phiGiaoHangDao.phiGiaoHangCuaNhaHangTrongKhuVuc(maNhaHang, maKhuVuc);
	}
}
