<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<input type="text" id="keyword" />

<button id="btn">按钮</button>
<br />
<span id="spa"></span>

<script>

 (function(){
	 /*
	 function createXmlHttp(){
		var xmlHttp=null;
		if(window.ActiveXObject){
			xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		}else{
			xmlHttp=new XMLHttpRequest();
			 
		}
		return xmlHttp;
	} */
	document.querySelector("#btn").onclick=function(){
		var keyword=document.querySelector("#keyword").value;
		 var xmlHttp = new XMLHttpRequest();
		xmlHttp.open("get","/youdao.xml?query="+keyword);
		
		xmlHttp.onreadystatechange=function(){
			if(xmlHttp.readyState==4){
				if(xmlHttp.status==200){
					var result=xmlHttp.responseXML;
					var errorCode=result.getElementsByTagName("errorCode")[0].childNodes[0].nodeValue;
				
					if(errorCode==0){
						var ex=result.getElementsByTagName("ex")[0].childNodes[0].nodeValue;
						document.querySelector("#spa").innerText=ex;
					}else{
						alert("ERRORCODE"+errorCode);
						
					}
				}else{
					alert("服务器异常"+xmlHttp.status);
				}
			}
		};
				
		xmlHttp.send();
	};
})();

</script>




</body>
</html>