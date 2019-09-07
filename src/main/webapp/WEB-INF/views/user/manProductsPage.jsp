<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yamate | Thời trang nam</title>
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

</head>
<body>

	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<jsp:include page="./components/navigationBar.jsp"></jsp:include>
	</nav>
	<section id="body" style="margin-top: 1.75rem">
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-md-3" style="margin-bottom: 1.5rem">
					<jsp:include page="./components/sidebar.jsp"></jsp:include>
				</div>
				<div class="col-sm-8 col-md-9">				
					<!-- product view -->
					<div class="content-items">
						<jsp:include page="./components/content.jsp"></jsp:include>
					</div>
					<!-- pagination -->
					<div class="pagination justify-content-center">
						<jsp:include page="./components/pagination.jsp"></jsp:include>
					</div> 
				<%-- 	<jsp:include page="./components/productDetails.jsp"></jsp:include> --%>
				</div>
			</div>
		</div>
	</section>
	<footer>
		<jsp:include page="./components/footer.jsp"></jsp:include>
	</footer>
	
	<!-- script navigation bar -->
	<script src="../resources/user/js/navigationBar.js"></script>
</body>
</html>