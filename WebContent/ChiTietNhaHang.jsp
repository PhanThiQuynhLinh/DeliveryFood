<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@page import="model.bean.NhaHang"%>
<%@page import="model.bean.MonAn"%>
<%@page import="model.bean.LoaiMonAn"%>
<%@page import="common.StringProcess"%>

<!DOCTYPE <!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Chi Tiết Nhà Hàng</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/BS4.css">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
    <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
    <link rel="stylesheet" href="css/chitietnhahang.css">
</head>



<body>
    
        <section class="bg-1 h-900x main-slider pos-relative">
                <div class="triangle-up pos-bottom"></div>
                <div class="w-25 mr-5 input-group md-form form-sm form-1 pl-0 float-right">
                        <div class="input-group-prepend">
                          <span class="input-group-text purple lighten-3" id="basic-text1"><i class="fas fa-search text-white"
                              aria-hidden="true"></i></span>
                        </div>
                        <input class="form-control my-0 py-1" type="text" placeholder="Search" aria-label="Search">
                       <!--  <a href="/gio-hang.do" class="ml-3"> -->
                        <html:link action="/gio-hang?command=xem" styleClass="ml-3">
                        <i class='fas fa-shopping-cart' style='font-size:28px; color: orange; position: fixed;'></i></html:link></span>
                      </div>
                <div class="container h-100"><span class="">
                <div class="dplay-tbl">
                <div class="dplay-tbl-cell center-text color-white">
                <h5 style="font-family: 'Kaushan Script', cursive;"><b>HÃY ĐỂ CHÚNG TÔI PHỤC VỤ BẠN</b></h5>
                <h1 class="mt-30 mb-15" style="font-family: 'Kaushan Script', cursive;"><bean:write name="danhSachMonAnTrongNhaHangForm" property="tenNhaHang"/></h1>
                <h5><a href="#voday" class="btn-primaryc plr-25" ><b>MÓN ĂN HÔM NAY</b></a></h5>
                </div>
                </div>
                </div>
                </section>
    <section class="story-area left-text center-sm-text pos-relative">
        <div class="abs-tbl bg-2 w-20 z--1 dplay-md-none"></div>
        <div class="abs-tbr bg-3 w-20 z--1 dplay-md-none"></div>
        <div class="container">
        <div class="heading" >
        <img class="heading-img" src="images/logo.png" alt="">
        <h2 style="font-family: 'Kaushan Script', cursive;" >Our Story</h2>
        </div>
        <div class="row">
        <div class="col-md-6">
       <!--  <p class="mb-30">Maecenas fermentum tortor id fringilla molestie. In hac habitasse
        platea dictumst. Morbi maximus
        lobortis ipsum, ut blandit augue ullamcorper vitae.
        Nulla dignissim leo felis, eget cursus elit aliquet ut. Curabitur vel convallis
        massa. Morbi tellus
        tortor, luctus et lacinia non, tincidunt in lacus.
        Vivamus sed ligula imperdiet, feugiat magna vitae, blandit ex. Vestibulum id
        dapibus dolor, ac
        cursus nulla. </p>
        </div>
        <div class="col-md-6">
        <p class="mb-30">Maecenas fermentum tortor id fringilla molestie. In hac habitasse platea
        dictumst.Morbi maximus lobortis ipsum, ut blandit augue ullamcorper vitae.
         Nulla dignissim leo felis, eget cursus elit aliquet ut. Curabitur vel
        convallismassa. Morbi tellus tortor, luctus et lacinia non, tincidunt in lacus.
        Vivamus sed ligula imperdiet, feugiat magna vitae, blandit ex. Vestibulumidda
        pibus dolor, accursus nulla. </p> -->
        </div>
        </div>
        </div>
    </section>

    <section class="story-area bg-seller color-white pos-relative">
            <div class="pos-bottom triangle-up"></div>
            <div class="pos-top triangle-bottom"></div>
            <div class="container">
            <div class="heading">
            <img class="heading-img" src="images/logo.png" alt="">
            <h2 style="font-family: 'Kaushan Script', cursive;">Best Sellers</h2>
            </div>
            <div class="row">
            <logic:iterate name="danhSachMonAnTrongNhaHangForm" property="danhSachTopThucAn" id="monAn">
           <bean:define id="maMonAn" name="monAn" property="maMonAn"/>
            <div class="col-lg-3 col-md-4  col-sm-6 ">
            	<div class="center-text mb-30">
            	<div class="Ã¯mg-200x mlr-auto pos-relative">
            	<h6 class="ribbon-cont"><div class="ribbon primary"></div><b>OFFER</b></h6>
            	<img src="images/ctnhahang5.png" alt="">
            	</div>
            	<h5 class="mt-20"><bean:write name="monAn" property="tenMonAn"/></h5>
            	<h4 class="mt-5"><b><bean:write name="monAn" property="giaBan"/> VNĐ</b></h4>
            	<h6 class="mt-20"><a href="./gio-hang.do?command=them&maMonAn=${maMonAn}" class="btn-brdr-primary plr-25"><b>Đặt Hàng Ngay</b></a></h6>
           		</div>
            </div>
            </logic:iterate>
           <!--  <center>
            <h6 class="center-text mt-40 mt-sm-20 mb-30" ><a href="#voday" class="btn-primaryc plr-25"><b>MÓN ĂN HÔM NAY</b></a></h6>
            </center> -->
            </div>
    </section>

    <section>
            <div class="container">
            <div class="heading">
            <img class="heading-img" src="images/logo.png" alt="">
            <h2 style="font-family: 'Kaushan Script', cursive;" id = "voday">Our Menu</h2>
            </div>
            <div id="myDIV">
                <div class="row" >
                    <div class="col-sm-12">
                        <ul class="selecton brdr-b-primary mb-70">
                        <li>
                        	<!-- <a class="btn active"class="btn tablinks" onclick="openLoaiMon(event, 'All')" value = "all"><b>ALL</b></a></li> -->
                        	<html:link linkName="maLoaiMonAn" action="/danh-sach-mon-an-trong-nha-hang?maLoaiMonAn=all" styleClass="btn tablinks">Tất Cả</html:link>
                        <logic:iterate name="danhSachMonAnTrongNhaHangForm" property="danhSachLoaiMonAn" id="loaiMonAn">
                        <bean:define id="maLoaiMonAn" name="loaiMonAn" property="maLoaiMonAn"></bean:define>
                        <li>
                        	<html:link linkName="maLoaiMonAn" action="/danh-sach-mon-an-trong-nha-hang?maLoaiMonAn=${maLoaiMonAn }" styleClass="btn tablinks"><b><bean:write name="loaiMonAn" property="tenLoaiMonAn"/></b></html:link>
                        	<%-- <a class="btn tablinks" value = "<bean:write name="loaiMonAn" property="maLoaiMonAn"/>" ><b><bean:write name="loaiMonAn" property="tenLoaiMonAn"/></b></a> --%>
                    	</li>
                        </logic:iterate>
                        </ul>
                    </div>
                </div>
            </div>    
            
             <%--  <logic:iterate name="danhSachMonAnTrongNhaHangForm" property="danhSachLoaiMonAn" id="loaiMonAn"> --%>
           	 <div id="<bean:write name="loaiMonAn" property="maLoaiMonAn"/>" class="tabcontent">
                    <div class="row">
                         <logic:iterate name="danhSachMonAnTrongNhaHangForm" property="danhSachMonAn" id="monAn">
                        
                        <div class="col-md-6 food-menu pasta ">
                        <div class="sided-90x mb-30 ">
                        <div class="s-left"><img class="br-3" src="images/ctnhahang6.jpg" alt="Menu Image"></div>
                        <div class="s-right">
                       
                        <h5 class="mb-10"><b id="MMA004"  <bean:define id="maMonAn" name="monAn" property="maMonAn"/><bean:define id="tenMonAn" name="monAn" property="tenMonAn"/>><bean:write name="monAn" property="tenMonAn"/></b><b class="color-primary float-right"></b>
                        	<%-- <bean:define id="tenMonAn" name="monAn" property="tenMonAn"/> --%>
                        	<p>${tenMonAn}</p>
                        	<p>${maMonAn}</p>
                            <div id="myModal" class="modal">

                                    <!-- Modal content -->
                                    <div class="modal-content">
                                      <div class="menu-meals-group" id="QO1717RN" anchor-id="thloi_Mn_mi">
                                               
                                              <div class="category-menu-meals">
                                                  <div class="meal" id="Q77513OO3" itemscope="" itemtype="http://schema.org/Product">
                                                    <div class="meal-wrapper productimg">
                                                  <form action="#" method="post" onsubmit="menucard_AddSimpleProductToBasket('Q77513OO3'); return false;" id="productformQ77513OO3">
                                                  <div class="meal-description-texts menu-meal">
                                                    <span class="meal-name" itemprop="name"><b>
                                                      ${tenMonAn}</b></span>
                                                          <span class="meal-icons"></span>
                                                    <div class="meal-description-attribute-descriptions">
                                                  <p> - Chá»©a caffeine (25,0 mg/100 ml)</p>
                                                <p>- Maecenas fermentum tortor id fringilla molestie. In hac habitasse platea dictumst.</p>
                                               <!--  <a href="giohang.html"><input type="button" class="button1 mt-3" value="Mua ngay"> --></a>
                                                <html:link action="/gio-hang?command=them&maMonAn=${maMonAn}"></html:link>
                                                </div>
                                                      </div>
                                                  </form></div>
                                                  <div class="meal-add-btn-wrapper productimg" itemprop="offers" itemscope="" itemtype="http://schema.org/Offer">
                                                                      <div class="meal-product-img">
                                                              <img class="img1 menucardproductimg lazy-loaded"  src="images/ctnhahang7.png" alt="TrÃ  ÄÃ o (vá»«a)" border="0">
                                                              <span class="close" style="color:red;">&times;</span>
                                                          </div>
                                                              </div>
                                                        </div>
                                          </div>
                                    </div>
                                  </div>
                        </h5>
                        <p class="pr-70"><bean:write name="monAn" property="moTa"/> </p>
						<b class="color-primary float-left"><bean:write name="monAn" property="giaBan"/> VNĐ<html:link action="/gio-hang?command=them&maMonAn=${maMonAn}"><i style="font-size:24px; border-left: 1px solid black;color: orange; padding-left: 20px; padding-right: 20px" class="fa">&#xf217;</i></html:link></b>
                        
                         <script>
           					 var modal = document.getElementById('myModal');
            				
          					 var btn = document.getElementById('MMA004');
            
           					 var span = document.getElementsByClassName("close")[0];
            
            				btn.onclick = function() {
                			modal.style.display = "block";
            				}
            
           					 span.onclick = function() {
               				 modal.style.display = "none";
          					  }
            
           					 window.onclick = function(event) {
               				 if (event.target == modal) {
                   			 modal.style.display = "none";
               					 }	
          						  }
          					  </script>
                        </div>
                        </div>
                        </div>
                        
                         </logic:iterate>
                        
                       
                    </div>
                </div>
