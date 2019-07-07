<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表</title>


    <%
       pageContext.setAttribute("APP_PaTH",request.getContextPath());
    %>
    <!--web路径
        不以/开始的相对路径，以当前相对路径为基准，找资源容易出现问题
        以/开始的路径，找资源，是以服务器的根路径为基准
    -->

    <%--引入jquery--%>
    <script src="../../static/js/jquery-3.2.1.min.js"></script>
    <%--引入bootstrap--%>
    <link href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>

<h2>list页面</h2>

<button type="button" class="btn btn-success">（成功）Success</button>

</body>
</html>
