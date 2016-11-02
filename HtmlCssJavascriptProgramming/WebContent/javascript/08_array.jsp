<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
	</head>
	<body>
		배열
		<hr/>
		<script type="text/javascript">
			var cars = ["Saab", "Volvo", "BMW"];
			console.log(cars[0]);
			console.log(cars[1]);
			console.log(cars[2]);
			
			console.log("--------------");
			
			for ( var i = 0 ; i < cars.length ; i++ ) {
				console.log(cars[i]);
			}
			
			console.log("--------------");
			
			var cars2 = new Array("Saab", "Volvo", "BMW");
			cars2.sort();
			for ( var i = 0 ; i < cars.length ; i++ ) {
				console.log(cars2[i]);
			}
			
			console.log("--------------");
			
			var fruits = ["Banana", "Orange", "Apple", "Mango"];
			fruits.push("Lemon");
			fruits[6] = "Grape";
			for ( var i = 0 ; i < fruits.length ; i++ ) {
				console.log(fruits[i]);
			}
			
			console.log(fruits[5]);
			fruits[5] = "gg";
			console.log(fruits[5]);
			
		</script>	
	</body>
</html>