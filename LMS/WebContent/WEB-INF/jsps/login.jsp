<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
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
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="。。/../css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆</title>
</head>
<body>
	<div class="container" style="height: 280px;width: 290px;border: 1px solid #C0C0C0;padding-top:35px;margin-top:100px">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" action="<%=basePath%>check.action" method="post" name="reg"
        onsubmit="return check()">
                <div class="form-group">
                     <label for="Name">用户名:</label>
                     <input class="form-control" id="name" type="text" name="name" />
                </div>
                <div class="form-group">
                     <label for="Password">密码:</label>
                     <input class="form-control" type="password" name="password" id="password" />
                </div>
                
                <div class="checkbox">
                     <label><input type="checkbox" />保存密码</label>
                </div> 
                <div class="pager">
	                <button type="submit" class="btn btn-default">登陆</button>
	                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                <a class="btn btn-default" href="<%=basePath%>regist.action">注册</a>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>