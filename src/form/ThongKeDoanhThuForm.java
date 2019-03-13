package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.HoaDon;

public class ThongKeDoanhThuForm extends ActionForm{
	private ArrayList<HoaDon> danhSachHoaDon;
	private String tongTien;
	public ArrayList<HoaDon> getDanhSachHoaDon() {
		return danhSachHoaDon;
	}
	public void setDanhSachHoaDon(ArrayList<HoaDon> danhSachHoaDon) {
		this.danhSachHoaDon = danhSachHoaDon;
	}
	public String getTongTien() {
		return tongTien;
	}
	public void setTongTien(String tongTien) {
		this.tongTien = tongTien;
	}
	
	
}
