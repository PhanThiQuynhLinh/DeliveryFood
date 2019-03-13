package model.bean;

public class LoaiNhaHang {
	private String maLoaiNhaHang;
	private String tenLoaiNhaHang;

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

	public LoaiNhaHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoaiNhaHang(String maLoaiNhaHang, String tenLoaiNhaHang) {
		super();
		this.maLoaiNhaHang = maLoaiNhaHang;
		this.tenLoaiNhaHang = tenLoaiNhaHang;
	}

	


}
