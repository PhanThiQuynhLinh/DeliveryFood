package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.GioHangForm;
import model.bean.GioHang;
import model.bean.MonAn;
import model.bo.GioHangBo;
import model.bo.MonAnBo;

public class GioHangAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		GioHangForm gioHangForm = (GioHangForm) form;
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("emailKhachHang");
		MonAnBo monAnBo = new MonAnBo();
		
		
		String maMonAn = gioHangForm.getMaMonAn();
		String command = gioHangForm.getCommand();
		if("them".equals(command)) {
			if(session.getAttribute("giohang")==null) {
				GioHangBo gioHangBo = new GioHangBo();
				session.setAttribute("giohang", gioHangBo);
			}
			GioHangBo gioHangBo = (GioHangBo) session.getAttribute("giohang");
			MonAn monAn = monAnBo.hienThiMonAn(maMonAn);
			gioHangBo.them(maMonAn, 1, monAnBo.hienThiGiaBanCuaMonAn(maMonAn) );
	
			session.setAttribute("giohang", gioHangBo);
		}else if("xoa".equals(command)) {
			GioHangBo gioHangBo = (GioHangBo) session.getAttribute("giohang");
			gioHangBo.xoa(maMonAn);
			
		}else if("xem".equals(command)) {
			return mapping.findForward("gioHangTrong");
		}
		
		GioHangBo gb = (GioHangBo)session.getAttribute("giohang");
		return mapping.findForward("hienThiGioHang");
		
		
		
	}
}
