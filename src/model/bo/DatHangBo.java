package model.bo;

import model.dao.DatHangDao;

public class DatHangBo {
	
	DatHangDao datHangDao = new DatHangDao();
	
	public void themDonHang(String tenNguoiNhan, String ngayXuatHoaDon, String soDienThoai, String diaChi, String tinhTrang,
			int tongTienTT, String maKachHang,String id) {
		 datHangDao.themDonHang(tenNguoiNhan, ngayXuatHoaDon, soDienThoai, diaChi, tinhTrang, tongTienTT, maKachHang, id);
	}
	
	public void themChiTietDonHang(int maHoaDon,String maMonAn, int soLuong) {
		datHangDao.themChiTietDonHang( maHoaDon, maMonAn,soLuong);
	}
	
	public int maHoaDon(String id) {
		return datHangDao.maHoaDon(id);
	}
}
