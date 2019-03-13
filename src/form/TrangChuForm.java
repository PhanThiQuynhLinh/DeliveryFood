package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.KhachHang;
import model.bean.KhuVuc;
import model.bean.LichSuDatHang;

public class TrangChuForm extends ActionForm {
	private ArrayList<KhuVuc> danhSachKhuVuc;
	private String maKhuVuc;
	private String tenKhuVuc;
	private int soLuongNhaHang;
	private int soLuongMonAn;
	private int soLuongKhachHang;
	private String submit;
	private String email;
	private String tenKhachHang;
	private String soDienThoai;
	private int gioiTinh;
	private String diaChi;
	private String ngaySinh;
	private KhachHang khachHang;
	private String themGioHang;
	private int diemTichLuy;

	public int getDiemTichLuy() {
		return diemTichLuy;
	}

	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}

	public String getThemGioHang() {
		return themGioHang;
	}

	public void setThemGioHang(String themGioHang) {
		this.themGioHang = themGioHang;
	}

	private ArrayList<LichSuDatHang> danhSachLichSuDatHang;

	public ArrayList<LichSuDatHang> getDanhSachLichSuDatHang() {
		return danhSachLichSuDatHang;
	}

	public void setDanhSachLichSuDatHang(ArrayList<LichSuDatHang> danhSachLichSuDatHang) {
		this.danhSachLichSuDatHang = danhSachLichSuDatHang;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public String getTenKhuVuc() {
		return tenKhuVuc;
	}

	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}

	public String getMaKhuVuc() {
		return maKhuVuc;
	}

	public void setMaKhuVuc(String maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}

	public ArrayList<KhuVuc> getDanhSachKhuVuc() {
		return danhSachKhuVuc;
	}

	public void setDanhSachKhuVuc(ArrayList<KhuVuc> danhSachKhuVuc) {
		this.danhSachKhuVuc = danhSachKhuVuc;
	}

	public int getSoLuongNhaHang() {
		return soLuongNhaHang;
	}

	public void setSoLuongNhaHang(int soLuongNhaHang) {
		this.soLuongNhaHang = soLuongNhaHang;
	}

	public int getSoLuongMonAn() {
		return soLuongMonAn;
	}

	public void setSoLuongMonAn(int soLuongMonAn) {
		this.soLuongMonAn = soLuongMonAn;
	}

	public int getSoLuongKhachHang() {
		return soLuongKhachHang;
	}

	public void setSoLuongKhachHang(int soLuongKhachHang) {
		this.soLuongKhachHang = soLuongKhachHang;
	}

}
