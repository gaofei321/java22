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
		document.querySelector("#btn").onclick=function(){
			var xmlHttp=new XMLHttpRequest;	
			xmlHttp.open("get","/readJson.json");
			
			xmlHttp.onreadystatechange=function(){
				
				if(xmlHttp.readyState==4){
					if(xmlHttp.status==200){
						var result=xmlHttp.responseText;
						//将字符串转化为josn
						var json=JSON.parse(result);
						for(var i=0;i<json.length;i++){
							var user=json[i];
							alert(user.id+"->"+user.name+"->"+user.address);
						}
					}
				}
				
			};
			
			xmlHttp.send();
			
		};
		
	})();


</script>




</body>
</html>