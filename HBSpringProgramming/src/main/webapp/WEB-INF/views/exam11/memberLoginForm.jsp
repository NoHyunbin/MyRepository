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
		
		[로그인 폼] <br/><br/>
		<form method="post" action="/myapp/exam11/memberLogin">
			아이디 : <input type="text" name="mid" value="Hallucination"/> <br/>
			비밀번호 : <input type="password" name="mpassword" value="12345"/> <br/>
	
			<br/>
				<input type="submit" value="로그인"/>
		</form>
	</body>
</html>