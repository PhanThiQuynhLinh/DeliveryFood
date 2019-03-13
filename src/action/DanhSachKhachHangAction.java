package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachKhachHangForm;
import model.bean.KhachHang;
import model.bo.KhachHangBo;

public class DanhSachKhachHangAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DanhSachKhachHangForm danhSachKhachHangForm = (DanhSachKhachHangForm) form;
		KhachHangBo khachHangBo = new KhachHangBo();
		ArrayList<KhachHang> danhSachKhachHang = khachHangBo.hienThiDanhSachKhachHang();
		danhSachKhachHangForm.setDanhSachKhachHang(danhSachKhachHang);
		return mapping.findForward("danhSachKhachHang");
	}
	

}
