<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@page import="model.bean.KhuVuc"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Delish Food a Hotels and Restaurants Category Flat Bootstrap responsive Website Template | Home :: w3layouts</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Delish Food Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="./css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="./css/font-awesome.css" rel="stylesheet"> 
<link href="./css/style.css" rel="stylesheet" type="text/css" media="all" />


<!--web-fonts-->
<link href="//fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Tangerine:400,700" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!--//web-fonts-->
<style>
.box-ud {
    width: 100%;
    float: left;
    display: inline-flex;
    margin-top: 70px;
}
.box-ud .ud {
    width: 100%;
    border: 1px solid #f9f5f1;
    background: #fff;
    width: 33%;
    margin-left: 5%;
    margin-right: 5%;
    float: left;
    position: relative;
    min-height: 260px;
    padding: 16px;
    box-shadow: 2px 2px 10px 0 hsla(0,0%,50%,.4);
}
.title {
    text-align: center;
}
span#tg {
    color: #ff8000;
}
.box-ud .ud h2 {
    text-align: center;
    margin-top: 40px;
}
.uudai {
    background: #f9f5f1;
    padding-bottom: 70px;
}
i.fa.fa-check {
    color: #fff;
    line-height: 90px;
    font-size: 45px;
}
i.fa.fa-bullhorn{
    color: #fff;
    line-height: 90px;
    font-size: 45px; 
}
i.fa.fa-handshake-o{
    color: #fff;
    line-height: 90px;
    font-size: 45px; 
}
span.listbox-icon {
    width: 90px;
    height: 90px;
    display: inline-block;
    border-radius: 50%;
    background: #ff8000;
    text-align: center;
    position: absolute;
    left: 0;
    right: 0;
    margin: 0 auto;
    top: -45px;
    box-shadow: 2px 2px 10px 0 hsla(0,0%,50%,.4);
}
.box-ud .ud ul li {
    list-style-image: url(../images/list.png);
		margin-top: 10px;
		margin-left: 20px;
}
h1 {
    display: block;
    font-size: 1.5em;
    margin-block-start: 0.67em;
    margin-block-end: 0.67em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    font-weight: bold;
}
span#tg {
    color: #ff8000;
}
.dropbtn {
  background-color: transparent;
  color: white;
  padding: 10px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 200px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: orange; color:white}

.dropdown:hover .dropdown-content {
  display: block;
}
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 200px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
  position: relative;
  background-color: #fefefe;
  margin: auto;
  padding: 0;
  border: 1px solid #888;
  width: 450px;
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
  -webkit-animation-name: animatetop;
  -webkit-animation-duration: 0.4s;
  animation-name: animatetop;
  animation-duration: 0.4s
}

/* Add Animation */
@-webkit-keyframes animatetop {
  from {top:-300px; opacity:0} 
  to {top:0; opacity:1}
}

@keyframes animatetop {
  from {top:-300px; opacity:0}
  to {top:0; opacity:1}
}

/* The Close Button */
.close {
  color: white;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}

.modal-header {
  padding: 2px 16px;
  background-color: orange;
  color: white;
}

.modal-body {padding: 2px 16px;}

