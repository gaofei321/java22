<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>

<button id="btn">按钮</button>


<script>
(function(){
    document.querySelector("#btn").onclick = function(){
        var xmlHttp = new XMLHttpRequest();
        xmlHttp.open("get","/ajax.xml");
        xmlHttp.send();
    };
})();
		
		
		
	



</script>

</body>
</html>