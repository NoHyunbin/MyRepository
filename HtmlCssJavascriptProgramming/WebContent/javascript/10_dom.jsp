<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
		<script type="text/javascript">
			function onClickButton1() {
				console.log("onClickButton1() 실행");
				// var div1 = document.getElementById("div1");
				var div1 = document.querySelector("#div1");
				console.log(div1);
				div1.innerHTML = "수정 내용";
			}
			
			function onClickButton2() {
				var imgArr = document.querySelectorAll(".photo");
				imgArr[0].src = "../common/image/photo17.jpg";
			}
			
			function onClickButton3() {
				var mid;
				var mpassword;
				
				// 입력된 mid와 mpassword 얻기(how1)
				mid = document.querySelector("#form1 [name=mid]").value;
				mpassword = document.querySelector("#form1 [name=mpassword]").value;
				
				// 입력된 mid와 mpassword 얻기(how2) (조건: form1에 name이 있어야함. 위의 방법을 권장함)
				mid = document.form1.mid.value;
				mpassword = document.form1.mpassword.value;
				
				// 유효성 검사 
				if ( mid == "" ) {
					alert("아이디를 입력하세요");
				} else if ( mpassword == "" ) {
					alert("비밀번호를 입력하세요");
				}
				
				// 서버 전송
				var form1 = document.querySelector("#form1")
				form1.submit();
			}
		</script>
	</head>
	<body>
		DOM 사용
		<hr/>
		<button onclick="onClickButton1()">버튼1</button>
		<div id="div1">최초 내용</div>
		
		<button onclick="onClickButton2()">버튼2</button>
		<div>
			<img class="photo" src="../common/image/photo18.jpg" width="500"/>
		</div>
		
		<button onclick="onClickButton3()">버튼3</button>
		<div>
			<form id="form1" name="form1">
				아이디 : <input type="text" name="mid"/> <br/>
				비밀번호 : <input type="password" name="mpassword"/> <br/>
			</form>
		</div>		
	</body>
</html>