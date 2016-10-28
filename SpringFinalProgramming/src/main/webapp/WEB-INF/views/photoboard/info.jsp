<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
	</head>
	<body>
		사진 정보
		<hr/>
		<table style="width: 570px">
			<tr>
				<td style="background-color:#9966FF; width:70px">번호</td>
				<td>${photoboard.bno}</td>
			<tr>
			<tr>
				<td style="background-color:#9966FF; width:70px">제목</td>
				<td>${photoboard.btitle}</td>
			<tr>
			<tr>
				<td style="background-color:#9966FF; width:70px">내용</td>
				<td><pre>${photoboard.bcontent}</pre></td>
			<tr>
			<tr>
				<td style="background-color:#9966FF; width:70px">글쓴이</td>
				<td>${photoboard.bwriter}</td>
			<tr>
			<tr>
				<td style="background-color:#9966FF; width:70px">조회수</td>
				<td>${photoboard.bhitcount}</td>
			<tr>
			<tr>
				<td style="background-color:#9966FF; width:70px">날짜</td>
				<td>${photoboard.bdate}</td>
			<tr>
			<tr>
				<td style="background-color:#9966FF; width:70px">사진</td>
				<td><img src="showPhoto?savedfile=${photoboard.savedfile}" width="500px"/></td>
			<tr>
		</table>		
		<div>
			<c:if test="${login == photoboard.bwriter}">
				<a href="modify?bno=${photoboard.bno}">[수정]</a>
				<a href="remove?bno=${photoboard.bno}">[삭제]</a>
			</c:if>
			<a href="list">[목록]</a>
		
		</div>
	</body>
</html>