package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import form.DanhSachNhaHangForm;
import model.bean.NhaHang;
import model.bo.NhaHangBo;

public class DanhSachNhaHangAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DanhSachNhaHangForm danhSachNhaHangForm = (DanhSachNhaHangForm) form;
		
		NhaHangBo nhaHangBo = new NhaHangBo();
		ArrayList<NhaHang> danhSachNhaHang = nhaHangBo.hienThiDanhSachNhaHang();
		danhSachNhaHangForm.setDanhSachNhaHang(danhSachNhaHang);
		System.out.println(danhSachNhaHang.size());
		return mapping.findForward("danhSachNhaHang");
		
	}
}
