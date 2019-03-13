package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.NhaHang;

public class DanhSachNhaHangForm extends ActionForm {
	private ArrayList<NhaHang> danhSachNhaHang;

	public ArrayList<NhaHang> getDanhSachNhaHang() {
		return danhSachNhaHang;
	}

	public void setDanhSachNhaHang(ArrayList<NhaHang> danhSachNhaHang) {
		this.danhSachNhaHang = danhSachNhaHang;
	}
	
	
}
