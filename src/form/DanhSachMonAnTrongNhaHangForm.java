package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.LoaiMonAn;
import model.bean.MonAn;

public class DanhSachMonAnTrongNhaHangForm extends ActionForm {
	private ArrayList<MonAn> danhSachMonAn;
	private ArrayList<LoaiMonAn> danhSachLoaiMonAn;
	private String maLoaiMonAn;
	private String tenLoaiMonAn;
	private String maMonAn;
	private String tenMonAn;
	private int giaBan;
	private String donHang;
	private String hinhAnh;
	private String moTa;
	private int soLuongDatHang;
	private String tenNhaHang;
	private String maNhaHang;
	private ArrayList<MonAn> danhSachTopThucAn;
	private String chonLoai;
	private String maKhuVuc;
	
	
	

	public String getChonLoai() {
		return chonLoai;
	}

	public void setChonLoai(String chonLoai) {
		this.chonLoai = chonLoai;
	}

	public String getMaKhuVuc() {
		return maKhuVuc;
	}

	public void setMaKhuVuc(String maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}

	public String getTenNhaHang() {
		return tenNhaHang;
	}

	public void setTenNhaHang(String tenNhaHang) {
		this.tenNhaHang = tenNhaHang;
	}

	public String getMaNhaHang() {
		return maNhaHang;
	}

	public void setMaNhaHang(String maNhaHang) {
		this.maNhaHang = maNhaHang;
	}

	public ArrayList<MonAn> getDanhSachTopThucAn() {
		return danhSachTopThucAn;
	}

	public void setDanhSachTopThucAn(ArrayList<MonAn> danhSachTopThucAn) {
		this.danhSachTopThucAn = danhSachTopThucAn;
	}

	public int getSoLuongDatHang() {
		return soLuongDatHang;
	}

	public void setSoLuongDatHang(int soLuongDatHang) {
		this.soLuongDatHang = soLuongDatHang;
	}

	public ArrayList<MonAn> getDanhSachMonAn() {
		return danhSachMonAn;
	}

	public void setDanhSachMonAn(ArrayList<MonAn> danhSachMonAn) {
		this.danhSachMonAn = danhSachMonAn;
	}

	public ArrayList<LoaiMonAn> getDanhSachLoaiMonAn() {
		return danhSachLoaiMonAn;
	}

	public void setDanhSachLoaiMonAn(ArrayList<LoaiMonAn> danhSachLoaiMonAn) {
		this.danhSachLoaiMonAn = danhSachLoaiMonAn;
	}

	public String getMaLoaiMonAn() {
		return maLoaiMonAn;
	}

	public void setMaLoaiMonAn(String maLoaiMonAn) {
		this.maLoaiMonAn = maLoaiMonAn;
	}

	public String getTenLoaiMonAn() {
		return tenLoaiMonAn;
	}

	public void setTenLoaiMonAn(String tenLoaiMonAn) {
		this.tenLoaiMonAn = tenLoaiMonAn;
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

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	public String getDonHang() {
		return donHang;
	}

	public void setDonHang(String donHang) {
		this.donHang = donHang;
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

}
