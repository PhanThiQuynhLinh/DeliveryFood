package model.bean;

public class GioHang {
	private String maMonAn;
	private String tenMonAn;
	private int giaBan;
	private int soLuong;
	private int tongTien;
	private int tongTienTT;
	
	public int getTongTienTT() {
		return tongTienTT;
	}

	public void setTongTienTT(int tongTienTT) {
		this.tongTienTT = tongTienTT;
	}
	
	
	public GioHang(String maMonAn, int soLuong, int giaBan) {
		super();
		this.maMonAn = maMonAn;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
	}

	public GioHang() {
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

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getTongTien() {
		return tongTien;
	}

}