.modal-footer {
  padding: 2px 16px;
  background-color: orange;
  color: white;
}
</style>
</head>
<body>
<!-- banner -->
	<div class="banner" id="home">
		<!-- header -->
		<div class="banner-top">
			<div class="social-bnr-agileits">
				<ul>
					<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
					<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
					<li><a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
					<li><a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>					
				</ul>
			</div>
			<div class="contact-bnr-w3-agile">
				<ul>
					<li><i class="fa fa-envelope" aria-hidden="true"></i><a href="mailto:info@example.com">INFO@EXAMPLE.COM</a></li>
					
						<li><p style="color: white; font-weight: bold;"><bean:write name="trangChuForm" property="tenKhachHang"/></p></li>	
					<li>
						<div class="search">
							<input class="search_box" type="checkbox" id="search_box">
							<label class="icon-search" for="search_box"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
							<div class="search_form">
								<form action="#" method="post">
									<input type="search" name="Search" placeholder="Search..." required="" />
									<input type="submit" value="Send" />
								</form>
							</div>
						</div>
					</li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
		<header>
			<div class="container">

			<!-- navigation -->
			<div class="w3_navigation">
			<nav class="navbar navbar-default">
				<div class="navbar-header navbar-left">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<div class="w3_navigation_pos">
						<h1><a href="index.html"><span>D</span>elish <span>F</span>ood</a></h1>
					</div>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
					<nav class="menu menu--miranda">
						<ul class="nav navbar-nav menu__list">
							<li class="menu__item menu__item--current"><a href="index.html" class="menu__link">Trang Chủ</a></li>
							<li class="menu__item"><a href="#particles-js" class=" menu__link">Thông Tin</a></li>
							<li class="menu__item"><a href="#dichVu" class=" menu__link">Dịch Vụ</a></li>
							<li class="menu__item"><a href="gallery.html" class=" menu__link" >Gallery</a></li>
							
							 <li class="dropdown menu__item">
						<a href="#" class="dropdown-toggle menu__link"  data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Pages<span class="caret"></span></a>
						<ul class="dropdown-menu">
						
							<!-- <li><a href="codes.html">Short Codes</a></li>
							<li><a href="icons.html">Icons</a></li> -->
						</ul>
					</li>
							<li class="menu__item"><div class="dropdown">
									<button class="dropbtn"><i class="fa fa-align-justify" style="font-size:25px;"></i></button>
									<div class="dropdown-content">
											<div>
											 <html:link action="/thong-tin-ca-nhan">
												<i class="fa fa-address-book"></i> Thông tin cá nhân</a>
											</html:link> 
											
											</div>
											<div>
											 <html:link action="/gio-hang.do?command=xem">Đơn Hàng</html:link> 
											</div>
											 <div>
											<html:link action="/lich-su-dat-hang">Lịch sử đặt hàng</html:link>
											</div> 
											<div>
												<a href="#"id="myBtn">Điểm tích lũy</a>
												
												<%-- <html:link id = "myBtn">Điểm tích lũy</html:link> --%>
											</div>
											<div id="myModal" class="modal">
											<div class="modal-content">
													<div class="modal-header">
														<span class="close">&times;</span>
														<h2 class="text-center">Điểm tích lũy</h2>
													</div>
													<div class="modal-body">
														<p>Số điểm tích lũy hiện tại của bạn là : <span style="padding-left: 80px; font-size: 20px"><bean:write name="trangChuForm" property="diemTichLuy"/></span></p>
														<p>Tài khoản có giá trị giảm giá là : <span style="padding-left: 80px; font-size: 20px">7 %</span></p>
													</div>
													<div class="modal-footer">
														<h3>Modal Footer</h3>
													</div>
												</div>
											</div>
											<!-- <div><a href="#">Äá»i máº­t kháº©u</a></div>
											<div><a href="#">ÄÄng xuáº¥t</a></div> -->
									</div>
								</div></li>
						</ul>
					</nav>
				</div>
			</nav>	
	</div>
	<div class="clearfix"></div>
		<!-- //navigation -->
			</div>
		</header>
	<!-- //header -->
	<!-- banner-text -->
		<div class="banner-text"> 
			<h2>HÃY ĐỂ CHÚNG TÔI PHỤC VỤ BẠN</h2>
			<div class="book-form">
			<p>Lựa chọn khu vực của bạn.</p>
				
				  <html:form action="/danh-sach-nha-hang-trong-khu-vuc" >
					<div class="col-md-3 form-left-agileits-w3layouts" style="margin-left:250px">
							<label><i class="fa fa-users" aria-hidden="true"></i> Tên Khu Vực:</label>
							
							<html:select property="maKhuVuc" styleClass="form-control" name="trangChuForm">
								<option value="">-- Chọn Khu Vực --</option>
								<html:optionsCollection name="trangChuForm" property="danhSachKhuVuc" label = "tenKhuVuc" value = "maKhuVuc"/>
							</html:select>
					</div>
				<div class="col-md-3 form-left-agileits-submit">
							
							<html:submit value = "Hiển Thị" property="submit" >Hiển Thị</html:submit>
                           
					</div> 
				</html:form> 
			</div>
		</div>
		<!-- gallery -->
	<div class="gallery-ban" id="gallery">
	<div class="container">
				<ul id="flexiselDemo1">			
					<li>
						<div class="wthree_testimonials_grid_main">
							
									<img src="images/p1.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="wthree_testimonials_grid_main">
							
									<img src="images/p2.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					
					<li>
						<div class="wthree_testimonials_grid_main">
						
									<img src="images/p3.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="wthree_testimonials_grid_main">
						
									<img src="images/p6.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="wthree_testimonials_grid_main">
						
									<img src="images/p4.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="wthree_testimonials_grid_main">
						
									<img src="images/p5.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
				</ul>
				
	</div>
	</div>
	<!-- //gallery -->
	</div>
