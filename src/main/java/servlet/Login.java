package servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoginDAO;
import bean.Bean;



public class Login {

	public String execute(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {
		
		HttpSession session=request.getSession();
		
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		LoginDAO dao=new LoginDAO();
		Bean account=dao.search(id, password);
		
		if(account!=null) {
			session.setAttribute("account", account);
			return "../jsp/login-out.jsp";
		}
		
		return "../jsp/login-error.jsp";
		
	}

}