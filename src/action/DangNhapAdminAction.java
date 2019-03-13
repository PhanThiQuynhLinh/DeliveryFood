package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DangNhapAdminForm;
import model.bo.AdminBo;

public class DangNhapAdminAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DangNhapAdminForm adminForm = (DangNhapAdminForm) form;
		String email = adminForm.getEmail();
		System.out.println(email);
		String matKhau = adminForm.getMatKhau();
		System.out.println(matKhau);
		AdminBo adminBo = new AdminBo();
		
		if(adminBo.checkLogin(email, matKhau)) {
			return  mapping.findForward("thanhCong");
		}else {
			adminForm.setThongBao("Email hoặc Mật Khẩu không hợp lệ. Vui kiểm tra lại!");
			return mapping.findForward("thatBai");
		}
	}
}
