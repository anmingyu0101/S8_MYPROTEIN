package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.*;
import member.model.vo.MemberService;
import member.model.vo.MemberVo;

/**
 * Servlet implementation class JoinDoController
 */
@WebServlet("/join.do")
public class JoinDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinDoController() {
        super();
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPw(pw);
		vo.setName(name);
		vo.setEmail(email);
		vo.setPhone(phone);
		
		System.out.println(vo);
		int result = new MemberService().insert(vo);
		if(result > 0) {
			System.out.println("회원가입 성공");
			response.sendRedirect(request.getContextPath()+"/main");
		} else {
			System.out.println("회원가입 실패");
			response.sendRedirect(request.getContextPath()+"/login");
		}
	
	}
		
	}
	


