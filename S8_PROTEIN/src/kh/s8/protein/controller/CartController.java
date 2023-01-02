package kh.s8.protein.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.s8.protein.cart.product.model.CartProductService;
import kh.s8.protein.cart.product.model.CartProductVo;
import kh.s8.protein.member.model.MemberVo;
import kh.s8.protein.product.model.ProductService;
import kh.s8.protein.product.model.ProductVo;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/cart")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int member_no = 0;
		MemberVo vo = (MemberVo)(request.getSession().getAttribute("loginInfo"));
		if(vo != null) {
			member_no = vo.getMember_no();
		} else {
			response.sendRedirect(request.getContextPath()+"/login");
			return;
		}
		
		List<CartProductVo> cartlist = new CartProductService().selectList(member_no);
		
		request.setAttribute("cartlist", cartlist);
		String viewPath = "WEB-INF/view/cart.jsp";
		request.getRequestDispatcher(viewPath).forward(request, response);
	}


}
