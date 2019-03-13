package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.GioHang;

public class ThongTinGiaoHangForm extends ActionForm {
	private String maKhachHang;
	private String tenNguoiNhan;
	private String soDienThoaiNguoiNhan;
	private String diaChi;
	private String ngayXuatHoaDon;
	private String tinhTrang;
	private String tenKhuVuc;
	private String maKhuVuc;
	private ArrayList<GioHang> danhSachMonAnTrongGio;
	private String submit;
	private String thongBao;
	private int tongTienTT;

	public String getThongBao() {
		return thongBao;
	}

	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public String getTenKhuVuc() {
		return tenKhuVuc;
	}

	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}

	public String getMaKhuVuc() {
		return maKhuVuc;
	}

	public void setMaKhuVuc(String maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}

	public ArrayList<GioHang> getDanhSachMonAnTrongGio() {
		return danhSachMonAnTrongGio;
	}

	public void setDanhSachMonAnTrongGio(ArrayList<GioHang> danhSachMonAnTrongGio) {
		this.danhSachMonAnTrongGio = danhSachMonAnTrongGio;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getTenNguoiNhan() {
		return tenNguoiNhan;
	}

	public void setTenNguoiNhan(String tenNguoiNhan) {
		this.tenNguoiNhan = tenNguoiNhan;
	}

	public String getSoDienThoaiNguoiNhan() {
		return soDienThoaiNguoiNhan;
	}

	public void setSoDienThoaiNguoiNhan(String soDienThoaiNguoiNhan) {
		this.soDienThoaiNguoiNhan = soDienThoaiNguoiNhan;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNgayXuatHoaDon() {
		return ngayXuatHoaDon;
	}

	public void setNgayXuatHoaDon(String ngayXuatHoaDon) {
		this.ngayXuatHoaDon = ngayXuatHoaDon;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public int getTongTienTT() {
		return tongTienTT;
	}

	public void setTongTienTT(int tongTienTT) {
		this.tongTienTT = tongTienTT;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
