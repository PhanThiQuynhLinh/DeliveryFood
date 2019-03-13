package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.MonAn;

public class DanhSachMonAnForm extends ActionForm{
	private ArrayList<MonAn> danhSachMonAn;

	public ArrayList<MonAn> getDanhSachMonAn() {
		return danhSachMonAn;
	}

	public void setDanhSachMonAn(ArrayList<MonAn> danhSachMonAn) {
		this.danhSachMonAn = danhSachMonAn;
	}
	
	

}
