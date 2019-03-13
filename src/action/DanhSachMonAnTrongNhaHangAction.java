package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachMonAnTrongNhaHangForm;
import model.bo.LoaiMonAnBo;
import model.bo.MonAnBo;
import model.bo.NhaHangBo;

public class DanhSachMonAnTrongNhaHangAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DanhSachMonAnTrongNhaHangForm monAnTrongNhaHangForm = (DanhSachMonAnTrongNhaHangForm) form;
		HttpSession session = request.getSession();
		String maKhuVuc = (String) session.getAttribute("maKhuVuc");
		NhaHangBo nhaHangBo = new NhaHangBo();
		MonAnBo monAnBo = new MonAnBo();
		LoaiMonAnBo loaiMonAnBo = new LoaiMonAnBo();
		String maNhaHang = monAnTrongNhaHangForm.getMaNhaHang();
		String email = (String) session.getAttribute("emailKhachHang");
		
		System.out.println(email);
		session.setAttribute("maNhaHang", maNhaHang);
		System.out.println("Mã Nhà Hàng : " + maNhaHang);
		monAnTrongNhaHangForm.setTenNhaHang(nhaHangBo.hienThiTenNhaHang(maNhaHang));
		System.out.println("Mã khu vực : "+ maKhuVuc);
		monAnTrongNhaHangForm.setDanhSachLoaiMonAn(loaiMonAnBo.danhSachLoaiMonAn(maNhaHang));
		monAnTrongNhaHangForm.setDanhSachTopThucAn(monAnBo.danhSachTopMonAnCuaNhaHang(maNhaHang));
		String maLoaiMonAn = monAnTrongNhaHangForm.getMaLoaiMonAn();
		
		if( maLoaiMonAn == null || maLoaiMonAn.equals("all") || maLoaiMonAn.length() == 0) {
			monAnTrongNhaHangForm.setDanhSachMonAn(monAnBo.danhSachMonAnCuaNhaHang(maNhaHang));
			System.out.println(monAnTrongNhaHangForm.getDanhSachMonAn().size());
			return  mapping.findForward("danhSachMonAnTrongNhaHang");
		}else {
			monAnTrongNhaHangForm.setDanhSachMonAn(monAnBo.danhSachMonAnTheoLoai(maNhaHang, maLoaiMonAn));
			System.out.println(monAnTrongNhaHangForm.getDanhSachMonAn().size());
			System.out.println(maLoaiMonAn);
			System.out.println("aaaa");
			return  mapping.findForward("danhSachMonAnTrongNhaHang");
		}
			
		
		
		
	}
}
