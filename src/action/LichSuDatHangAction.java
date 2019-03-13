package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.LichSuDatHangForm;
import model.bo.LichSuDatHangBo;

public class LichSuDatHangAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LichSuDatHangForm lichSuDatHangForm = (LichSuDatHangForm) form;
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("emailKhachHang");
		LichSuDatHangBo lichSuDatHangBo = new LichSuDatHangBo();
		System.out.println(email + "nè");
		lichSuDatHangForm.setDanhSachLichSuDatHang(lichSuDatHangBo.danhSachLichSuDatHangCuaKhachHang(email));
		return mapping.findForward("lichSuDatHang");
	}
}
