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
<!-- style navigation bar -->
<link rel="stylesheet" href="./resources/user/css/navbar.css" />
</head>
<body>
	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<jsp:include page="./components/navigationBar.jsp"></jsp:include>
	</nav>
	<div class="container" style="margin-top: 30px;">
		<div class="row body">
			<div class="row">
				<jsp:include page="./components/carousel.jsp"></jsp:include>
			</div>
			<div class="row col-sm-12" style="margin-top: 30px;">
				<div class="col-sm-3 left-sidebar">
					<jsp:include page="./components/sidebar.jsp"></jsp:include>
				</div>
				<div class="col-sm-9 right-side">
					<jsp:include page="./components/content.jsp"></jsp:include>
				</div>
			</div>
		</div>
		
	</div>
	<div class="footer">
		<jsp:include page="./components/footer.jsp"></jsp:include>
	</div>
	
	<!-- script navigation bar -->
	<script src="./resources/user/js/navigationBar.js"></script>
</body>
</html>