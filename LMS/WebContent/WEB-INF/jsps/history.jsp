<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="。。/../css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function historyDelete(){
		if(confirm("确定要删除这条记录吗?")){
			return true;
		}
		return false;
	}</script>
</head>
<body>
	<form action="historyInsert.action" method="post">
		bookid:<input type = "text" name = "bookId"><br>
		userId:<input type = "text" name = "userId"><br>
		borrowTime:<input type = "date" name = "borrowTime"><br>
		<input type = "submit" value = "提交">
	</form>
	<div>
		<table>
			<c:forEach var="hbook" items="${historyBooks }" varStatus="status">
				<tr>
				 	<td>${hbook.historyId }</td>
					<td>${hbook.bookId }</td>
					<td>${hbook.userId }</td>
					<td><fmt:formatDate value="${hbook.borrowTime}" pattern="yyyy-MM-dd"/></td>
					<td><fmt:formatDate value="${hbook.returnTime}" pattern="yyyy-MM-dd"/></td>
					<td>
						<a class="btn btn-default" href="<%=basePath %>historyDelete.action?historyId=${hbook.historyId}" onclick="return historyDelete()">删除</a>
					</td>
					
				</tr>
			</c:forEach>
		</table>
	</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>