<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
	</head>
	<body>
		<a href="/myapp" style="color:blue; font-size:200%"><b>Hyunbin's Spring Programming</b></a>
		<hr/>
		<p style="font-size:150%;"><b>Exam11</b></p>
		<hr/>
		
		게시물 상세 보기
		<hr/>
		제목 : ${board.btitle} <br/>
		내용 : ${board.bcontent} <br/>
		글쓴이 : ${board.bwriter} <br/>
	</body>
</html>