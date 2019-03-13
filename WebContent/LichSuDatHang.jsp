<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="model.bean.LichSuDatHang"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Lịch Sử Đặt Hàng</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
        crossorigin="anonymous">
    <style>
        .btn-search {
            background: #424242;
            border-radius: 0;
            color: #fff;
            border-width: 1px;
            border-style: solid;
            border-color: #1c1c1c;
        }

        .btn-search:link,
        .btn-search:visited {
            color: #fff;
        }

        .btn-search:active,
        .btn-search:hover {
            background: #1c1c1c;
            color: #fff;
        }

        .input-group {
            width: 300px;
            float: right;
        }
    </style>
</head>

<body>
    <div class="container-fluid" style="background-image:linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.6)),  url('images/8.jpg');
        background-position: center;
        background-size: cover;
        background-repeat: no-repeat;
         height:300px">
        <p style="text-align:center; color:white; font-weight: bold; font-size: 30px; padding-top: 150px; margin: 0">Lịch Sử Đặt Hàng</p>
        <hr style="width: 200px; margin:auto; background-color: orange" class="mt-2">
    </div>
    <div class="container">
        <!-- <h2 class="text-center">Lá»ch Sá»­ Äáº·t HÃ ng</h2>   -->

      <!--   <div class="input-group" style="margin-top: 50px;">
            <input type="text" class="form-control" placeholder="TÃ¬m kiáº¿m...">
            <span class="input-group-btn">
                <button class="btn btn-search" type="button">
                    <i class="fa fa-search fa-fw"></i>
                </button>
            </span>
        </div> -->

        <br>
        <br>
        <br>
        <table class="table table-striped" style="margin-top: 50px;">
            <thead>
                <tr>
                    <th scope="col">Mã Hóa Đơn</th>
                    <th scope="col">Ngày Mua</th>
                    <th scope="col">Nhà Hàng</th>
                    <th scope="col">Sản Phẩm</th>
                    <th scope="col">Tổng Tiền</th>
                </tr>
            </thead>
            <tbody>
              <logic:iterate name="lichSuDatHangForm" property="danhSachLichSuDatHang" id="lichSu">
                <tr>
                    <th scope="row"><bean:write name="lichSu" property="maDonHang"/></th>
                    <td><bean:write name="lichSu" property="ngayXuatDon"/></td>
                    <td><bean:write name="lichSu" property="tenNhaHang"/></td>
                    <td>
                        <p><bean:write name="lichSu" property="tenMonAn"/> </p>
                    </td>
                    <td><bean:write name="lichSu" property="tongTienThanhToan"/> VNĐ</td>
                </tr>
                </logic:iterate>
              

            </tbody>
        </table>
        <center>
        <button class="btn btn-primary " type="submit" style="margin-bottom: 50px; font-weight: bold;" onclick="history.back()">Quay lại</button>
        </center>
     
      

</body>

</html>