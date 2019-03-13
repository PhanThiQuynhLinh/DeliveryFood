<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="">
    <title>Admin nhà hàng </title>

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
<jsp:include page="MenuFormAdminNH.jsp"></jsp:include>
  
        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Nhân viên
                            <small>Danh sách</small>
                        </h1>
                    </div>
                    <!-- /.col-lg-12 -->
                    
                    
                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer">
                    	<div class="row">
                    		<div class="col-sm-6">
                    		</div>
                    		<div class="col-sm-6">
                    			<div id="dataTables-example_filter" class="dataTables_filter">
                    				<label>Tìm kiếm: <input type="search" id="search" onkeyup="myFunction()" class="form-control input-sm" placeholder aria-controls="dataTables-example"></label>
                    			</div>
                    		</div>
                    	</div>
                    	<div class="row">
                    		<div class="col-sm-12">
                    			<table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTables-example" role="grid" aria-describedby="dataTables-example_info">
                        		<thead>
                            		<tr align="center" role="row">
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 30px; text-align: center;">Mã nhân viên</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 350px;text-align: center;">Họ tên</th>                            			
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 150px;text-align: center;">Mật khẩu</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 175px;text-align: center;">Ngày Sinh</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 230px;text-align: center;">Giới Tính</th>                         			
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 240px;text-align: center;">Số điện thoại</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 350px;text-align: center;">Địa chỉ</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 350px;text-align: center;">Email</th>
                            			<th tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"  style="width: 119px;text-align: center;">Tùy chỉnh</th>
                            		</tr>
                        		</thead>
		                        	<tbody>
		                        	<logic:iterate name="danhSachNhanVienForm" property="danhSachNhanVien" id="nhanVien">
		                        		<tr class="gradeC odd" align="center" role="row">
			                                <th scope="row"><bean:write name="nhanVien" property="maNhanVien"/></th>
			                                <td ><bean:write name="nhanVien" property="hoTenNhanVien"/></td>
			                                <td><bean:write name="nhanVien" property="matKhau"/></td>
			                                <td ><bean:write name="nhanVien" property="ngaySinh"/></td>
			                                <logic:equal name="nhanVien" property="gioiTinh"  value="1">
					                                	<td>Nam</td>
					                                </logic:equal>
					                                 <logic:equal name="nhanVien" property="gioiTinh"  value="0">
					                                	<td>Nữ</td>
					                        </logic:equal>
			                                <td ><bean:write name="nhanVien" property="soDienThoai"/></td>
			                                <td ><bean:write name="nhanVien" property="diaChi"/></td>
			                                <td ><bean:write name="nhanVien" property="email"/></td>
			                                <bean:define id="maNhanVien" name="nhanVien" property="maNhanVien"></bean:define>
			                                <td class="center">
												<html:link action="/sua-nhan-vien?maNhanVien=${maNhanVien}" ><i class="fa fa-pencil fa-fw"></i></html:link>
												<a data-id=${maNhanVien} onclick="confirmDelete(this)"><i class="fa fa-trash-o  fa-fw"></i></a>  
												</td>
		                            		</tr>
		                            	</logic:iterate>
		                            </tbody>
                    			</table>
                    		</div>
                    	</div>
                    	<div class="row">
                    	
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
         <script>
function myFunction() {
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("search");
  filter = input.value.toUpperCase();
  table = document.getElementById("dataTables-example");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}

function confirmDelete(ele) {
	var maNhanVien = ele.getAttribute("data-id");
	$.confirm({
	    title: 'Xóa tài khoảng nhân viên!',
	    content: 'Bạn có muốn xóa tài khoản '+maNhanVien,
	    buttons: {
	        "Đồng ý": function () {
	        	window.location.href="/DeliveryFood/xoa-nhan-vien.do?maNhanVien="+maNhanVien;
	        },
	        "Hủy": function () {
	            $.alert('Hủy bỏ!');
	        }
	    }
	});
}
</script>
    
</body>
</html>