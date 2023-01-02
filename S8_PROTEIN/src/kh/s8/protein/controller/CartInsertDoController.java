package kh.s8.protein.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.s8.protein.cart.product.model.CartProductService;
import kh.s8.protein.cart.product.model.CartProductVo;
import kh.s8.protein.member.model.MemberVo;

/**
 * Servlet implementation class CartDoController
 */
@WebServlet("/CartDoController")
public class CartInsertDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartInsertDoController() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("확인");
		
		int amount = 2;
		
		int product_no = 0;
		int member_no = 0;
		
		MemberVo  membervo = (MemberVo)(request.getSession().getAttribute("loginInfo"));
		if(membervo != null) {
			member_no = membervo.getMember_no();
		}else {
			response.sendRedirect(request.getContextPath()+"/login");
			return;
		}
		
		CartProductVo vo = new CartProductVo();
		vo.setMember_no(member_no);
		vo.setProduct_no(product_no);
		vo.setAmount(amount);
		
		CartProductService service = new CartProductService();
		int result = service.insert(vo);
		System.out.println("result");
		
		response.sendRedirect(request.getContextPath()+"/cart");
	}

}
