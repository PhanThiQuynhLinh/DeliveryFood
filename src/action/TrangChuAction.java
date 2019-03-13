package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.TrangChuForm;
import model.bean.KhuVuc;
import model.bo.KhachHangBo;
import model.bo.KhuVucBo;
import model.bo.MonAnBo;
import model.bo.NhaHangBo;

public class TrangChuAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		TrangChuForm trangChuForm = (TrangChuForm) form;
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("emailKhachHang");
//		if(email == null) {
//			return mapping.findForward("dangNhapLai");
//		}
		
		KhachHangBo khachHangBo = new KhachHangBo();
		trangChuForm.setEmail(email);
		trangChuForm.setDiemTichLuy(khachHangBo.diemTichLuy(email));
		khachHangBo.capNhatDiemTichLuy(email, khachHangBo.diemTichLuy(email));
		trangChuForm.setTenKhachHang(khachHangBo.tenKhachHang(email));
		trangChuForm.setKhachHang(khachHangBo.thongTinKhachHang(email));
		System.out.println("aaaaa");
		
		if("Hiển Thị".equals(trangChuForm.getSubmit())) {
			if(trangChuForm.getMaKhuVuc() == null || trangChuForm.getMaKhuVuc().length() == 0) {
				return mapping.findForward("chuaChonKhuVuc");
			}
			return mapping.findForward("hienThiNhaHangTrongKhuVuc");
		}else {
			System.out.println("bbbbb");
			KhuVucBo khuVucBo = new KhuVucBo();
			ArrayList<KhuVuc> danhSachKhuVuc = khuVucBo.hienThiDanhSachKhuVuc();
			trangChuForm.setDanhSachKhuVuc(danhSachKhuVuc);
			NhaHangBo nhaHangBo = new NhaHangBo();
			trangChuForm.setSoLuongNhaHang(nhaHangBo.tinhSoLuongNhaHang());
			
			MonAnBo monAnBo = new MonAnBo();
			trangChuForm.setSoLuongMonAn(monAnBo.tinhSoLuongMonAn());
			
			trangChuForm.setSoLuongKhachHang(khachHangBo.tinhSoLuongKhachHang());
			return mapping.findForward("hienThiTrangChu");
		}
		
	}
}
