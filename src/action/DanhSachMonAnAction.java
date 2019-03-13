package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachMonAnForm;
import model.bean.MonAn;
import model.bo.MonAnBo;

public class DanhSachMonAnAction  extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("actionDSMA");
		DanhSachMonAnForm danhSachMonAnForm = (DanhSachMonAnForm )form;
		MonAnBo monAnBo = new MonAnBo();
		ArrayList<MonAn> danhSachMonAn = monAnBo.hienThiDanhSachMonAn();
		System.out.println(danhSachMonAn.size());
		danhSachMonAnForm.setDanhSachMonAn(danhSachMonAn);
		return mapping.findForward("danhSachMonAn");
	}
	
	

}
