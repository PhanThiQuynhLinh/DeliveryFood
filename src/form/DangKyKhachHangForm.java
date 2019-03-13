package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.KhachHang;
import model.bean.KhuVuc;

public class DangKyKhachHangForm extends ActionForm {
	private String tenKhachHang;
	private String email;
	private String soDienThoai;
	private int gioiTinh;
	private String ngaySinh;
	private String matKhau;
	private String diaChi;
	private String maKhuVuc;
	private String tenKhuVuc;
	private String submit;
	private ArrayList<KhuVuc> danhSachKhuVuc;
	private KhachHang khachHang;
	private String thongBao;

	public String getThongBao() {
		return thongBao;
	}

	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMaKhuVuc() {
		return maKhuVuc;
	}

	public void setMaKhuVuc(String maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}

	public String getTenKhuVuc() {
		return tenKhuVuc;
	}

	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public ArrayList<KhuVuc> getDanhSachKhuVuc() {
		return danhSachKhuVuc;
	}

	public void setDanhSachKhuVuc(ArrayList<KhuVuc> danhSachKhuVuc) {
		this.danhSachKhuVuc = danhSachKhuVuc;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
//	@Override
//	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//		ActionErrors actionErrors = new ActionErrors();
//		if (StringProcess.notVaild(tenKhachHang)) {
//			actionErrors.add("tenKhachHangError", new ActionMessage("error.tenKhachHang"));
//		}
//		if (StringProcess.notVaild(email)) {
//			actionErrors.add("emailKhachHangError", new ActionMessage("error.emailKhachHang"));
//		}
//
//		if (StringProcess.notVaild(soDienThoai)) {
//			actionErrors.add("soDienThoaiKhachHangError", new ActionMessage("error.soDienThoaiKhachHang"));
//		}
//		if (StringProcess.notVaild(matKhau)) {
//			actionErrors.add("matKhauKhachHangError", new ActionMessage("error.matKhauKhachHang"));
//		}
//
//		if (StringProcess.notVaild(ngaySinh)) {
//			actionErrors.add("ngaySinhKhachHangError", new ActionMessage("error.ngaySinhKhachHang"));
//		}
//		if (StringProcess.notVaild(diaChi)) {
//			actionErrors.add("diaChiKhachHangError", new ActionMessage("error.diaChiKhachHang"));
//		}
//		if (StringProcess.notVaild(maKhuVuc)) {
//			actionErrors.add("maKhuVucKhachHangError", new ActionMessage("error.maKhuVucKhachHang"));
//		}
//
//		return actionErrors;
//	}
}
