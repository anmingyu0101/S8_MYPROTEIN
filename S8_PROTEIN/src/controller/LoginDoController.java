package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.vo.*;

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
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberVo vo = new MemberVo();
			vo.setId(id);
			vo.setPw(pw);
		
			System.out.println(vo);
			int result = new MemberService().insert(vo);
			if(result > 0) {
				System.out.println("로그인 성공");
				response.sendRedirect(request.getContextPath()+"/main");
			} else {
				System.out.println("로그인 실패");
				 response.sendRedirect(request.getContextPath()+"/login");
			}
			
			
	}

}
