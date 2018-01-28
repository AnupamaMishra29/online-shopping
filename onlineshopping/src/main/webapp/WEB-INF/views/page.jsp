<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="${css}/myapp.css" rel="stylesheet">
<!-- Add custom bootstrap-readable-theme CSS here -->
 <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet"> 
</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>
		<!-- Page Content -->
		<div class="content">
			<!--  Loading the home content -->
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%></c:if>

			<!--  Loading only when user clicks about-->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%></c:if>

			<!--  Loading only when user clicks contact-->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%></c:if>
				
				<!--  Loading only when user clicks products-->
			<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true }">
				<%@include file="listProducts.jsp"%></c:if>
		</div>
		<!-- footer comes here -->
		<%@include file="./shared/footer.jsp"%>
		<!-- JavaScript -->
		<script src="${js}/jquery-1.10.2.js"></script>
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<!-- Self coded javascript -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>