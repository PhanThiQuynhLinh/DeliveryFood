package form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.StringProcess;

public class DangNhapKhachHangForm extends ActionForm {
	private String email;
	private String matKhau;
	private String thongBao;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getThongBao() {
		return thongBao;
	}
	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors=new ActionErrors();
		if(StringProcess.notVaild(email)){
			actionErrors.add("emailDangNhapKhachHangError",new ActionMessage("error.emailDangNhapKhachHang"));
		}
		if(StringProcess.notVaild(matKhau)){
			actionErrors.add("matKhauDangNhapKhachHangError",new ActionMessage("error.matKhauDangNhapKhachHang"));
		}
		return actionErrors;
	}
}
