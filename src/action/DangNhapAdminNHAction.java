package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DangNhapAdminNHForm;
import model.bo.AdminNHBo;

public class DangNhapAdminNHAction  extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
			DangNhapAdminNHForm adminNHForm = (DangNhapAdminNHForm) form;
			String email = adminNHForm.getEmail();
			System.out.println(email);
			String matKhau = adminNHForm.getMatKhau();
			System.out.println(matKhau);		
			AdminNHBo adminNHBo = new AdminNHBo();
			HttpSession session = request.getSession();
			if(adminNHBo.checkLogin(email, matKhau)) {
				session.setAttribute("emailNhaHang", email);
				return mapping.findForward("thanhCong");
				
			}else {
				adminNHForm.setThongBao("Email hoặc Mật Khẩu không hợp lệ. Vui lòng kiểm tra lại! ");
				return mapping.findForward("thatBai");
			}
		}
}
