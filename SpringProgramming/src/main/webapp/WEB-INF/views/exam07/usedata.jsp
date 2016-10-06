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
		데이타 찾기
		<hr/>
		[HttpServletRequest를 이용해서 찾기] <br/>
		데이터1 : <%=(String)request.getAttribute("data1")%> <br/>
		데이터2 : <%=(String)request.getAttribute("data2")%> <br/><br/>
		
		[HttpSession을 이용해서 찾기]<br/>
		데이터1 : <%=(String)session.getAttribute("data1")%> <br/>
		데이터2 : <%=(String)session.getAttribute("data2")%> <br/><br/>
				
		[EL을 이용해서 찾기] <br/>
		데이터1 : ${data1} <br/> <%-- Request에 있는지 먼저 찾고, 있으면 그거 쓰고 없으면 session 검색 --%>
		데이터2 : ${data2} <br/><br/>
		
		[객체의 속성(필드) 값 얻기] <br/>
		<%Board board = (Board) request.getAttribute("board");%>
		<%if(board != null) {%>
			번　호 : <%=board.getBno()%><br/>
			제　목 : <%=board.getTitle()%><br/>
			내　용 : <%=board.getContent()%><br/>
			조회수 : <%=board.getHitcount()%><br/> <%-- ; 는 쓰지 않는다!! --%>
		<%}%>
		
		<%--
		번　호 : ${board.bno} <br/> 자바에서의 '.'은 객체 접근 연산자인데, EL내부에서 '.'은 getter를 호출한다.
		제　목 : ${board.title} <br/>
		내　용 : ${board.content} <br/>
		조회수 : ${board.hitcount} <br/> <br/>
		--%>
		
		<br/>
		
		[컬렉션 이용하기] <br/>
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
			<c:forEach var="b" items="${boardlist}"> <%-- 54~55와 같은 내용 --%>
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