<!-- //banner -->
 <div class="ab-w3l-about" id = "dichVu" >
	<div class="container">
		 <h3 class="tittle-w3" ><span>Chào mừng đến với</span> Delish Food</h3>
			<p class="para-w3l">
				Chúng tôi luôn sẵn sàng phục vụ cho bạn mọi lúc mọi nơi. Chúng tôi sẽ đem đến những trải nghiệm thú vị cho bạn. Hãy thoải mái đặt món cùng Delish Food.
			</p>
				
	</div>
	<hr style="border:1px solid orange; width:200px; ">
</div>

<div class="content">
	<div class="container">
		<div class="sudung">
			<h2><span>Sử dụng Delish Food như thế nào ?</span></h2>
			<h2><span class="h">Vô cùng dễ dàng</span></h2>
		</div>
		<div class="huongdan">
			<div class="buoc b1">
				<!-- <img src="/images/b1.png"> -->
				<h3><span>Nhập vị trí của bạn<span></h3>
				<p>Chọn quận của bạn để hiển thị danh sách nhà hàng</p>
			</div>
			<div class="buoc b2">
				<!-- <img src="/images/b2.png"> -->
				<h3><span>Lựa Chọn Món<span></h3>
				<p>Lựa chọn món trong nhà hàng bạn muốn</p>
			</div>
			<div class="buoc b3">
				<!-- <img src="/images/b3.png"> -->
				<h3><span>Đặt hàng<span></h3>
				<p>Điền thông tin để hoàn tất việc đặt hàng</p>
			</div>
		</div>
	</div>
</div>

	<!--count-->
			<div class="count-agileits">
				<div id="particles-js" ></div>
					
					<div class="count-grids">
					<h3 class="tittle-w3">Tất cả những gì  <span>cần thiết</span> cho bạn</h3>
					<div class="count-bgcolor-w3ls">
						<div class="col-md-4 count-grid">
						<i class="fa fa-cutlery" aria-hidden="true"></i>
							<div class="count hvr-bounce-to-bottom">
							<div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='<bean:write name="trangChuForm" property="soLuongMonAn"/>' data-delay='.5' data-increment="100"><bean:write name="trangChuForm" property="soLuongMonAn"/></div> 
									<span></span>
									<h5>Món Ăn</h5>
							</div>
						</div>
						<div class="col-md-4 count-grid">
						<i class="fa fa-users" aria-hidden="true"></i>
							<div class="count hvr-bounce-to-bottom">
								 <div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='<bean:write name="trangChuForm" property="soLuongNhaHang"/>' data-delay='.5' data-increment="100"><bean:write name="trangChuForm" property="soLuongNhaHang"/></div> 
									<span></span>
									<h5>Nhà Hàng</h5>
							</div>
						</div>
						<div class="col-md-4 count-grid">
						<i class="fa fa-user-plus" aria-hidden="true"></i>
							<div class="count hvr-bounce-to-bottom">
							 <div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='<bean:write name="trangChuForm" property="soLuongKhachHang"/>' data-delay='.5' data-increment="100"><bean:write name="trangChuForm" property="soLuongKhachHang"/></div> 
									<span></span>
									<h5>Khách Hàng</h5>
								</div>
						</div>
						<div class="clearfix"></div>
						</div>
					</div>
			</div>
				<!--count-->
			
				<div class="uudai"><br><br>
						<div class="container">
							<div class="title">
								<h1><span>Delish Food</span></h1>
									<h1><span id="tg">Thời gian quý báu cho bạn</span></h1>
							</div>
							<div class="box-ud">
								<div class="ud ud1">
									<span class="listbox-icon" data-icon=""><i class="fa fa-bullhorn"></i></span>
									<h2><span>Uư đãi cho bạn</span></h2>
									<ul>
										<li>
											Khuyến mãi hằng ngày và xu hướng mới trên Twitter, Facebook và Instagram.
										</li>
									</ul>
								</div>
								<div class="ud ud2">
									<span class="listbox-icon" data-icon=""><i class="fa fa-handshake-o"></i></span>
									<h2><span>Đảm bảo với bạn</span></h2>
									<ul>
										<li>Không tính phí dịch vụ</li>
										<li>Chất lượng dịch vụ tuyệt vời</li>
										<li>Giá đảm bảo: thanh toán với giá bằng với giá tại nhà hàng</li>
									</ul>
								</div>
								<div class="ud ud3">
									<span class="listbox-icon" data-icon=""><i class="fa fa-check" aria-hidden="true"></i></span>
									<h2><span>Lợi ích cho bạn</span></h2>
									<ul>
										<li>1500 nhà hàng đối tác giao tận nơi cho mọi nhu cầu của bạn</li>
										<li>Thanh toán online hoặc bằng tiền mặt</li>
										<li>Đặt món mọi lúc mọi nơi bằng ứng dụng di động</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				<!--services-section-->

