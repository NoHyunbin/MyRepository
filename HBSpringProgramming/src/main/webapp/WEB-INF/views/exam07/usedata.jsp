<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="com.mycompany.myapp.exam07.*"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
	</head>
	<body>
		<a href="/myapp" style="color:blue; font-size:200%"><b>Hyunbin's Spring Programming</b></a>
		<hr/>
		<p style="font-size:150%;"><b>데이타 찾기</b></p>
		<hr/>
		<b>[HttpServletRequest를 이용해서 찾기]</b> <br/>
		데이터1 : <%=(String)request.getAttribute("data1")%> <br/>
		데이터2 : <%=(String)request.getAttribute("data2")%> <br/><br/>
		
		<b>[HttpSession을 이용해서 찾기]</b><br/>
		데이터1 : <%=(String)session.getAttribute("data1")%> <br/>
		데이터2 : <%=(String)session.getAttribute("data2")%> <br/><br/>
				
		<b>[EL을 이용해서 찾기]</b> <br/>
		데이터1 : ${data1} <br/> <%-- Request에 있는지 먼저 찾고, 있으면 그거 쓰고 없으면 session 검색 --%>
		데이터2 : ${data2} <br/><br/>
		
		<b>[객체의 속성(필드) 값 얻기]</b> <br/>
		<%Board board = (Board) request.getAttribute("board");%>
		<%if(board != null) {%>
			번　호 : <%=board.getBno()%><br/>
			제　목 : <%=board.getTitle()%><br/>
			내　용 : <%=board.getContent()%><br/>
			조회수 : <%=board.getHitcount()%><br/> 
		<%}%>
	
		<%--
		번　호 : ${board.bno} <br/> 자바에서의 '.'은 객체 접근 연산자인데, EL내부에서 '.'은 getter를 호출한다.
		제　목 : ${board.title} <br/>
		내　용 : ${board.content} <br/>
		조회수 : ${board.hitcount} <br/> <br/>
		--%>
		
		<br/>
		
		<b>[컬렉션 이용하기]</b> <br/>
		<table style="border-collapse: collapse; border: 1px solid black; width: 300px">
			<tr style="background-color: #9966FF">
				<td style="border: 1px solid black;">번호</td>
				<td style="border: 1px solid black;">제목</td>
				<td style="border: 1px solid black;">내용</td>
				<td style="border: 1px solid black;">조회수</td>
			</tr>
<%-- 	
			<%List<Board> list = (List<Board>) request.getAttribute("boardlist");%>
			<%if(list != null) {%>
				<%for(Board b : list) {%>
					<tr>
						<td style="border: 1px solid black;"><%=b.getBno()%><br/></td>
						<td style="border: 1px solid black;"><%=b.getTitle()%><br/></td>
						<td style="border: 1px solid black;"><%=b.getContent()%><br/></td>
						<td style="border: 1px solid black;"><%=b.getHitcount()%><br/> <br/></td>
					</tr>
				<%}%>
			<%}%>
 --%>			
			<c:forEach var="b" items="${boardlist}">
				<tr>
					<td style="border: 1px solid black;">${b.bno}</td>
					<td style="border: 1px solid black;">${b.title}</td>
					<td style="border: 1px solid black;">${b.content}</td>
					<td style="border: 1px solid black;">${b.hitcount}</td>
				</tr>			
			</c:forEach>	
			
		</table>
		
	</body>
</html>