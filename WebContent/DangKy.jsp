

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8">
	
	<link rel="stylesheet" type="text/css" href="css/dialog.css">
	<link rel="stylesheet" type="text/css" href="css/style1.css">
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script type="text/javascript" src="js/dialog.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>ĐĂNG KÝ THÀNH VIÊN</title>
</head>
<body>
		<div class="container-fluid" style="background-image:linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.6)),  url('images/8.jpg');
        background-position: center;
        background-size: cover;
		background-repeat: no-repeat;
         height:300px">
<p style="text-align:center; color:white; font-weight: bold; font-size: 30px; padding-top: 130px; margin:0"> ĐĂNG KÝ THÀNH VIÊN</p
><hr style="width: 200px; margin:auto; background-color: orange; margin-top: 20px" class="mt-2"></div>
<div class="content-tk">
			<div class="container">
				<div class="thanhvien">
					<html:form action="/dang-ky-khach-hang">
					<h1>Bạn đã sẵn sàng trở thành Thành Viên?</h1>
				
					<h2>Thông tin cá nhân</h2>
					
					 <div class="thongtincanhan">
						<!-- <p class="thongtincanhan">ThÃ´ng tin cÃ¡ nhÃ¢n</p> -->
						<div class="grid name">
							<p class="add-info">Tên <span style="color: red">*</span>: </p>
							<input class="address" type="text" name="tenKhachHang" placeholder="Nhập Tên">
							<p style="color: red"><html:errors property="tenKhacHangError"/></p>
						</div>
						<div class="grid email">
							<p class="add-info">Email: </p>
							<input class="address" type="email" name="email" placeholder="Nhập email">
							<p style="color: red"><html:errors property="tenKhacHangError"/></p>
						</div>
						<div class="grid phone">
							<p class="add-info">Số Điện Thoại: </p>
							<input class="address" type="text" name="soDienThoai" placeholder="Nhập số điện thoại..">
						<p style="color: red"><html:errors property="tenKhacHangError"/></p>
						</div>

						<div class="grid sex" >
							<p class="add-info">Giới Tính: </p>
							<div class = "gioiTinh">
							<input class="address" type="radio" name="gioiTinh" value = "1" style="width: 15px;"> Nam
							<input class="address" type="radio" name="gioiTinh" value = "0" style="width: 15px;"> Nữ
						<p style="color: red"><html:errors property="tenKhacHangError"/></p>
						</div><br>
						</div>
						<div class="grid namect">
							<p class="add-info">Mật Khẩu: </p>
							<input class="address" type="password" name="matKhau" placeholder="Nhập mật khẩu..">
						<p style="color: red"><html:errors property="tenKhacHangError"/></p>
						</div>
						<div class="grid namect">
							<p class="add-info">Ngày Sinh: </p>
							<input class="address" type="date" name="ngaySinh" >
						<p style="color: red"><html:errors property="tenKhacHangError"/></p>
						</div>
						<div class="grid namect">
							<p class="add-info">Nhập Lại Mật Khẩu: </p>
							<input class="address" type="password" name="" placeholder="Nhập mật khẩu.." >
						<p style="color: red"><html:errors property="tenKhacHangError"/></p>
						</div>
						
					</div>
					
					
					<div class="ttdiachi">
						<p class="ttdiachi">Thông tin địa chỉ</p>
							<div class="grid phone">
								<p class="add-info">Số Nhà Và Tên Đường: </p>
								<input class="address" type="text" name="diaChi" placeholder="Nhập địa chỉ..">
							<p style="color: red"><html:errors property="tenKhacHangError"/></p>
							</div>
							<div class="grid phone">
								<p class="add-info">Quận: </p>
								<html:select property="maKhuVuc" styleClass="address" name="dangKyKhachHangForm">
								<option value="">-- Chọn Khu Vực --</option>
								<html:optionsCollection name="dangKyKhachHangForm" property="danhSachKhuVuc" label = "tenKhuVuc" value = "maKhuVuc"/>
							</html:select>
							<%-- <p style="color: red"><html:errors property="tenKhacHangError"/></p>	 --%>
								
							</div>
					</div> 
						<center>
					<div class="hoantat">
							<html:submit value = "submit" property="submit" styleClass="button" ></html:submit>
							<%-- <html:submit value = "submit" property="submit" >Hiển Thị</html:submit> --%>
					</div></center>
					
				
					</html:form>
				</div>

			</div>
		</div>

			<div class="footer bg-dark w-100">
				<div class="container mt-5 pt-5 pb-5">
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
</body>
</html>