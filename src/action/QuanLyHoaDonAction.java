package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.QuanLyHoaDonForm;
import model.bo.HoaDonBo;
import model.bo.NhaHangBo;

public class QuanLyHoaDonAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		NhaHangBo nhaHangBo = new NhaHangBo();
		HoaDonBo hoaDonBo = new HoaDonBo();
		HttpSession session = request.getSession();
		String maNhaHang = nhaHangBo.maNhaHang((String) session.getAttribute("emailNhaHang"));
		QuanLyHoaDonForm quanLyHoaDonForm = (QuanLyHoaDonForm) form;
		String maHoaDon = quanLyHoaDonForm.getMaHoaDon();
		System.out.println(maHoaDon + "maHD");
//		if("submit".equals(quanLyHoaDonForm.getSubmit())) {
//			hoaDonBo.capNhatHoaDon(maHoaDon);
//			return mapping.findForward("xacNhanThanhCong");
//		}else {
//			
//		quanLyHoaDonForm.setDanhSachHoaDon(hoaDonBo.danhSachHoaDon(maNhaHang));
//		return mapping.findForward("quanLyHoaDon");
//		}
		if(maHoaDon == null) {
			quanLyHoaDonForm.setDanhSachHoaDon(hoaDonBo.danhSachHoaDon(maNhaHang));
			return mapping.findForward("quanLyHoaDon");
		}else {
			hoaDonBo.capNhatHoaDon(maHoaDon);
			return mapping.findForward("xacNhanThanhCong");
		}
	}
	
}
