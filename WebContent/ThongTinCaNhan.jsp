
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="model.bean.KhachHang"%>
<!DOCTYPE html>
<html html="en">
<head>
	<meta charset="utf-8">
	
	<link rel="stylesheet" type="text/css" href="css/dialog.css">
	<link rel="stylesheet" type="text/css" href="css/style1.css">
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script type="text/javascript" src="js/dialog.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Thông Tin Cá Nhân</title>
</head>
<body>
		<div class="container-fluid" style="background-image:linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.6)),  url('images/8.jpg');
        background-position: center;
        background-size: cover;
        background-repeat: no-repeat;
         height:300px">
<p style="text-align:center; color:white; font-weight: bold; font-size: 30px; padding-top: 130px; margin: 0">THÔNG TIN CÁ NHÂN</p
><hr style="width: 200px; margin:auto; background-color: orange" class="mt-2"></div>
<div class="content-tk">
			<div class="container">
				<div class="thanhvien">
				<h1>Xin chào thành viên của chúng tôi !!!</h1>
					<html:form action="/trang-chu">
					<h2>Thông tin cá nhân</h2>
					<div class="thongtincanhan">
						<!-- <p class="thongtincanhan">ThÃ´ng tin cÃ¡ nhÃ¢n</p> -->
						<div class="grid name">
							<p class="add-info">Tên: </p>
							<html:text property="tenKhachHang" styleClass="address" readonly="true"></html:text>
						</div>
						<div class="grid email">
							<p class="add-info">Email: </p>
							<html:text property="email" styleClass="address" readonly="true"></html:text>
						</div>
						<div class="grid phone">
							<p class="add-info">Số Điện Thoại: </p>
							<html:text property="soDienThoai" styleClass="address" readonly="true"></html:text>
						</div>

						<div class="grid sex" >
							<p class="add-info">Giới Tính: </p>
							<div class = "gioiTinh">
							<html:radio property="gioiTinh" value="1" style="margin-right: 10px;" disabled="true">Nam</html:radio>
            				<html:radio property="gioiTinh" value="0" style="margin: 0px 10px 0px 30px;" disabled="true">Nữ</html:radio>
						</div><br>
						</div>
						<!-- <div class="grid namect">
							<p class="add-info">Mật Khẩu </p>
							<input class="address" type="password" name="" placeholder="Máº­t Kháº©u..">
						</div> -->
						<div class="grid namect">
							<p class="add-info">Ngày Sinh: </p>
							<p style="font-weight: bold;"><bean:write name="dangKyKhachHangForm" property="ngaySinh"/>ddd</p>
						</div>
						<!-- <div class="grid namect">
							<p class="add-info">Nháº­p Láº¡i Máº­t Kháº©u: </p>
							<input class="address" type="password" name="" placeholder="Máº­t Kháº©u.." >
						</div> -->
						
					</div>
					
					
					<div class="ttdiachi">
						<p class="ttdiachi">Thông Tin Địa Chỉ</p>
							<div class="grid phone">
								<p class="add-info">Số Nhà Và Tên Đường: </p>
								<p style="font-weight: bold;"><bean:write name="dangKyKhachHangForm" property="diaChi"/></p>
							</div>
							<div class="grid phone">
								<p class="add-info">Quận: </p>
								<p style="font-weight: bold;"><bean:write name="dangKyKhachHangForm" property="tenKhuVuc"/></p>
							</div>
					</div>
						
					
					
					
					<div class="hoantat">
						<a href="index.html" onclick="myFunction()" class="button">Cập nhật</a>
						<a href="index.html" class="button" onclick="history.back()">Hủy</a>
					</div>
					</html:form>
				</div>

			</div>
		</div>

		<div class="footer ">
				<div class="container">
					<a href="#">Giới thiệu một nhà hàng</a>
					<a href="#">Đăng ký nhà hàng</a>
					<a href="#">Tuyển dụng</a>
					<a href="#">Điều khoản sử dụng</a>
					<a href="#">Cam kết bảo mật</a>
					<a href="#">Chính sách giải quyết khiếu nại</a>
					<a href="#">Tin tức</a>
					<p style="text-align:center"><a href="#">© 2019 Nhom Java 12</a></p>
				</div>
			</div>

			<script>
					function myFunction() {
					  alert("Bạn đã cập nhật thành công!");
					}
			</script>
</body>
</html>