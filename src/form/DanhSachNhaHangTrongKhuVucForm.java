package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.LoaiNhaHang;
import model.bean.NhaHang;

public class DanhSachNhaHangTrongKhuVucForm extends ActionForm {
	private ArrayList<NhaHang> danhSachNhaHang;
	private ArrayList<LoaiNhaHang> danhSachLoaiNhaHang;
	private int soLuongNhaHang;
	private String tenKhuVuc;
	private String maKhuVuc;
	private String maLoaiNhaHang;
	private String tenLoaiNhaHang;
	private String email;
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMaLoaiNhaHang() {
		return maLoaiNhaHang;
	}

	public void setMaLoaiNhaHang(String maLoaiNhaHang) {
		this.maLoaiNhaHang = maLoaiNhaHang;
	}

	public String getTenLoaiNhaHang() {
		return tenLoaiNhaHang;
	}

	public void setTenLoaiNhaHang(String tenLoaiNhaHang) {
		this.tenLoaiNhaHang = tenLoaiNhaHang;
	}

	public String getMaKhuVuc() {
		return maKhuVuc;
	}

	public void setMaKhuVuc(String maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}

	public ArrayList<NhaHang> getDanhSachNhaHang() {
		return danhSachNhaHang;
	}

	public void setDanhSachNhaHang(ArrayList<NhaHang> danhSachNhaHang) {
		this.danhSachNhaHang = danhSachNhaHang;
	}

	public ArrayList<LoaiNhaHang> getDanhSachLoaiNhaHang() {
		return danhSachLoaiNhaHang;
	}

	public void setDanhSachLoaiNhaHang(ArrayList<LoaiNhaHang> danhSachLoaiNhaHang) {
		this.danhSachLoaiNhaHang = danhSachLoaiNhaHang;
	}

	public int getSoLuongNhaHang() {
		return soLuongNhaHang;
	}

	public void setSoLuongNhaHang(int soLuongNhaHang) {
		this.soLuongNhaHang = soLuongNhaHang;
	}

	public String getTenKhuVuc() {
		return tenKhuVuc;
	}

	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}

}
