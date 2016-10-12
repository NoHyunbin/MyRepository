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
		
		게시물 쓰기
		<hr/>
		<form method="post" action="/myapp/exam11/boardWrite">
			글쓴이 : <input type="text" name="bwriter" value="늦가을"/> <br/>
			제목 : <input type="text" name="btitle" value="단풍은 왔는가?"/> <br/> 
			내용 : <textarea rows="5" cols="20" name="bcontent">단풍이 오기도 전에 겨울이 왔어요.</textarea> <br/>
			<input type="submit" value="글쓰기"/> 
			
		</form>
	</body>
</html>