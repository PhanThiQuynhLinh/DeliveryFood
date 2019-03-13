package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.HoaDon;

public class QuanLyHoaDonForm extends ActionForm{
	private ArrayList<HoaDon> danhSachHoaDon;
	private String tongTien;
	private String submit;
	private String maHoaDon;
	
	
	
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
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
