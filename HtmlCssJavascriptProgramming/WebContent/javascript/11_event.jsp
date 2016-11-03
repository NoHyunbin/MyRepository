<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript">
			function changeImg1() {
				var img1 = document.querySelector("#img1");
				img1.src = "../common/image/photo18.jpg";
			}
			
			function changeImg2() {
				var img2 = document.querySelector("#img2");
				img2.src = "../common/image/photo14.jpg";
			}
			
			function changeImg3() {
				var img3 = document.querySelector("#img3");
				img3.src = "../common/image/photo19.jpg";
			}
			
			window.onload = function() {
				var btn2 = document.querySelector("#btn2");
				btn2.onclick = changeImg2;
				
				var btn3 = document.querySelector("#btn3");
				btn3.addEventListener("click", changeImg3);
			};
		</script> 
	</head>
	<body>
		Event 처리
		<hr/>
		<h3>[ How 1 ]</h3> <!-- 태그에 속성으로 처리 -->
		<button onclick="changeImg1()">버튼1</button> <br/>
		<img id="img1" src="" width="200px"/>
		
		<h3>[ How 2 ]</h3> <!-- 이벤트 소스에 함수를 주고 처리하는 방법 -->
		<button id="btn2">버튼2</button> <br/>
		<img id="img2" src="" width="200px"/>
		
		<h3>[ How 3 ]</h3> <!-- 이벤트 소스에 addEventListener를 주고 처리하는 방법 -->
		<button id="btn3">버튼3</button> <br/>
		<img id="img3" src="" width="200px"/>
	</body>
</html>