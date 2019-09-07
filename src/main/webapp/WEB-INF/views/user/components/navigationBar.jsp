<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<a class="nav-brand" href='<c:url value="/home"></c:url>'>
	<img alt="logo" src='<c:url value="/resources/user/image/logo.png"></c:url>'> 
</a>
 <!-- Toggler/collapsibe Button -->
 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
<!-- Navbar links -->
<div class="collapse navbar-collapse" id="collapsibleNavbar">
	<ul class="navbar-nav">
		<li class="nav-item">
			<a class="nav-link" href="${pageContext.request.contextPath }/thoi-trang-nu">Nữ</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${pageContext.request.contextPath }/thoi-trang-nam">Nam</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="#">Bé gái</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="#">Bé trai</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="#">Em bé</a>
		</li>
	</ul>
</div>
<ul class="navbar-nav justify-content-end">
	<li class="nav-item cart">
		<a class="nav-link cart" href="${pageContext.request.contextPath }/cart"><i class="fa fa-shopping-cart"></i></a>
		<span class="badge badge-warning">3</span>
	</li>
	<li class="nav-item">
		<a class="nav-link" href="#"><i class="fa fa-user-circle"></i></a>
	</li>
</ul>


