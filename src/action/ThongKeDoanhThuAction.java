package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.StringProcess;
import form.ThongKeDoanhThuForm;
import model.bo.NhaHangBo;
import model.bo.ThongKeBo;

public class ThongKeDoanhThuAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ThongKeDoanhThuForm thongKeDoanhThuForm = (ThongKeDoanhThuForm) form;
		HttpSession session = request.getSession();
		ThongKeBo thongKeBo = new ThongKeBo();
		NhaHangBo nhaHangBo = new NhaHangBo();
		thongKeDoanhThuForm.setDanhSachHoaDon(thongKeBo.danhSachHoaDon(nhaHangBo.maNhaHang((String) session.getAttribute("emailNhaHang"))));
		thongKeDoanhThuForm.setTongTien(StringProcess.formatNumber(thongKeBo.tongHoaDon(nhaHangBo.maNhaHang((String) session.getAttribute("emailNhaHang")))));
		return mapping.findForward("thongKeDoanhThu");
	}
}
