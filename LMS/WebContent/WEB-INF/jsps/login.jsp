<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
	function check() {
		var uname = document.getElementById("name");
		var upass = document.getElementById("password");
		
		if (uname.value == null || uname.value == "" || upass.value == null
				|| upass.value == "") {
			alert("请输入完整的信息");
			return false;
		}
		return true;
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆</title>
</head>
<body>
	<form action="<%=basePath%>logincheck.action" method="post" name="reg"
		onsubmit="return check()">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="name" id="name" /></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" id="password" /></td>
			</tr>
			
			<td><input type="submit" value="登陆" /></td>
		</table>
	</form>
<a href="<%=basePath%>regist.action">注册</a>
</body>
</html>