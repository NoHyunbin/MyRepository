<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript">
			// ready event가 발생할 때(DOM이 완성되면) 실행됨
			$(function() {
				$("#btn1").on("click", function() {
					$("#div1").append('<img id="img1" src="../common/image/photo3.jpg" width="100"/>&nbsp');
				});
				
				$(".img2").on("mouseover", function() {
					$(".img2").attr("src", "../common/image/photo1.jpg");
				});
				
				$(".img2").on("mouseout", function() {
					$(".img2").attr("src", "../common/image/photo3.jpg");
				});
			});
		</script>
	</head>
	<body>
		이벤트 처리
		<hr/>
		<button id="btn1">버튼1</button>
		<div id="div1">
			<img id="img1" src="../common/image/photo3.jpg" width="100"/>
		</div>
		<br/><br/>
		
		<div>
			<img class="img2" src="../common/image/photo3.jpg" width="300"/>
			<img class="img2" src="../common/image/photo3.jpg" width="300"/>
		</div>
	</body>
</html>