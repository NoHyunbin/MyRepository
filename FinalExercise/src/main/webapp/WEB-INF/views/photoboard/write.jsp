<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
	</head>
	<body>
		<a href="/myweb2">
			<input type="image" src="/myweb2/resources/main.jpg" width="300"/><br/>
		</a>
		<hr/>
		<b>글쓰기</b>
		<hr/>
		<form method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td style="background-color:#9966FF; width:70px">제목</td>
					<td><input type="text" name="btitle" style="width: 600px;"/></td>
				</tr>
				<tr>
					<td style="background-color:#9966FF; width:70px">내용</td>
					<td><textarea name="bcontent" style="width:600px; height:200px"></textarea></td>
				</tr>
				<tr>
					<td style="background-color:#9966FF; width:70px">사진</td>
					<td><input type="file" name="photo"/></td>
				</tr>
			</table>
			<input type="submit" value="글쓰기"/>
		</form>
	</body>
</html>