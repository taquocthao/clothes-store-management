<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yamate | Shop quần áo online thành phố hồ chí minh</title>
<!-- bootstrap 4 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<!-- font awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- common style -->
<link rel="stylesheet" href='<c:url value="resources/user/css/common.css" ></c:url>' />
<link rel="stylesheet" href='<c:url value="resources/user/css/navigationbar.css"></c:url>' />
</head>
<body>
	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<jsp:include page="./components/navigationBar.jsp"></jsp:include>
	</nav>
	<section id="body" style="margin-top: 1.75rem">
		<div class="container">
			<div class="address-info">
				<p>Quan 7, Ho Chi Minh</p>
			</div>
			<div>GIỎ HÀNG <span>(3 sản phẩm)</span> </div>
			<div class="row">
				<div class="col-sm-8 col-md-9" style="margin-bottom: 1.5rem">
					<div class="row shopping-cart-item">
						<div class="image-product">
							<img alt="product" src="">
						</div>
						<div class="">
							<div class="box-info-product"></div>
							<div class="box-price"></div>
							<div class="quantity-block"></div>
						</div>
					</div>
				</div>
				<div class="col-sm-4 col-md-3">				
					<div class="box">
						<p>
							<span>Tạm tính: </span>
							<strong>130000</strong>
						</p>
					</div>
					<div class="box">
						<span>Thành tiền: </span>
						<strong>1300000</strong>
					</div>
					
					<button type="button" class="btn btn-warning">Tiến hành đặt hàng</button>
					
					<div class="box">
						<div class="panel">
						
						</div>
					</div>
					
				</div>
			</div>
		</div>
	</section>
	<footer>
		<jsp:include page="./components/footer.jsp"></jsp:include>
	</footer>
	
	<!-- script navigation bar -->
	<script src="./resources/user/js/navigationBar.js"></script>	
</body>
</html>