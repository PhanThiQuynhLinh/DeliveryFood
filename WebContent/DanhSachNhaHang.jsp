<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@page import="model.bean.NhaHang"%>
<%@page import="model.bean.LoaiNhaHang"%>

<!DOCTYPE <!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Danh Sách Nhà Hàng</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
        crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>

    <link rel="stylesheet" type="text/css" href="css/BS4.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <style>
        body {
            background-color: #f2f2f2;
        }

        .atom-filter a.filter-label-selected,
        .atom-filter a.kitchenfilter_selected {
            background-color: #ff8000;
            color: #fff;
        }

        .atom-filter>a {

            height: 40px;
            line-height: 37px;
            white-space: nowrap;
            margin-bottom: 4px;
            box-shadow: 0 2px 2px #cfcac4;
            display: inline-block;
            background-color: #fff;
            padding: 0 16px;
            width: 100%;
            border-radius: 3px;
            font-size: 15px;
        }

        a {
            cursor: pointer;
            outline: 0;
            text-decoration: none;
        }

        .atom-filter a {
            color: #666;
        }

        .atom-filter .filter-label:before {
            font-family: fontello;
            content: attr(data-icon);
            font-size: 24px;
            margin-right: 14px;
            top: 2px;
            position: relative;
        }

        .restaurant {
            min-height: 118px;
            padding: 16px;
            margin: 4px 0;
        }

        .restaurant {
            position: relative;
            border-bottom: 1px solid #ddd;
            background-color: #fff;
            padding: 2px;
            cursor: pointer;
        }

        .restaurant .logowrapper {
            width: 33%;
            padding: 8px 16px;
            float: left;
            position: relative;
            text-align: center;
        }

        .restaurant .logo-n {
            max-width: 155px;
            text-align: left;
            font-size: 12px;
            display: inline-block;
            position: relative;
            width: 100%;
            text-align: left;
            font-size: 12px;
        }

        .restaurant .logo-n img {
            width: 100%;
            height: auto;
            display: inline-block;
        }

        img {
            vertical-align: middle;
            border: 0;
        }

        a {
            cursor: pointer;
            outline: 0;
            color: #1574f5;
            text-decoration: none;
        }

        .restaurant .detailswrapper {
            width: 67%;
            font-size: 15px;
            padding-bottom: 0;
        }

        .restaurant .detailswrapper {
            float: left;

            line-height: 1.7;

            padding: 8px 4px;
        }

        .restaurant .detailswrapper .details {
            font-size: 13px;
            line-height: 2em;
        }

        .restaurant .restaurantname a {
            line-height: 1.4rem;
            font-size: 1.2rem;
            margin: 0 0 8px;
            font-weight: 600;
            text-align: left;
            color: #0a3847;
        }

        a {
            cursor: pointer;
            outline: 0;

            text-decoration: none;
        }

        .restaurant .bottomwrapper {

            padding-top: 4px;
            padding-bottom: 4px;
            min-width: 210px;
        }

        .restaurant .detailswrapper .details .delivery {
            line-height: 18px;
        }

        .restaurant .detailswrapper .details .delivery div {
            float: left;
            margin-right: 12px;
        }

        .restaurants .closed {
            color: red;
        }

        .grid:after {
            clear: both;
        }

        .grid:after,
        .grid:before {
            display: table;
            content: "";
            line-height: 0;
        }


        .atom-accordion-down section.open {
            max-height: 2500px;
            visibility: visible;
            transition: max-height .9s ease;
            transform: translateZ(0);
        }

        .atom-accordion-down section {
            display: block;
            overflow: hidden;
        }

        .atom-accordion-down section {
            display: block;
            max-height: 0;
            overflow: hidden;
            transition: max-height .45s ease;
            transform: translateZ(0);
        }

        #myBtn {
            display: none;
            position: fixed;
            bottom: 30px;
            right: 25px;
            z-index: 99;
            font-size: 16px;
            border: none;
            outline: none;
            background-color: orange;
            color: white;
            cursor: pointer;
            padding: 15px;
            border-radius: 4px;
        }
    .footer a{
        color: orange;
    }
  .the{
    position: relative;
    color: #fff !important;
    margin: 0;
    padding: 0 0 10px;
    font-size: 27px;
    font-weight: 700;
    line-height: 36px;
    text-transform: uppercase;
}
    </style>
</head>

