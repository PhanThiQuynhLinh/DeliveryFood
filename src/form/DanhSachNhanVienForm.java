package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.NhanVien;

public class DanhSachNhanVienForm  extends ActionForm{
	private ArrayList<NhanVien> danhSachNhanVien;

	public ArrayList<NhanVien> getDanhSachNhanVien() {
		return danhSachNhanVien;
	}

	public void setDanhSachNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
		this.danhSachNhanVien = danhSachNhanVien;
	}
	
	
	

}
