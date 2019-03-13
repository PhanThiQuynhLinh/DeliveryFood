package model.bo;

import model.dao.AdminNHDao;

public class AdminNHBo {
	AdminNHDao adminNHDao = new AdminNHDao();
	
	public boolean checkLogin(String email, String matKhau) {
		return adminNHDao.checkLoginNH(email, matKhau);
	}

}