<body>


    <div class="header">
           <div class="container-fluid" style="background-image:linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.6)),  url('https://images.unsplash.com/photo-1535567465397-7523840f2ae9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1014&q=80');
			background-position: center;
			background-size: cover;
			background-repeat: no-repeat;
             height:300px">
	<h3 class="text-center" style="color:white; font-weight: bold; font-size: 30px; padding-top: 130px">Đặt thức ăn trực tuyến tại<br> <bean:write name="danhSachNhaHangTrongKhuVucForm" property="tenKhuVuc"></bean:write></h3
	><hr style="height: 2px;width: 200px; margin:auto; background-color: orange" class="mt-2"></div>
    </div>


    <div class="container">
        <div class="row">
            <div class="col-md-3 left pt-4">
                <h6><bean:write name="danhSachNhaHangTrongKhuVucForm" property="soLuongNhaHang"/> Nhà Hàng</h6>
                <h6>Loại Nhà Hàng</h6>

                <label class="atom-filter">
               		 <html:link action="/danh-sach-nha-hang-trong-khu-vuc?maLoaiNhaHang=${maLoaiNhaHang}" styleClass="filter-label filter-reset kitchenfilter_selected" >
                				<i class="fas fa-utensils"></i> Chọn Tất Cả</span>
                			</html:link>
               		 <logic:iterate name="danhSachNhaHangTrongKhuVucForm" property="danhSachLoaiNhaHang" id="loaiNhaHang">
              			
              			<bean:define id="maLoaiNhaHang" name="loaiNhaHang" property="maLoaiNhaHang"></bean:define>
              			<bean:define id="maKhuVuc" name="danhSachNhaHangTrongKhuVucForm" property="maKhuVuc"></bean:define>
                  			<html:link action="/danh-sach-nha-hang-trong-khu-vuc?maLoaiNhaHang=${maLoaiNhaHang}" styleClass="filter-label subcatlink text-decoration-none" >
                				<bean:write name="loaiNhaHang" property="tenLoaiNhaHang"/> <span></span>
                			</html:link>
              
                      </logic:iterate>
                </label>
				
				
                <a class="text-link showhide-content-link open" data-toggle="HÆ¡n ná»¯a " id="hien"></i></a>
            </div>

            <div class="col-md-9 ">
            
             <logic:iterate name="danhSachNhaHangTrongKhuVucForm" property="danhSachNhaHang" id="nhaHang">
            
                <div class="restaurant grid pt-4 pb-4">
                    <div class="logowrapper grid-07">
                        <div class="logo-n">
                            <a href="#" class="img-link">
                                <img class="restlogo lazy-loaded" src="//static.vietnammm.com/images/restaurants/vn/NQ75737/logo_465x320.png"
                                    data-original="//static.vietnammm.com/images/restaurants/vn/NQ75737/logo_465x320.png"
                                    border="0" alt="KFC - KFC - Ngon TrÃªn Tá»«ng NgÃ³n Tay">
                            </a>
                        </div>
                    </div>
                    <div class="detailswrapper grid-13">
                        <h2 class="restaurantname">
                           
                                <bean:define id="maNhaHang" name="nhaHang" property="maNhaHang"></bean:define>
                                <html:link action="/danh-sach-mon-an-trong-nha-hang?maNhaHang=${maNhaHang}" styleClass="restaurantname">
                                	<bean:write name="nhaHang" property="tenNhaHang"/>
                                </html:link>
                        </h2>
                        <div class="review-rating">
                            <div class="review-stars">
                                <span style="width: 80%;" class="review-stars-range"></span>
                            </div>
                            <span class="rating-total"></span>
                        </div>

                        <div class="kitchens">
                            <span></span>
                        </div>
                        <div class="bottomwrapper grid-24 details">
                            <div class="delivery">
                                <div class="open closed">
                                    <i class="fas fa-bicycle" style="font-size: 15px"></i> <bean:write name="nhaHang" property="phiGiaoHang"/> VNĐ
                                </div>
                                <div class="delivery">
                                    <i class="far fa-clock"></i> <bean:write name="nhaHang" property="khoangThoiGianShip"/> phút
                                </div>
                                <div class="min-order">
                                    <i class="fas fa-database"></i> Tối Thiểu. <bean:write name="nhaHang" property="donHangToiThieu"/> VNĐ
                                </div>
                                <!-- <div class="address"><i class="fas fa-map-pin"></i> N.H.SÆ¡n</div> -->
                            </div>
                        </div>

                    </div>
                </div>

 			</logic:iterate>
            
        </div>
    </div>
    </div>
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


    <button onclick="topFunction()" id="myBtn" title="Go to top"><i class="fa fa-arrow-up" style="font-size:30px"></i></button>




    <script>
        // When the user scrolls down 1500px from the top of the document, show the button

        window.onscroll = function () {
            scrollFunction()
        };

        function scrollFunction() {
            if (document.body.scrollTop > 1000 || document.documentElement.scrollTop > 1000) {
                document.getElementById("myBtn").style.display = "block";
            } else {
                document.getElementById("myBtn").style.display = "none";
            }
        }

        // When the user clicks on the button, scroll to the top of the document
        function topFunction() {
            document.body.scrollTop = 0;
            document.documentElement.scrollTop = 0;
        }
    </script>
    <script>
        $(document).ready(function () {
            $("#hien").click(function () {
                $('#hienMenu').toggleClass('d-none', 1000);
            });
        });
    </script>



</body>

</html>