package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DangNhapKhachHangForm;
import model.bo.KhachHangBo;

public class DangNhapKhachHangAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DangNhapKhachHangForm dangNhapKhachHangForm = (DangNhapKhachHangForm) form;
		String email = dangNhapKhachHangForm.getEmail();
		String matKhau = dangNhapKhachHangForm.getMatKhau();
		
		KhachHangBo khachHangBo = new KhachHangBo();
		if(khachHangBo.dangNhap(email, matKhau)) {
			HttpSession session = request.getSession();
			session.setAttribute("emailKhachHang", email);
			System.out.println("Đăng nhập thành công");
			return mapping.findForward("dangNhapThanhCong");
		}else {
			System.out.println("Aaaa");
			dangNhapKhachHangForm.setThongBao("Email hoặc mật khẩu của bạn không hợp lệ. Vui lòng nhập lại!");
			return mapping.findForward("dangNhapThatBai");
		}
	}
}
