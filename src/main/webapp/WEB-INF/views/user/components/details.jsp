<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>

<div class="product-details">
	<h3 class="label-text">Chi tiết sản phẩm</h3>
	<c:set var="product" value="${productDetails }"></c:set>
	<div class="row">
		<div class="col-sm-5">
			<div class="card">
				<div class="card-body">
					<img alt="product" class="card-img-top"
						src="${product.image }">
				</div>
			</div>
		</div>
		<div class="col-sm-7">
			<div class="card" style="height: 100%">
				<div class="card-body">
					<strong class="card-title">${product.name}</strong>
					<p class="card-subtitle">Sub title</p>
					<p>rating</p>
					<strong class="price">
						<fmt:formatNumber type="number" value="${product.price}" /> 
					</strong>
					<p>quantity</p>
					<a type="button" class="btn btn-primary"> <i
						class="fa fa-shopping-cart"></i> Add to cart
					</a>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="similar-product mt-4 embed-responsive">
	<h3 class="label-text">Sản phẩm liên quan</h3>
	<div id="carouselSimilarProduct" class="carousel slide" data-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<a href="#"> <img alt="product" class="image-fluid"
					src="./resources/user/image/girl1.jpg">
				</a>
			</div>
			<div class="carousel-item">
				<a href="#"> <img alt="product" class="image-fluid"
					src="./resources/user/image/girl2.jpg">
				</a>
			</div>
			<div class="carousel-item">
				<a href="#"> <img alt="product" class="image-fluid"
					src="./resources/user/image/girl3.jpg">
				</a>
			</div>
		</div>
		<!-- Left and right controls -->
		<a class="carousel-control carousel-control-prev"
			href="#carouselSimilarProduct" data-slide="prev"> <i
			class="fa fa-angle-left"></i>
		</a> <a class="carousel-control carousel-control-next"
			href="#carouselSimilarProduct" data-slide="next"> <i
			class="fa fa-angle-right"></i>
		</a>
	</div>
</div>
<div class="review details mt-4">
	<!-- nav tabs -->
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" data-toggle="tab"
			href="#details">Details</a></li>
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="#reviews">Reviews</a></li>
	</ul>
	<!-- tab panes -->
	<div class="tab-content">
		<div class="tab-pane container active" id="details">
			<p>Details , consectetur adipisicing elit, sed do eiusmod tempor
				incididunt ut labore et dolore magna aliqua.</p>
		</div>
		<div class="tab-pane container fade" id="reviews">
			<p>Reviews, consectetur adipisicing elit, sed do eiusmod tempor
				incididunt ut labore et dolore magna aliqua.</p>
		</div>
	</div>
</div>