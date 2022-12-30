package kh.s8.protein.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.s8.protein.member.model.*;

/**
 * Servlet implementation class LoginDoController
 */
@WebServlet("/login.do")
public class LoginDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDoController() {
        super();
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String email = request.getParameter("email");
			String pw = request.getParameter("pw");
			System.out.println("=========로그인");
			System.out.println(email);
			System.out.println(pw);
			
			MemberService service = new MemberService();
			MemberVo loginInfo = service.login(email, pw);
			
			if(loginInfo != null) {
				System.out.println("로그인성공");
				request.getSession().setAttribute("loginInfo", loginInfo);
				response.sendRedirect(request.getContextPath()+"/main");
				
			}else {
				System.out.println("로그인 실패");
				response.sendRedirect(request.getContextPath()+"/main");
			}
			
			
			
	}

}
