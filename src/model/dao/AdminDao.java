package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import libs.ConnectionWithSql;

public class AdminDao {

	public boolean checkLogin(String email, String matKhau) {
		Connection conn = ConnectionWithSql.getConnect();

		String sql = "SELECT * FROM Admin WHERE Email = ? AND MatKhau = ?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,email);
			pst.setString(2, matKhau);
			rs = pst.executeQuery();
			System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs.next()) {
				System.out.println("Dung");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("sai");
		return false;

	}
}
