package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachNhanVienForm;
import model.bean.NhanVien;
import model.bo.NhanVienBo;

public class DanhSachNhanVienAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DanhSachNhanVienForm danhSachNhanVienForm = (DanhSachNhanVienForm) form;
		NhanVienBo nhanVienBo = new NhanVienBo();
		ArrayList<NhanVien> danhSachNhanVien = nhanVienBo.hienThiDanhSachNhanVien();
		danhSachNhanVienForm.setDanhSachNhanVien(danhSachNhanVien);
		return mapping.findForward("danhSachNhanVien");
	}
	

}
