<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>


<ul class="pagination justify-content-center" id="pagination" style="margin: 1.05rem 0">
	<!-- first page button -->
	<li class="page-item">
		<button class="page-link" id="btnFirst">First</button>
	</li>
	<!-- previous button -->	
	<li class="page-item" >
		<button class="page-link" id="btnPrev"> <i class="fa fa-chevron-left" ></i></button>
	</li>	
	<!-- next button -->
	<li class="page-item next-button" id="itemNext">
		<button id="btnNext" class="page-link" ><i class="fa fa-chevron-right"></i></button>
	</li>	
	<!-- last button -->
	<li class="page-item">
		<button id="btnLast" class="page-link">Last</button>
	</li>
</ul>
<input type="hidden" id="totalPage" value="${totalPage }" />
<input type="hidden" id="currentPage" value="${currentPage }"/>
<input type="hidden" id="urlPattern" value="${requestScope['javax.servlet.forward.request_uri']}" />


<script src='<c:url value="/resources/user/js/pagination.js"/>'></script>
