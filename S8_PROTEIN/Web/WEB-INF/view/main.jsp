<link rel="stylesheet" href="<%=request.getContextPath() %>/css/a.css">
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
                    <a href="${pageContext.request.contextPath }/login" class="responsiveAccountHeader_accountLogin js-e2e-sign-in"
                      data-context="login">
                      로그인
                    </a>
                  </li>
                  <li class="responsiveAccountHeader_accountListItem responsiveAccountHeader_accountListButtonItem">

                    <a href="${pageContext.request.contextPath }/join" class="responsiveAccountHeader_accountRegister"
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
            <a class="responsiveFlyoutBasket_basketButton" href="${pageContext.request.contextPath }/cart" aria-label=" 장바구니">
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

<%--
      <div class="westendHeader_navigation">
        <nav class="responsiveFlyoutMenu " data-component="responsiveFlyoutMenu" data-component-tracked-clicked="">
          <p id="accessibility-nav-help" class="visually-hidden responsiveFlyoutMenu_accessibilityNavHelp">
            Use the tab key or shift plus tab keys to move between the menu items. Use the enter key to expand submenu
            items.
          </p>

          <div class="responsiveFlyoutMenu_menu">

            <div class="responsiveFlyoutMenu_menuStickyRow" data-js-element="responsiveFlyoutMenu_menuStickyRow">
              <a href="https://www.myprotein.co.kr/" class="responsiveFlyoutMenu_menuHomeButton
                  responsiveFlyoutMenu_menuHomeButton-show" data-js-element="responsiveFlyoutMenu_homeButton"
                aria-label="홈" data-js-menu-sticky-row-control="" tabindex="-1" aria-hidden="true">
                <svg
                  class="responsiveFlyoutMenu_homeIcon responsiveFlyoutMenu_homeIconFill responsiveFlyoutMenu_homeIcon-level"
                  width="24" height="24" viewBox="0 0 24 24">
                  <path
                    d="M17,10 L17,19 L12,19 L12,14 C12,12.8954305 11.1045695,12 10,12 C8.8954305,12 8,12.8954305 8,14 L8,19 L3,19 L3,10 L0,10 L10,0 L20,10 L17,10 Z"
                    transform="translate(2 2)"></path>
                </svg>

              </a>

              <button class="responsiveFlyoutMenu_menuBackButton" data-js-element="responsiveFlyoutMenu_backToPrev"
                aria-label="" data-js-menu-sticky-row-control="" tabindex="-1" aria-hidden="true">
                <svg class="responsiveFlyoutMenu_chevronLeft" width="24" height="24" viewBox="0 0 24 24">
                  <polygon class="responsiveFlyoutMenu_chevronLeftFill"
                    points="15 16.137 13.61 17.5 8 12 13.61 6.5 15 7.863 10.78 12"></polygon>
                </svg>

                돌아가기
              </button>
              <button class="responsiveFlyoutMenu_menuCross" data-js-element="responsiveFlyoutMenu_closeMenu"
                aria-label="메뉴 닫기" data-js-menu-sticky-row-control="" tabindex="-1" aria-hidden="true">
                <svg class="responsiveFlyoutMenu_cross" width="24" height="24" viewBox="0 0 24 24">
                  <path
                    d="M12.0020447,10.5878311 L18.0040894,4.58578644 L19.4183029,6 L13.4162582,12.0020447 L19.4142136,18 L18,19.4142136 L12.0020447,13.4162582 L6,19.4183029 L4.58578644,18.0040894 L10.5878311,12.0020447 L4.58578644,6 L6,4.58578644 L12.0020447,10.5878311 Z">
                  </path>
                </svg>

              </button>
            </div>


            </li>

            </ul>
            <div class="responsiveFlyoutMenu_mobilePanel_levelTwo"></div>
            <div class="responsiveFlyoutMenu_mobilePanel_levelThree"></div>
          </div>
      </div>
      
      
      
      <div class="responsiveFlyoutMenu_menuUnderlay" data-js-element="smallMenuUnderlay"></div>
      </nav>

    </div>
    </div>
    </div>
    <div class="responsiveFlyoutMenu_menuUnderlay" data-js-element="menuUnderlay"></div>


    <!-- 임시 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ -->

      <!-- ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ -->

      <div class="responsiveUsp_nav">
        <div class="responsiveUsp_navDot"></div>
        <div class="responsiveUsp_navDot responsiveUsp_navDot-active"></div>
        <div class="responsiveUsp_navDot"></div>
        <div class="responsiveUsp_navDot"></div>
      </div>
    </div>
 --%>


    </header>
    </div>


    <main id="mainContent">
          따끈따끈🔥 NEW 신제품

        </h2>


        <ul class="fourBestSellers_itemContainer" aria-labelledby="fourBestSellers_title-4054883">



          <li class="fourBestSellers_item" data-component-tracked-clicked="">

            <div class="athenaProductBlock" data-component="athenaProductBlock" rel="13935323">
              <div class="athenaProductBlockLink trackwidget" data-block-name="December BAU" data-block-type=""
                data-widget-id="4054883">
                <a href="sports-nutrition/impact-whey-protein-strawberry-yoghurt-flavour/13935323.html">
                  <img class="athenaProductBlock_image" alt="한정판 임팩트 웨이 프로틴 - 스트로베리 요거트" width="300" height="300"
                    src="https://static.thcdn.com/images/large/webp//productimg/300/300/13935323-6264979908311405.jpg"
                    crossorigin="" loading="lazy">
                </a>
              </div>
              <h3 class="athenaProductBlock_titleContainer trackwidget" data-block-name="December BAU"
                data-block-type="" data-widget-id="4054883">
                <a class="athenaProductBlock_title trackwidget"
                  href="sports-nutrition/impact-whey-protein-strawberry-yoghurt-flavour/13935323.html">



                  한정판 임팩트 웨이 프로틴 - 스트로베리 요거트


                </a>
              </h3>


              <div class="athenaProductBlock_priceBlock">
                <div class="athenaProductBlock_rrp">
                <div class="athenaProductBlock_price">
                  <span class="athenaProductBlock_priceCurrency" content=""></span>
                  <span class="athenaProductBlock_priceValue" content="₩20,900">₩20,900</span>
                </div>
              </div>
            </div>



          </li>
          <li class="fourBestSellers_item" data-component-tracked-clicked="">

            <div class="athenaProductBlock" data-component="athenaProductBlock" rel="13700322">
              <div class="athenaProductBlockLink trackwidget" data-block-name="December BAU" data-block-type=""
                data-widget-id="4054883">
                <a href="sports-nutrition/layered-bar-blueberry-yoghurt-flavour/13700322.html">
                  <img class="athenaProductBlock_image" alt="한정판 6 레이어 프로틴바(육겹바) - 블루베리 요거트" width="300" height="300"
                    src="https://static.thcdn.com/images/large/webp//productimg/300/300/13700322-6874979134649559.jpg"
                    crossorigin="" loading="lazy">
                </a>
              </div>
              <h3 class="athenaProductBlock_titleContainer trackwidget" data-block-name="December BAU"
                data-block-type="" data-widget-id="4054883">
                <a class="athenaProductBlock_title trackwidget"
                  href="sports-nutrition/layered-bar-blueberry-yoghurt-flavour/13700322.html">



                  한정판 6 레이어 프로틴바(육겹바) - 블루베리 요거트


                </a>
              </h3>


              <div class="athenaProductBlock_priceBlock">
                <div class="athenaProductBlock_price">
                  <span class="athenaProductBlock_priceCurrency" content=""></span>
                  <span class="athenaProductBlock_priceValue" content="₩37,900">₩37,900</span>
                </div>
              </div>
            </div>



          </li>
          <li class="fourBestSellers_item" data-component-tracked-clicked="">

            <div class="athenaProductBlock" data-component="athenaProductBlock" rel="13738594">
              <div class="athenaProductBlockLink trackwidget" data-block-name="December BAU" data-block-type=""
                data-widget-id="4054883">
                <a href="sports-nutrition/impact-whey-protein-melon-milk-flavour/13738594.html">
                  <img class="athenaProductBlock_image" alt="한정판 임팩트 웨이 프로틴 - 멜론 밀크" width="300" height="300"
                    src="https://static.thcdn.com/images/large/webp//productimg/300/300/13738594-4394979150672268.jpg"
                    crossorigin="" loading="lazy">
                </a>
              </div>
              <h3 class="athenaProductBlock_titleContainer trackwidget" data-block-name="December BAU"
                data-block-type="" data-widget-id="4054883">
                <a class="athenaProductBlock_title trackwidget"
                  href="sports-nutrition/impact-whey-protein-melon-milk-flavour/13738594.html">



                  한정판 임팩트 웨이 프로틴 - 멜론 밀크


                </a>
              </h3>


              <div class="athenaProductBlock_priceBlock">

                <div class="athenaProductBlock_price">
                  <span class="athenaProductBlock_priceCurrency" content=""></span>
                  <span class="athenaProductBlock_priceValue" content="₩20,900">₩20,900</span>
                </div>
              </div>
            </div>



          </li>
          <li class="fourBestSellers_item" data-component-tracked-clicked="">

            <div class="athenaProductBlock" data-component="athenaProductBlock" rel="13891054">
              <div class="athenaProductBlockLink trackwidget" data-block-name="December BAU" data-block-type=""
                data-widget-id="4054883">
                <a href="sports-nutrition/clear-whey-isolate-mandarin-flavour/13891054.html">
                  <img class="athenaProductBlock_image" alt="한정판 클리어 웨이 아이솔레이트 - 감귤" width="300" height="300"
                    src="https://static.thcdn.com/images/large/webp//productimg/300/300/13891054-1164979134857822.jpg"
                    crossorigin="" loading="lazy">
                </a>
              </div>
              <h3 class="athenaProductBlock_titleContainer trackwidget" data-block-name="December BAU"
                data-block-type="" data-widget-id="4054883">
                <a class="athenaProductBlock_title trackwidget"
                  href="sports-nutrition/clear-whey-isolate-mandarin-flavour/13891054.html">



                  한정판 클리어 웨이 아이솔레이트 - 감귤


                </a>
              </h3>


              <div class="athenaProductBlock_priceBlock">

                <div class="athenaProductBlock_price">
                  <span class="athenaProductBlock_priceCurrency" content=""></span>
                  <span class="athenaProductBlock_priceValue" content="₩61,900">₩61,900</span>
                </div>
              </div>
            </div>



          </li>
        </ul>
      </div>
     
</body>
</html>