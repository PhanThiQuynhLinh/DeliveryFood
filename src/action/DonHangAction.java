package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.StringProcess;
import form.DonHangForm;
import model.bean.GioHang;
import model.bean.MonAn;
import model.bo.GioHangBo;
import model.bo.MonAnBo;
import model.bo.PhiGiaoHangBo;

public class DonHangAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		DonHangForm donHangForm = (DonHangForm) form;
		PhiGiaoHangBo phiGiaoHangBo = new PhiGiaoHangBo();
		GioHangBo gb = (GioHangBo) session.getAttribute("giohang");
		String maNhaHang = (String) session.getAttribute("maNhaHang");
		String maKhuVuc = (String) session.getAttribute("maKhuVuc");
		MonAnBo monAnBo = new MonAnBo();
		donHangForm.setDanhSachHangTrongGio(gb.getGH());
		ArrayList<MonAn> danhSachMonAn = new ArrayList<>();
		
		ArrayList<GioHang> danhSachHangTrongGio = donHangForm.getDanhSachHangTrongGio();
		
		for (int i = 0; i < danhSachHangTrongGio.size(); i++) {
			MonAn monAn = monAnBo.hienThiMonAn(danhSachHangTrongGio.get(i).getMaMonAn());
			monAn.setSoLuongDatMon(danhSachHangTrongGio.get(i).getSoLuong());
			monAn.setTongTien(danhSachHangTrongGio.get(i).getTongTien());
			danhSachMonAn.add(monAn);
		}
		donHangForm.setPhiGiaoHang(StringProcess.formatNumber(phiGiaoHangBo.phiGiaoHangCuaNhaHangTrongKhuVuc(maNhaHang, maKhuVuc)));
		donHangForm.setTongTien(StringProcess.formatNumber(gb.tongTien()));
		donHangForm.setTongTienTT(gb.tongTien(), phiGiaoHangBo.phiGiaoHangCuaNhaHangTrongKhuVuc(maNhaHang, maKhuVuc));
		int tongttt = gb.tongTien() + phiGiaoHangBo.phiGiaoHangCuaNhaHangTrongKhuVuc(maNhaHang, maKhuVuc);
		session.setAttribute("tongTien",  tongttt);
		donHangForm.setDanhSachMonAn(danhSachMonAn);
		return mapping.findForward("hienThiDonHang");
	}
}
