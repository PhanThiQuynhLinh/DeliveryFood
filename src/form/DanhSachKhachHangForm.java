package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.KhachHang;

public class DanhSachKhachHangForm extends ActionForm{
	private ArrayList<KhachHang> danhSachKhachHang;
	
	public ArrayList<KhachHang> getDanhSachKhachHang(){
		return danhSachKhachHang;
	}
	
	public void setDanhSachKhachHang(ArrayList<KhachHang> danhSachKhachHang) {
		this.danhSachKhachHang = danhSachKhachHang;
	}

	
	

}
