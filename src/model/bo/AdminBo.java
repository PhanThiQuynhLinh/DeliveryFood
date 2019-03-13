package model.bo;

import model.dao.AdminDao;

public class AdminBo  {

	AdminDao adminDao = new AdminDao();
	
	public boolean checkLogin(String email, String matKhau) {
		return adminDao.checkLogin(email, matKhau);
	}
}
