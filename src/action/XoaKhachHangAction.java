package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.KhachHangForm;
import model.bo.KhachHangBo;

public class XoaKhachHangAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		KhachHangForm khachHangForm = (KhachHangForm) form;
		
		KhachHangBo khachHangBo = new KhachHangBo();
		khachHangBo.xoaKhachHang(khachHangForm.getMaKhachHang());
		return mapping.findForward("xoaKhachHangThanhCong");

	}
	

}
