package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DangKyKhachHangForm;
import model.bo.KhachHangBo;
import model.bo.KhuVucBo;

public class DangKyKhachHangAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DangKyKhachHangForm dangKyKhachHangForm = (DangKyKhachHangForm) form;
		
		if("submit".equals(dangKyKhachHangForm.getSubmit())) {
			String tenKhachHang = dangKyKhachHangForm.getTenKhachHang();
			String email = dangKyKhachHangForm.getEmail();
			String soDienThoai = dangKyKhachHangForm.getSoDienThoai();
			int gioiTinh = dangKyKhachHangForm.getGioiTinh();
			String matKhau = dangKyKhachHangForm.getMatKhau();
			String ngaySinh = dangKyKhachHangForm.getNgaySinh();
			String diaChi = dangKyKhachHangForm.getDiaChi();
			String maKhuVuc = dangKyKhachHangForm.getMaKhuVuc();
			
			KhachHangBo khachHangBo = new KhachHangBo();
			if(khachHangBo.kiemTraTaiKhoan(email)) {
				dangKyKhachHangForm.setThongBao("Email này đã tồn tại. Vui lòng kiểm tra lại!");
				return mapping.findForward("tonTaiEmail");
			}
			if(khachHangBo.dangKy(tenKhachHang, email, soDienThoai, gioiTinh, matKhau, ngaySinh, diaChi, maKhuVuc)) {
				HttpSession session = request.getSession();
				session.setAttribute("emailKhachHang", email);
				return mapping.findForward("dangKyThanhCong");
			}else {
				return mapping.findForward("dangKyThatBai");
			}
		}else {
			KhuVucBo khuVucBo = new KhuVucBo();
			dangKyKhachHangForm.setDanhSachKhuVuc(khuVucBo.hienThiDanhSachKhuVuc());
			System.out.println(dangKyKhachHangForm.getDanhSachKhuVuc().size());
			return mapping.findForward("dangKyKhachHang");
		}
	}
}
