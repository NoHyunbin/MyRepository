<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
		<style type="text/css">
			* {
				font-family: 돋움;
				font-size: 12px;
			}
			a {
				text-decoration: none;
				color: black;
			}
			a:HOVER {
				color: blue;
			}
		</style>
	</head>
	<body>
		<a href="/photo">
			<input type="image" src="/photo/resources/main.jpg" width="300"/><br/>
		</a>
		<hr/>
		<p style="font-size:150%;"><b>사진 게시판</b></p>
		<hr/>
		
		<c:if test="${login != null}">
			<a href="write">[글쓰기]</a>
		</c:if>
		
		<br/>
		<table style="width:600px">
			<tr>
				<td>
					<c:forEach var="photoBoard" items="${list}">
						<a href="info?bno=${photoBoard.bno}">
							<div style="width:120px; height:130px; margin:5px; display:inline-block; background-image:url(showPhoto?savedfile=${photoBoard.savedfile}); background-size: 120px 130px;">
								<div style="height:100px;">
									<span style="color:white; font-size:12px">${photoBoard.bdate}</span>
								</div>
								<div>
									<table style="width:100%; height:30px; background-color:black; opacity: 0.5;">
										<tr>
											<td style="text-align:left; color:white">${photoBoard.btitle}</td>
											<td style="text-align:right; color:aqua;">${photoBoard.bhitcount}</td>
										</tr>
									</table>						
								</div>
							</div>
						</a>
					</c:forEach>				
				</td>
			</tr>
		</table>
		
		<form method="post" action="/photo/photoboard/list?pageNo=1">
			검색 <input type="text" name="find" value="${find}"/>
			<input type="submit" value="찾기"/>
		</form><br/>
 		
		<div style="width: 600px">
			<c:if test="${pageNo!=1}">
			<a href="list?pageNo=1&find=${find}">[처음]</a>
			</c:if>
			
			<c:if test="${groupNo>1}">
				<a href="list?pageNo=${startPageNo-1}&find=${find}">[이전]</a>
			</c:if>
			
			<c:forEach var="i" begin="${startPageNo}" end="${endPageNo}">
				<a href="list?pageNo=${i}&find=${find}"
					<c:if test="${pageNo==i}">style="color:red" </c:if>
				>${i}</a>
			</c:forEach>
			
			<c:if test="${groupNo<totalGroupNo}">
				<a href="list?pageNo=${endPageNo+1}&find=${find}">[다음]</a>
			</c:if>
			
			<c:if test="${pageNo!=totalPageNo}">
			<a href="list?pageNo=${totalPageNo}&find=${find}">[맨끝]</a>
			</c:if>
		</div>
		
	</body>
</html>