package action;


import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ThongTinGiaoHangForm;
import model.bean.GioHang;
import model.bo.DatHangBo;
import model.bo.GioHangBo;
import model.bo.KhachHangBo;

public class ThongTinGiaoHangAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("1");
		
		ThongTinGiaoHangForm thongTinGiaoHangForm = (ThongTinGiaoHangForm) form;
		System.out.println(thongTinGiaoHangForm.getSubmit());
		if("Xong".equals(thongTinGiaoHangForm.getSubmit())) {
			HttpSession session = request.getSession();
			if(session.getAttribute("giohang") == null) {
				System.out.println("aaa");
				thongTinGiaoHangForm.setThongBao("Giỏ Hàng Của Bạn Đang Trống. Vui lòng chọn Hủy để quay lại để lựa chọn món.");
				return mapping.findForward("datHangKhongThanhCong");
			}
			
			KhachHangBo khachHangBo = new KhachHangBo();
			GioHangBo gioHangBo = (GioHangBo) session.getAttribute("giohang");
			ArrayList<GioHang> gioHang = gioHangBo.getGH();
//			thongTinGiaoHangForm.setDanhSachMonAnTrongGio((ArrayList<GioHang>) session.getAttribute("giohang"));
//			ArrayList<GioHang> gioHang = (ArrayList<GioHang>) session.getAttribute("giohang");
			String maKhachHang = khachHangBo.maKhachHang((String) session.getAttribute("emailKhachHang"));
			String tenNguoiNhan = thongTinGiaoHangForm.getTenNguoiNhan();
			String diaChi = thongTinGiaoHangForm.getDiaChi();
			String ngayXuatDon = "2019/1/2";
			String soDienThoaiNguoiNhan = thongTinGiaoHangForm.getSoDienThoaiNguoiNhan();
			String tinhTrang = "Chưa Giao";
			int tongTienTT = (int) session.getAttribute("tongTien");
			String id = String.valueOf(new Date().getTime());
			System.out.println(id);
			DatHangBo datHangBo = new DatHangBo();
			datHangBo.themDonHang(tenNguoiNhan, ngayXuatDon, soDienThoaiNguoiNhan, diaChi, tinhTrang, tongTienTT, maKhachHang, id);
			for (int i = 0; i < gioHang.size(); i++) {
				String maMonAn = gioHang.get(i).getMaMonAn();
				int soLuong = gioHang.get(i).getSoLuong();
				datHangBo.themChiTietDonHang( datHangBo.maHoaDon(id),maMonAn, soLuong);
			}
			
			thongTinGiaoHangForm.setThongBao("Bạn đã đặt hàng thành công");
			session.setAttribute("giohang", null);
			session.setAttribute("tongTien",  0);
			return mapping.findForward("datHangThanhCong");
		}
		return mapping.findForward("thongTinGiaoHang");
	}
}
