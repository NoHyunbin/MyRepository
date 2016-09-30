<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
	</head>
	<body>
		<a href="/myapp" style="color:blue; font-size:200%"><b>Hyunbin's Spring Programming</b></a>
		<hr/>
		<p style="font-size:150%;"><b>Exam04</b></p>
		<hr/>
		[게시물 등록 폼]<br/><br/>
		<form method="post">
			카테고리 : 
				<select name="bcategory">
					<option selected> 자유게시판 </option>
					<option> 알마인드 </option>
					<option> 신문사설 </option>
					<option> 만보 </option>				
				</select> <br/>
			게시물 번호 : <input type="text" name="bno" value="0"/> <br/>
			게시물 제목 : <input type="text" name="btitle" value="제목을 입력하세요"/> <br/>
			게시물 내용 <br>
			<textarea name="bcontent" rows="10" cols="30" >은지야 정신차리자</textarea> <br/>
			작성자 이름 : <input type="text" name="bwriter" value="노현빈"/> <br/>
			게시물 조회수 : <input type="text" name="bhitcount"value="0"/> <br/>
			
			<input type="submit" value="등록"/>
	 		<input type="reset" value="초기화"/>
		</form>
	</body>
</html>