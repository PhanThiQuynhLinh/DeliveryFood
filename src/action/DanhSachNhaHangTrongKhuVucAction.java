package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachNhaHangTrongKhuVucForm;
import model.bean.KhuVuc;
import model.bean.LoaiNhaHang;
import model.bean.NhaHang;
import model.bo.KhuVucBo;
import model.bo.LoaiNhaHangBo;
import model.bo.NhaHangBo;

public class DanhSachNhaHangTrongKhuVucAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DanhSachNhaHangTrongKhuVucForm danhSachNhaHangTrongKhuVucForm = (DanhSachNhaHangTrongKhuVucForm) form;
//		String email = danhSachNhaHangTrongKhuVucForm.getEmail();
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("emailKhachHang");
		NhaHangBo nhaHangBo = new NhaHangBo();
		KhuVucBo khuVucBo = new KhuVucBo();
		LoaiNhaHangBo loaiNhaHangBo = new LoaiNhaHangBo();
		
		String maKhuVuc = danhSachNhaHangTrongKhuVucForm.getMaKhuVuc();
		
		String maLoaiNhaHang = danhSachNhaHangTrongKhuVucForm.getMaLoaiNhaHang();
		danhSachNhaHangTrongKhuVucForm.setMaKhuVuc(maKhuVuc);
		danhSachNhaHangTrongKhuVucForm.setTenKhuVuc(khuVucBo.hienThiTenKhuVuc(maKhuVuc));
		danhSachNhaHangTrongKhuVucForm.setSoLuongNhaHang(nhaHangBo.tongSoNhaHangTrongKhuVuc(maKhuVuc));
		danhSachNhaHangTrongKhuVucForm.setDanhSachLoaiNhaHang(loaiNhaHangBo.hienThiDanhSachLoaiNhaHangTrongKhuVuc(maKhuVuc));
		System.out.println(danhSachNhaHangTrongKhuVucForm.getDanhSachLoaiNhaHang().size());
		System.out.println(danhSachNhaHangTrongKhuVucForm.getTenKhuVuc());
		System.out.println(maKhuVuc);
		System.out.println(maLoaiNhaHang);
		
		session.setAttribute("maKhuVuc", maKhuVuc);
		System.out.println("tên khách hàng : " +email);
		if(maLoaiNhaHang == null || maLoaiNhaHang.length() == 0) {
			danhSachNhaHangTrongKhuVucForm.setDanhSachNhaHang(nhaHangBo.danhSachNhaHangTrongKhuVuc(maKhuVuc));
			return mapping.findForward("danhSachNhaHangTrongKhuVuc");
		}else {
			System.out.println("VÃ´ Ä‘Ã¢y");
			danhSachNhaHangTrongKhuVucForm.setDanhSachNhaHang(nhaHangBo.danhSachNhaHangTrongKhuVucTheoLoai(maKhuVuc, maLoaiNhaHang));
			return mapping.findForward("danhSachNhaHangTrongKhuVuc");
		}
		
	}
	
}
