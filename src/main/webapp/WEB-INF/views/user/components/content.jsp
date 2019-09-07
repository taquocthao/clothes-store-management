<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>
<!-- common style -->
<link rel="stylesheet" href="../resources/user/css/common.css" />
<link rel="stylesheet" href='<c:url value="../resources/user/css/navigationbar.css"></c:url>' />

<h3 class="label-text text-center">Items</h3>
<div class="row">
	<c:forEach var="product" items="${products }">
		<div class="col-6 col-md-4" >
			<div class="card card-product">				
				<a href="${pageContext.request.contextPath }/san-pham?product=${product.id}"> 
					<img alt="card image" class="card-img-top" src="${product.image }">
				</a>
				<div class="card-body">
					<strong class="card-title">${product.name }</strong>
					<p><fmt:formatNumber type="number" value="${product.price }"/> </p>
					<p class="card-text"></p>
					<button class="btn btn-primary btn-add" 
							onclick="addToCart('${product.id}','${pageContext.request.contextPath }')">
						<i class="fa fa-shopping-cart"></i> Add to cart
					</button>
				</div>
			</div>
		</div>
	</c:forEach>
</div>
	
<script src='<c:url value="/resources/user/js/addProductToCart.js"/>'></script>
