package form;

import java.util.ArrayList;

import org.apache.struts.taglib.html.SubmitTag;

import model.bean.LoaiMonAn;
import model.bean.MonAn;

public class MonAnForm {
	private String maMonAn;
	private String tenMonAn;
	private double giaBan;
	private String hinhAnh;
	private int soLuong;
	private String moTa;
	private String maLoaiMonAn;
	private String tenLoaiMonAn;
	private String submit;
	private MonAn monAn;
	private ArrayList<LoaiMonAn> dsLoaiMonAn;
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
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
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
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public MonAn getMonAn() {
		return monAn;
	}
	public void setMonAn(MonAn monAn) {
		this.monAn = monAn;
	}
	public ArrayList<LoaiMonAn> getDsLoaiMonAn() {
		return dsLoaiMonAn;
	}
	public void setDsLoaiMonAn(ArrayList<LoaiMonAn> dsLoaiMonAn) {
		this.dsLoaiMonAn = dsLoaiMonAn;
	}
	
	

}
