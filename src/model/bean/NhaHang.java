package model.bean;

import java.util.ArrayList;

public class NhaHang {
	private String maNhaHang;
	private String tenNhaHang;
	private String email;
	private String matKhau;
	private String soDienThoai;
	private String diaChi;
	private String hinhAnhNhaHang;
	private String moTa;
	private String donHangToiThieu;
	private String maLoaiNhaHang;
	private String tenLoaiNhaHang;
	private String maKhuVuc;
	private String tenKhuVuc;
	private String phiGiaoHang;
	private int khoangThoiGianShip;
	private int soLuongMonAn;
	
	
	public int getSoLuongMonAn() {
		return soLuongMonAn;
	}

	public void setSoLuongMonAn(int soLuongMonAn) {
		this.soLuongMonAn = soLuongMonAn;
	}

	public NhaHang(String maNhaHang, String tenNhaHang, String email, String matKhau, String soDienThoai, String diaChi,
			String hinhAnh, String moTa, String donHangToiThieu, String maLoaiNhaHang, String tenLoaiNhaHang,
			String maKhuVuc, String tenKhuVuc, String phiGiaoHang, int khoangThoiGianShip) {
		super();
		this.maNhaHang = maNhaHang;
		this.tenNhaHang = tenNhaHang;
		this.email = email;
		this.matKhau = matKhau;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.hinhAnhNhaHang = hinhAnhNhaHang;
		this.moTa = moTa;
		this.donHangToiThieu = donHangToiThieu;
		this.maLoaiNhaHang = maLoaiNhaHang;
		this.tenLoaiNhaHang = tenLoaiNhaHang;
		this.maKhuVuc = maKhuVuc;
		this.tenKhuVuc = tenKhuVuc;
		this.phiGiaoHang = phiGiaoHang;
		this.khoangThoiGianShip = khoangThoiGianShip;
	}

	public NhaHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getHinhAnhNhaHang() {
		return hinhAnhNhaHang;
	}

	public void setHinhAnhNhaHang(String hinhAnhNhaHang) {
		this.hinhAnhNhaHang = hinhAnhNhaHang;
	}

	public String getPhiGiaoHang() {
		return phiGiaoHang;
	}

	public void setPhiGiaoHang(String phiGiaoHang) {
		this.phiGiaoHang = phiGiaoHang;
	}

	public void setDonHangToiThieu(String donHangToiThieu) {
		this.donHangToiThieu = donHangToiThieu;
	}

	public int getKhoangThoiGianShip() {
		return khoangThoiGianShip;
	}

	public void setKhoangThoiGianShip(int khoangThoiGianShip) {
		this.khoangThoiGianShip = khoangThoiGianShip;
	}

	public String getMaKhuVuc() {
		return maKhuVuc;
	}

	public void setMaKhuVuc(String maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}

	public String getTenKhuVuc() {
		return tenKhuVuc;
	}

	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}

	private ArrayList<HinhThucThanhToan> listHTTT;

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

	public String gethinhAnhNhaHang() {
		return hinhAnhNhaHang;
	}

	public void sethinhAnhNhaHang(String hinhAnhNhaHang) {
		this.hinhAnhNhaHang = hinhAnhNhaHang;
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

	public ArrayList<HinhThucThanhToan> getListHTTT() {
		return listHTTT;
	}

	public void setListHTTT(ArrayList<HinhThucThanhToan> listHTTT) {
		this.listHTTT = listHTTT;
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
