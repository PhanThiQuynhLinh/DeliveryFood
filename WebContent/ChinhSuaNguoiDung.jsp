<%@page import="model.bean.KhuVuc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<% response.setContentType("text/html;charset=utf-8"); %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="">
    <title>Admin </title>

    <!-- Bootstrap Core CSS -->
    <link href="bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- DataTables CSS -->
    <link href="bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="bower_components/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">
    <link href="js/flot-data.js">
    <link href="js/morris-data.js">
    <link href="bower_components\jquery\src\data.js">
     <!-- jQuery -->
    <script src="bower_components/jquery/dist/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js"></script>
</head>

<body>

    <div id="wrapper">

             <!-- include -->
<jsp:include page="MenuFormadmin.jsp"></jsp:include>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12" style="margin-left: 10px">
                        <h1 class="page-header">Người dùng
                            <small>Chỉnh sửa</small>
                        </h1>
                    </div>
                    <!-- /.col-lg-12 -->
                    <div class="col-lg-7" style="padding-bottom:120px; margin-left: 115px;">
                        <html:form action="sua-khach-hang.do" method="POST">
                        <div class="form-group">
                                <label>ID</label>
                                <!-- <input class="form-control" name="txtidUser" placeholder="" /> -->
                                <html:text readonly="true" styleClass="form-control" name="khachHangForm" property="maKhachHang"></html:text>
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <!-- <input class="form-control" type="email" name="txttenDangNhapUser" placeholder="" /> -->
                                <html:text styleClass="form-control" name="khachHangForm" property="email"></html:text>
                            </div>
                            <div class="form-group">
                                <label>Mật khẩu</label>
                                <!-- <input type="password" class="form-control" name="txtmatKhauUser" placeholder="" /> -->
                                <html:text styleClass="form-control" name="khachHangForm" property="matKhau"></html:text>
                            </div>
                             <div class="form-group">
                                <label>Họ tên</label>
                                <!-- <input class="form-control" name="txthoTen" placeholder="" /> -->
                                <html:text styleClass="form-control" name="khachHangForm" property="tenKhachHang"></html:text>
                            </div>
                             <div class="form-group">
                                <label>Ngày sinh</label>
                                <!-- <input type="date" class="form-control" name="txtngaySinhUser" placeholder="" /> -->
                                <html:text styleClass="form-control" name="khachHangForm" property="ngaySinh"></html:text>
                            </div>
                             <div class="form-group">
                                <label style="width: 130px">Giới tính </label>
                                
                                <html:radio name="khachHangForm" property="gioiTinh" value="1"/>Nam
                                <html:radio name="khachHangForm" property="gioiTinh" value="0"/>Nữ
                            </div>
                            <div class="form-group">
                                <label>Số điện thoại</label>
                                <!-- <input class="form-control" name="txtsoDienThoaiUser" placeholder="" /> -->
                                <html:text styleClass="form-control" name="khachHangForm" property="soDienThoai"></html:text>
                            </div>
                            <div class="form-group">
                                <label>Địa chỉ</label>
                                <!-- <input class="form-control" name="txtdiaChi" placeholder="" /> -->
                                <html:text styleClass="form-control" name="khachHangForm" property="diaChi"></html:text>
                            </div>
                            <div class="form-group">
                                <label>Khu vực</label>
                               <html:select styleClass="form-control" property="maKhuVuc">
                                	<html:optionsCollection name="khachHangForm" property="dsKhuVuc" label="tenKhuVuc" value="maKhuVuc"/>
                                </html:select>
<%--                                 <html:select property="tenKhuVuc"></html:select>
                                 <html:options name="khachHangForm" property=""/> --%>
                                
                            </div>
                            <button name="submit" value="submit" type="submit" class="btn btn-default">Hoàn tất</button>
                            <html:link styleClass="btn btn-default" action="/danh-sach-khach-hang.do">Hủy</html:link>
                            <!-- <button type="reset" class="btn btn-default">Hủy</button> -->
                        </html:form>
                    </div>
                </div>	
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>

    <!-- DataTables JavaScript -->
    <script src="bower_components/DataTables/media/js/jquery.dataTables.min.js"></script>
    <script src="bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });
    });
    </script>
</body>

</html>
