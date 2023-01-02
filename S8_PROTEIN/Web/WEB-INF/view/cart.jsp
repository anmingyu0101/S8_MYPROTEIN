<link rel="stylesheet" href="<%=request.getContextPath() %>/css/a.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/b.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



         <div data-testid="simple-header-cover" class="sc-kgflAQ gZkxJJ">
          <div class="sc-fLlhyt jaFRrD"><a aria-label="Myprotein South Korea 홈 페이지" data-testid="logo-link" href="/protein/main.html"
                  class="sc-bBrHrO glbXBA"><img
                      src="https://s1.thcdn.com/enterprise/assets/myprotein-global-2cc3a72d-1521-4e5e-b052-4e677e494219-logo-default.svg"
                      alt="" width="auto" height="{18px}"></a></div>
                      
         <div class="westendHeader_account ">
        <div class="responsiveAccountHeader" data-component="responsiveAccountHeader" data-component-tracked-clicked="">
          <button class="responsiveAccountHeader_openAccountButtonMobile"
            id="responsiveAccountHeader_openAccountButtonMobile_rightSection" type="button" aria-label="Account menu"
            title="Account menu" aria-expanded="false">
            <svg class="responsiveAccountHeader_accountIcon" width="24px" height="24px" viewBox="0 0 24 24">
              <path
                d="M12,10.5 C13.6568542,10.5 15,9.15685425 15,7.5 C15,5.84314575 13.6568542,4.5 12,4.5 C10.3431458,4.5 9,5.84314575 9,7.5 C9,9.15685425 10.3431458,10.5 12,10.5 Z M12,12.5 C9.23857625,12.5 7,10.2614237 7,7.5 C7,4.73857625 9.23857625,2.5 12,2.5 C14.7614237,2.5 17,4.73857625 17,7.5 C17,10.2614237 14.7614237,12.5 12,12.5 Z M5,21.5 L3,21.5 C3,17.6340068 7.02943725,14.5 12,14.5 C16.9705627,14.5 21,17.6340068 21,21.5 L19,21.5 C19,18.8641562 15.9603707,16.5 12,16.5 C8.03962935,16.5 5,18.8641562 5,21.5 Z">
              </path>
            </svg>

            <svg class="responsiveAccountHeader_cross" width="24" height="24" viewBox="0 0 24 24">
              <path
                d="M12.0020447,10.5878311 L18.0040894,4.58578644 L19.4183029,6 L13.4162582,12.0020447 L19.4142136,18 L18,19.4142136 L12.0020447,13.4162582 L6,19.4183029 L4.58578644,18.0040894 L10.5878311,12.0020447 L4.58578644,6 L6,4.58578644 L12.0020447,10.5878311 Z">
              </path>
            </svg>

          </button>
          <div class="responsiveAccountHeader_openAccountPanel"
            data-js-element="responsiveAccountHeader_openAccountPanel" data-component-tracked-hovered=""
            style="min-width: 120px; min-height: 45px;">
            <a class="responsiveAccountHeader_openAccountButton" href="/accountHome.account" aria-label="계정">
              <svg class="responsiveAccountHeader_accountIcon" width="24px" height="24px" viewBox="0 0 24 24">
                <path
                  d="M12,10.5 C13.6568542,10.5 15,9.15685425 15,7.5 C15,5.84314575 13.6568542,4.5 12,4.5 C10.3431458,4.5 9,5.84314575 9,7.5 C9,9.15685425 10.3431458,10.5 12,10.5 Z M12,12.5 C9.23857625,12.5 7,10.2614237 7,7.5 C7,4.73857625 9.23857625,2.5 12,2.5 C14.7614237,2.5 17,4.73857625 17,7.5 C17,10.2614237 14.7614237,12.5 12,12.5 Z M5,21.5 L3,21.5 C3,17.6340068 7.02943725,14.5 12,14.5 C16.9705627,14.5 21,17.6340068 21,21.5 L19,21.5 C19,18.8641562 15.9603707,16.5 12,16.5 C8.03962935,16.5 5,18.8641562 5,21.5 Z">
                </path>
              </svg>


              <span class="responsiveAccountHeader_openAccountPanelText">계정</span>

            </a>
            <div class="responsiveAccountHeader_accountDropdown
              ">
              <nav class="responsiveAccountHeader_accountDropdown_content"
                data-js-element="responsiveAccountHeader_accountDropdown_content" aria-label="계정">
                <ul class="responsiveAccountHeader_accountGroup">
                  <li
                    class="responsiveAccountHeader_accountListItem responsiveAccountHeader_accountListButtonItem responsiveAccountHeader_accountListButtonItem-first">
                    <a href="/protein/login.html" class="responsiveAccountHeader_accountLogin js-e2e-sign-in"
                      data-context="login">
                      로그인
                    </a>
                  </li>
                  <li class="responsiveAccountHeader_accountListItem responsiveAccountHeader_accountListButtonItem">

                    <a href="/protein/join" class="responsiveAccountHeader_accountRegister"
                      data-context="register">
                      가입하기
                    </a>
                  </li>


                </ul>
              </nav>
            </div>
          </div>

          <div class="responsiveAccountHeader_overlay"></div>

        </div>
      <div class="westendHeader_responsiveFlyoutBasket">
        <div class="responsiveFlyoutBasket" data-component="responsiveFlyoutBasket">
          <span class="responsiveFlyoutBasket_deviceState" data-device-state="">
          </span>
          <button class="responsiveFlyoutBasket_openBasketButtonMobile"
            id="responsiveFlyoutBasket_openBasketButtonMobile" type="button" aria-label="Basket Menu"
            title="Basket Menu" aria-expanded="false">
            <svg class="responsiveFlyoutBasket_icon responsiveFlyoutBasket_icon-basket" width="24" height="24"
              viewBox="0 0 24 24">
              <path
                d="M6.57412994,10 L17.3932043,10 L13.37,4.18336196 L15.0021928,3 L19.8438952,10 L21,10 C21.5522847,10 22,10.4477153 22,11 C22,11.5522847 21.5522847,12 21,12 L17.5278769,19.8122769 C17.2068742,20.534533 16.4906313,21 15.7002538,21 L8.29974618,21 C7.50936875,21 6.79312576,20.534533 6.47212308,19.8122769 L3,12 C2.44771525,12 2,11.5522847 2,11 C2,10.4477153 2.44771525,10 3,10 L4.11632272,10 L9,3 L10.6274669,4.19016504 L6.57412994,10 Z M5.18999958,12 L8.29999924,19 L15.6962585,19 L18.8099995,12 L5.18999958,12 Z">
              </path>
            </svg>

            <svg class="responsiveFlyoutBasket_icon responsiveFlyoutBasket_icon-cross" width="24" height="24"
              viewBox="0 0 24 24">
              <path
                d="M12.0020447,10.5878311 L18.0040894,4.58578644 L19.4183029,6 L13.4162582,12.0020447 L19.4142136,18 L18,19.4142136 L12.0020447,13.4162582 L6,19.4183029 L4.58578644,18.0040894 L10.5878311,12.0020447 L4.58578644,6 L6,4.58578644 L12.0020447,10.5878311 Z">
              </path>
            </svg>


            <span class="responsiveFlyoutBasket_itemsCount-mobile  responsiveFlyoutBasket_slimHeader_itemsCount-mobile"
              data-js-element="itemsCount">
              0
            </span>

          </button>
          <div class="responsiveFlyoutBasket_openBasketPanel" data-js-element="responsiveFlyoutBasket_openBasketPanel">
            <a class="responsiveFlyoutBasket_basketButton" href="/my.basket" aria-label=" 장바구니">
              <span class="responsiveFlyoutBasket_icon_container">
                <svg class="responsiveFlyoutBasket_icon responsiveFlyoutBasket_icon-basket" width="24" height="24"
                  viewBox="0 0 24 24">
                  <path
                    d="M6.57412994,10 L17.3932043,10 L13.37,4.18336196 L15.0021928,3 L19.8438952,10 L21,10 C21.5522847,10 22,10.4477153 22,11 C22,11.5522847 21.5522847,12 21,12 L17.5278769,19.8122769 C17.2068742,20.534533 16.4906313,21 15.7002538,21 L8.29974618,21 C7.50936875,21 6.79312576,20.534533 6.47212308,19.8122769 L3,12 C2.44771525,12 2,11.5522847 2,11 C2,10.4477153 2.44771525,10 3,10 L4.11632272,10 L9,3 L10.6274669,4.19016504 L6.57412994,10 Z M5.18999958,12 L8.29999924,19 L15.6962585,19 L18.8099995,12 L5.18999958,12 Z">
                  </path>
                </svg>

                <span class="responsiveFlyoutBasket_itemsCount " data-js-element="itemsCount">
                  0
                </span>

              </span>

              <span class="responsiveFlyoutBasket_name">
                장바구니

              </span>
            </a>
            <div class="responsiveFlyoutBasket_basketDropdown responsiveFlyoutBasket_basketDropdown-emptyBasket">
              <div class="responsiveFlyoutBasket_basketDropdown_content"
                data-js-element="responsiveFlyoutBasket_basketDropdown_content">
                <div class="responsiveFlyoutBasket_emptyBasketPanel">
                  <p class="responsiveFlyoutBasket_emptyBasketText">
                    장바구니가 비어있습니다.
                  </p>
                  <button class="responsiveFlyoutBasket_continueShoppingButton" data-close-basket="">
                    쇼핑 계속하기
                  </button>
                </div>
              </div>
            </div>
          </div>

          <div class="responsiveFlyoutBasket_overlay"></div>
        </div>

      </div>

      </div>
        
        
        <div class="athenaBasket_empty noItems">
      <h1 class="athenaBasket_headerTitle athenaBasket_headerTitle-empty">당신의 장바구니</h1>
      
       <c:forEach items="${productlist}" var="vo">
        	<br>
	        ${vo. product_no}
	        <br>
	        ${vo. product_name}
	        <br>
	        ${vo. product_price}
	        <br>
	        ${vo. product_desc}
        	<br>
        	<c:forEach items="${vo.product_image_list }" var="pimg" >
        		<img src="${pimg. product_img}" width="200" height="200">
        	<br>
        	</c:forEach>
		</c:forEach>

      <p class="athenaBasket_emptyBasketMessage">
        장바구니가 비어있습니다.
      </p>

      <div class="athenaBasket_emptyButtonContainer">
        <a href="/" class="athenaBasket_emptyContinueShoppingButton">쇼핑 계속하기</a>
      </div>
    </div>
</body>
</html>