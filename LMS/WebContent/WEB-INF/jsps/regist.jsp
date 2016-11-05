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
		var uemail = document.getElementById("email");
		var uphone = document.getElementById("phone");
		if (uname.value == null || uname.value == "" || upass.value == null
				|| upass.value == "" || uemail.value == null
				|| uemail.value == "" || uphone.value == null
				|| uphone.value == "") {
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
	<div class="container" style="height: 400px;width: 290px;border: 1px solid #C0C0C0;padding-top:35px;margin-top:100px"">
    <div class="row clearfix">
        <div class="col-md-12 column" >
            <form role="form" action="<%=basePath%>userinsert.action" method="post" name="reg"
        onsubmit="return check()">
                <div class="form-group">
                     <label for="Name">用户名:</label>
                     <input class="form-control" type="text" name="name" id="name" />
                </div>
                <div class="form-group">
                     <label for="Password">密码:</label>
                     <input class="form-control" type="password" name="password" id="password" />
                </div>
                <div class="form-group">
                     <label for="Email">邮箱:</label>
                     <input class="form-control" type="email" name="email" id="email" />
                </div>
                <div class="form-group">
                     <label for="Phone">手机号:</label>
                     <input class="form-control" type="text" name="phone" id="phone" />
                </div>
				<div class="pager">
	               <button type="submit" class="btn btn-default">提交</button>
                </div>
                
            </form>
        </div>
    </div>
</div>


<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>