<%-- </logic:iterate> --%>
          
            </div><br><br>
         <!--   <div class="pagination" style="margin-left:400px">
                    <a href="#">&laquo;</a>
                    <a href="#">1</a>
                    <a class="active" href="#">2</a>
                    <a href="#">3</a>
                    <a href="#">4</a>
                    <a href="#">5</a>
                    <a href="#">6</a>
                    <a href="#">&raquo;</a>
                  </div>
            </div> -->
            </section>

            <div class="footer bg-dark w-100">
                    <div class="container mt-5 pt-5 pb-5">
                        <a class="pr-4" href="#">Giới thiệu một nhà hàng</a>
                        <a class="pr-4" href="#">Đăng ký nhà hàng</a>
                        <a class="pr-4" href="#">Tuyển dụng</a>
                        <a class="pr-4" href="#">Điều khoản sử dụng</a>
                        <a class="pr-4" href="#">Cam kết bảo mật</a>
                        <a class="pr-4" href="#">Chính sách giải quyết khiếu nại</a>
                        <a class="pr-4" href="#">Tin tức</a>
                        <p class="text-center pt-4"><a href="#">© 2019 Vietnammm.com</a></p>
                    </div>
                </div>
            <script>
                    function openLoaiMon(evt, tenLoai) {
                      var i, tabcontent, tablinks;
                      tabcontent = document.getElementsByClassName("tabcontent");
                      for (i = 0; i < tabcontent.length; i++) {
                        tabcontent[i].style.display = "none";
                      }
                      tablinks = document.getElementsByClassName("tablinks");
                      for (i = 0; i < tablinks.length; i++) {
                        tablinks[i].className = tablinks[i].className.replace(" active", "");
                      }
                      document.getElementById(tenLoai).style.display = "block";
                      evt.currentTarget.className += "active";
                    }
                    </script>
            <script>
                    // Add active class to the current button (highlight it)
                    var header = document.getElementById("myDIV");
                    var btns = header.getElementsByClassName("MMA004");
                    for (var i = 0; i < btns.length; i++) {
                      btns[i].addEventListener("click", function() {
                      var current = document.getElementsByClassName("active");
                      current[0].className = current[0].className.replace(" active", "");
                      this.className += " active";
                      });
                    }
                    </script>


<script>					
        $("span.menu").click(function(){
            $(".top-nav ul").slideToggle("slow" , function(){
            });
        });
    </script>
    <!-- script-for-menu -->
   <!--  <script>
            var modal = document.getElementById('myModal');
            
            var btn = document.getElementById("<bean:write name="monAn" property="maMonAn"/>");
            
            var span = document.getElementsByClassName("close")[0];
            
            btn.onclick = function() {
                modal.style.display = "block";
            }
            
            span.onclick = function() {
                modal.style.display = "none";
            }
            
            window.onclick = function(event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
            </script> -->
</body>
</html>