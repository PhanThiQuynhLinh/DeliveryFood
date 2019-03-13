package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import common.StringProcess;
import model.bean.GioHang;
import model.bean.MonAn;

public class DonHangForm extends ActionForm {
	private ArrayList<MonAn> danhSachMonAn;
	private ArrayList<GioHang> danhSachHangTrongGio;
	private String tongTienTT;
	private String tongTien;
	private String phiGiaoHang;
	

	public String getTongTienTT() {
		return tongTienTT;
	}

	public void setTongTienTT(int tongTien, int phiGiaoHang) {
		this.tongTienTT = StringProcess.formatNumber(tongTien + phiGiaoHang);
		System.out.println(tongTienTT);
	}

	public String getTongTien() {
		return tongTien;
	}

	public void setTongTien(String tongTien) {
		this.tongTien = tongTien;
	}

	public String getPhiGiaoHang() {
		return phiGiaoHang;
	}

	public void setPhiGiaoHang(String phiGiaoHang) {
		this.phiGiaoHang = phiGiaoHang;
	}

	public ArrayList<GioHang> getDanhSachHangTrongGio() {
		return danhSachHangTrongGio;
	}

	public void setDanhSachHangTrongGio(ArrayList<GioHang> danhSachHangTrongGio) {
		this.danhSachHangTrongGio = danhSachHangTrongGio;
	}

	public ArrayList<MonAn> getDanhSachMonAn() {
		return danhSachMonAn;
	}

	public void setDanhSachMonAn(ArrayList<MonAn> danhSachMonAn) {
		this.danhSachMonAn = danhSachMonAn;
	}

}
