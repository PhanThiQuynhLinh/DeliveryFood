package model.bean;

public class KhuVuc {
	private String maKhuVuc;
	private String tenKhuVuc;
	private int phiGiaoHang;
	private int khoangThoiGianShip;
	
	
	public KhuVuc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhuVuc(String maKhuVuc, String tenKhuVuc, int phiGiaoHang, int khoangThoiGianShip) {
		super();
		this.maKhuVuc = maKhuVuc;
		this.tenKhuVuc = tenKhuVuc;
		this.phiGiaoHang = phiGiaoHang;
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
	public int getPhiGiaoHang() {
		return phiGiaoHang;
	}
	public void setPhiGiaoHang(int phiGiaoHang) {
		this.phiGiaoHang = phiGiaoHang;
	}
	public int getKhoangThoiGianShip() {
		return khoangThoiGianShip;
	}
	public void setKhoangThoiGianShip(int khoangThoiGianShip) {
		this.khoangThoiGianShip = khoangThoiGianShip;
	}
	
	
	
}
