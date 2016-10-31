<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<style type="text/css">
			body {
				background-image: url("../common/image/paper.gif");
				/* background-repeat: repeat; */
				
			}
			.album {
				width: 200px;
				height: 200px;
				background-image: url("../common/image/photo17.jpg");
				background-size: 200px 200px;
				display: inline-block;
			}
		</style>
	</head>
	<body>
		Background 관련 CSS 속성
		<hr/>
		<%for(int i=0; i<=10; i++) {%>
			<div class="album">
			
			</div>
		<%}%>
	</body>
</html>