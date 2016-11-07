<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		<a href="/photo">
			<input type="image" src="/photo/resources/main.jpg" width="300"/><br/>
		</a>
		<hr/>
		1. 
			<c:if test="${login == null}"> 
				<a href="<%=pageContext.getServletContext().getContextPath()%>/member/login">로그인</a>
			</c:if>
			
			<c:if test="${login != null}"> 
				<a href="<%=pageContext.getServletContext().getContextPath()%>/member/logout">로그아웃</a>
			</c:if>
			<br/>
		2. <a href="${pageContext.servletContext.contextPath}/photoboard/list?pageNo=1">사진 게시판</a> <br/>
	</body>
</html>
