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
@WebServlet("/LoginDoController")
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
		
			
			MemberService service = new MemberService();
			MemberVo loginInfo = service.login(id, pw);
			if(loginInfo!=null) {
//				if(loginInfo.getMauthcode().equals("1")) {
//					System.out.println("로그인 성공");
//					request.getSession().setAttribute("loginSsInof", loginInfo);
//					response.sendRedirect(request.getContextPath()+"/main");
//				}else if (loginInfo.getMauthcode().equals("0")) {
//					System.out.println("로그인 인증 전");
//				}else {
//					System.out.println("인증코드 확인");
//				}
//			}else {
//				response.sendRedirect(request.getContextPath()+"/main");
//				System.out.println("로그인 실패");
			}
	}

}
