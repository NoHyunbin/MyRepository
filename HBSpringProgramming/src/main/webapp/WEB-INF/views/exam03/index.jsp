<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
	</head>
	<body>
		<a href="/myapp" style="color:blue; font-size:200%"><b>Hyunbin's Spring Programming</b></a>
		<hr/>
		<p style="font-size:150%;"><b>Exam03</b></p>
		<hr/>
		[회원 가입 폼] <br/>
		<form action="/myapp/exam03/join">
		을 입력하세요 	아이디 : <input type="text" name="mid" value="Hallucination"/> <br/>
			이름 : <input type="text" name="mname" value="노현빈"/> <br/>
			비밀번호 : <input type="password" name="mpassword" value="12345"/> <br/>
			이메일 : <input type="email" name="memail" value="gusqls0810@naver.com"/> <br/>
			전화번호 : <input type="tel" name="mtel"value="010-123-1234"/> <br/>
			직업 :
				<input type="radio" name="mjob" checked value="대학생">대학생
				<input type="radio" name="mjob" value="회사원">회사원
				<input type="radio" name="mjob" value="공무원">공무원 <br/>
			개발분야 :
				<input type="checkbox" name="mskill" value="Web"> 웹 개발
				<input type="checkbox" name="mskill" value="System" checked> 시스템 개발
				<input type="checkbox" name="mskill" value="BigData"> 빅데이터 개발
				<input type="checkbox" name="mskill" value="IoT" checked> IoT 개발 <br/>
			주소 : 
				<select name="maddress1">
					<option>서울특별시</option>
					<option selected>경기도</option>
					<option>부산광역시</option>
					<option>대구광역시</option>
					<option>제주광역시</option>
				</select> - 
				<select name="maddress2">
					<option>인천시</option>
					<option>수원시</option>
					<option selected>남양주시</option>
					<option>부천시</option>
					<option>의왕시</option>
				</select> <br/>
				
			생년월일 : <input type="date" name="mbirth" value="1990-08-10"/>
				<br/><br>
			
				<%--
				<input type="submit" value="가입"/>
				<button>가입</button>
				--%>
				<input type="image" src="/myapp/resources/image/join.png" width="150"/>
		</form>
		<br/>
		<form action="/myapp">
			<input type="image" src="/myapp/resources/image/main.png" width="150"/>
		</form>
	</body>
</html>