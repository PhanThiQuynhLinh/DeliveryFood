package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.LichSuDatHang;

public class LichSuDatHangForm extends ActionForm {
	private String maHoaDon;
	private String maMonAn;
	private String tenMonAn;
	private String ngayMua;
	private String maNhaHang;
	private String tenNhaHang;
	private String tongTien;
	private ArrayList<LichSuDatHang> danhSachLichSuDatHang;

	public ArrayList<LichSuDatHang> getDanhSachLichSuDatHang() {
		return danhSachLichSuDatHang;
	}

	public void setDanhSachLichSuDatHang(ArrayList<LichSuDatHang> danhSachLichSuDatHang) {
		this.danhSachLichSuDatHang = danhSachLichSuDatHang;
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public String getMaMonAn() {
		return maMonAn;
	}

	public void setMaMonAn(String maMonAn) {
		this.maMonAn = maMonAn;
	}

	public String getTenMonAn() {
		return tenMonAn;
	}

	public void setTenMonAn(String tenMonAn) {
		this.tenMonAn = tenMonAn;
	}

	public String getNgayMua() {
		return ngayMua;
	}

	public void setNgayMua(String ngayMua) {
		this.ngayMua = ngayMua;
	}

	public String getMaNhaHang() {
		return maNhaHang;
	}

	public void setMaNhaHang(String maNhaHang) {
		this.maNhaHang = maNhaHang;
	}

	public String getTenNhaHang() {
		return tenNhaHang;
	}

	public void setTenNhaHang(String tenNhaHang) {
		this.tenNhaHang = tenNhaHang;
	}

	public String getTongTien() {
		return tongTien;
	}

	public void setTongTien(String tongTien) {
		this.tongTien = tongTien;
	}

}
