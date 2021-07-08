package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Bean;

public class LoginDAO extends DAO {
	public Bean search(String id, String password)
			throws Exception {
		Bean bean = null;

		Connection con = getConnection();

		PreparedStatement st=con.prepareStatement(
				"select*from customer where id=? and password=?");
		st.setString(1, id);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			bean = new Bean();

			bean.setId(rs.getString("id"));
	
			bean.setPassword(rs.getString("password"));
		}

		st.close();
		con.close();
		return bean;
	}
}