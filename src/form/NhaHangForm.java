package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.NhaHang;

public class NhaHangForm extends ActionForm {
	private String maNhaHang;
	private String tenNhaHang;
	private String email;
	private String matKhau;
	private String soDienThoai;
	private String diaChi;
	private String hinhAnh;
	private String moTa;
	private String donHangToiThieu;
	private String maLoaiNhaHang;
	private String tenLoaiNhaHang;
	private NhaHang nhaHang;
	private String submit;

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public NhaHang getNhaHang() {
		return nhaHang;
	}

	public void setNhaHang(NhaHang nhaHang) {
		this.nhaHang = nhaHang;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getDonHangToiThieu() {
		return donHangToiThieu;
	}

	public void setDonHangToiThieu(String donHangToiThieu) {
		this.donHangToiThieu = donHangToiThieu;
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

}
