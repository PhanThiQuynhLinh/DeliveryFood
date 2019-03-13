<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="model.bean.HoaDon"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
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
</head>
<body>
  <div id="wrapper">
<!-- include -->
<jsp:include page="MenuFormAdminNH.jsp"></jsp:include>
 
        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 style="text-align: center;" class="page-header">Thống kê doanh thu
                        </h1>
                    </div>
                    <!-- /.col-lg-12 -->
                    
                    
                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer">
                    	<div class="row">
                    		<div class="col-sm-6">
                    		</div>
                    		<div class="col-sm-6">
                    			<div class="form-group" style="margin-left: 205px;">
                                <label>Thống kê</label>
                                <select class="form-control" name="txtloaiNhaHang" placeholder=""> 
                                <option>Tháng 1</option>
                                <option>Tháng 2</option>
                                <option>Tháng 3</option>
                                <option>Tháng 4</option>
                                <option>Tháng 5</option>
                                <option>Tháng 6</option>
                                <option>Tháng 7</option>
                                <option>Tháng 8</option>
                                <option>Tháng 9</option>
                                <option>Tháng 10</option>
                                <option>Tháng 11</option>
                                <option>Tháng 12</option>
                                </select>
                                
                            </div>
                    		</div>
                    	</div>
                    	<div class="row">
                    		<div class="col-sm-12">
                    			<table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTables-example" role="grid" aria-describedby="dataTables-example_info">
                        		<thead>
                            		<tr align="center" role="row">
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 85px; text-align: center;">Mã Đơn hàng</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 135px;text-align: center;">Mã khách hàng</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 180px;text-align: center;">Tên người nhận</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 95px;text-align: center;">Ngày mua</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 350px;text-align: center;">Sản phẩm</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 100px;text-align: center;">Số tiền</th>
                            		</tr>
                        		</thead>
		                        	<tbody>
		                        	   <logic:iterate name="thongKeDoanhThuForm" property="danhSachHoaDon" id="hoaDon">
		                        		<tr class="gradeC odd" align="center" role="row">
			                                <td class=""><bean:write name="hoaDon" property="maHoaDon"/></td>
			                                <td><bean:write name="hoaDon" property="maKhachHang"/></td>
			                                <td><bean:write name="hoaDon" property="tenNguoiNhan"/></td>
			                                <td><bean:write name="hoaDon" property="ngayXuatHoaDon"/></td>
			                                <td><bean:write name="hoaDon" property="tenMonAn"/></td>
			                                 <td><bean:write name="hoaDon" property="tongTienThanhToan"/></td>
			                               
		                            	</tr>
		                            	</logic:iterate>
		                            </tbody>
                    			</table>
                    		</div>
                    	</div>
                    	<div class="row">
                    		<div class="col-lg-12">
<!--                     		<div class="page-header"></div> -->
<hr>
                       		 <h1 style="text-align: center; font-size: 15px;" >
								<span style="margin-left: 53px; float: left; font-size: 20px">Tổng tiền:</span>
								<span style="margin-right: 250px;float: right;font-size: 17px"><b><bean:write name="thongKeDoanhThuForm" property="tongTien"/> VNĐ</b></span>
								
                        	 </h1>
                    		</div>
                    	</div>
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