<!--//services-section-->

<!-- mail -->
				<div class="mail">
					<div class="mail-grid1">
					<div class="container">	
						<h3 class="tittle-w3">Contact <span>Info</span></h3>
							<div class="col-md-4 mail-agileits-w3layouts">
								<i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>
								<div class="contact-right">
									<p>Phone</p><span>+1 (100)222-23-33</span>
								</div>
							</div>
							<div class="col-md-4 mail-agileits-w3layouts">
								<i class="glyphicon glyphicon-envelope" aria-hidden="true"></i>
								<div class="contact-right">
									<p>Email</p><a href="mailto:info@example.com">info@example.com</a>
								</div>
							</div>
							<div class="col-md-4 mail-agileits-w3layouts">
								<i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i>
								<div class="contact-right">
									<p>Address</p><span>7784 Diamonds street, California, US.</span>
								</div>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					
			

			<div class="copyright-wthree">
				<p>&copy; 2017 Delish Food . All Rights Reserved | Design by <a href="http://w3layouts.com/">NhÃ³m Java 12 </a></p>
			</div>
<!-- //Footer -->

	<a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/numscroller-1.0.js"></script>
<script src="js/particles.js"></script>
<script src="js/app.js"></script>
<!--gallery-->
<script type="text/javascript">
							$(window).load(function() {
								$("#flexiselDemo1").flexisel({
									visibleItems:4,
									animationSpeed: 1000,
									autoPlay: true,
									autoPlaySpeed: 3000,    		
									pauseOnHover: true,
									enableResponsiveBreakpoints: true,
									responsiveBreakpoints: { 
										portrait: { 
											changePoint:480,
											visibleItems: 1
										}, 
										landscape: { 
											changePoint:640,
											visibleItems:2
										},
										tablet: { 
											changePoint:768,
											visibleItems: 3
										}
									}
								});
								
							});
					</script>
					<script type="text/javascript" src="js/jquery.flexisel.js"></script>
<!--gallery-->
<!-- Dropdown-Menu-JavaScript -->
			<script>
				$(document).ready(function(){
					$(".dropdown").hover(            
						function() {
							$('.dropdown-menu', this).stop( true, true ).slideDown("fast");
							$(this).toggleClass('open');        
						},
						function() {
							$('.dropdown-menu', this).stop( true, true ).slideUp("fast");
							$(this).toggleClass('open');       
						}
					);
				});
			</script>
		<!-- //Dropdown-Menu-JavaScript -->
<!-- Calendar -->
				<link rel="stylesheet" href="css/jquery-ui.css" />
				<script src="js/jquery-ui.js"></script>
				  <script>
						  $(function() {
							$( "#datepicker,#datepicker1,#datepicker2,#datepicker3" ).datepicker();
						  });
				  </script>
			<!-- //Calendar -->
 <!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
<!--js for bootstrap working-->
	<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<!-- script-for-menu -->
					<script>					
						$("span.menu").click(function(){
							$(".top-nav ul").slideToggle("slow" , function(){
							});
						});
					</script>
					<!-- script-for-menu -->
					<script>
							var modal = document.getElementById('myModal');
							
							var btn = document.getElementById("myBtn");
							
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
</body>
</html>