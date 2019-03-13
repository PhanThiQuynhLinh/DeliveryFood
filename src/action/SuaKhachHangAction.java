package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.KhachHangForm;
import model.bean.KhachHang;
import model.bo.KhachHangBo;
import model.bo.KhuVucBo;

public class SuaKhachHangAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		KhachHangForm khachHangForm = (KhachHangForm) form;
		KhachHangBo khachHangBo = new KhachHangBo();
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		if("submit".equals(khachHangForm.getSubmit())){
			KhachHang khachHang = new KhachHang();
			khachHang.setMaKhachHang(khachHangForm.getMaKhachHang());
			khachHang.setEmail(khachHangForm.getEmail());
			khachHang.setMatKhau(khachHangForm.getMatKhau());
			String tenKH = new String((khachHangForm.getTenKhachHang().getBytes("ISO-8859-1")),"UTF-8");
			khachHang.setTenKhachHang(tenKH);
			khachHang.setNgaySinh(khachHangForm.getNgaySinh());
			khachHang.setSoDienThoai(khachHangForm.getSoDienThoai());
			String diachi = new String((khachHangForm.getDiaChi().getBytes("ISO-8859-1")),"UTF-8");
			khachHang.setDiaChi(diachi);
			khachHang.setGioiTinh(khachHangForm.getGioiTinh());
			khachHang.setTenKhuVuc(khachHangForm.getTenKhuVuc());
			khachHang.setMaKhuVuc(khachHangForm.getMaKhuVuc());
			khachHangBo.suaKhachHang(khachHang);
			return mapping.findForward("suaKhachHangXong");
		} else {
			KhachHang khachHang = khachHangBo.hienThiThongTinKhachHang(khachHangForm.getMaKhachHang());
			KhuVucBo khuVucBo = new KhuVucBo();
			
			khachHangForm.setMaKhachHang(khachHang.getMaKhachHang());
			khachHangForm.setEmail(khachHang.getEmail());
			khachHangForm.setMatKhau(khachHang.getMatKhau());
			khachHangForm.setTenKhachHang(khachHang.getTenKhachHang());
			khachHangForm.setNgaySinh(khachHang.getNgaySinh());
			khachHangForm.setSoDienThoai(khachHang.getSoDienThoai());
			khachHangForm.setDiaChi(khachHang.getDiaChi());
			khachHangForm.setGioiTinh(khachHang.getGioiTinh());
			khachHangForm.setTenKhuVuc(khachHang.getTenKhuVuc());
//			khachHangForm.setDsKhuVuc(khuVucBo.danhSachKhuVuc());
			khachHangForm.setMaKhuVuc(khachHang.getMaKhuVuc());
			return mapping.findForward("suaKhachHang");
		}
		
		
	}

}
