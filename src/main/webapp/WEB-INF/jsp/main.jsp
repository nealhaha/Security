<%--
  Created by IntelliJ IDEA.
  User: rui.deng
  Date: 2015/3/14
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
    ${user.userName},欢迎您进入证券期货分析平台，您当前积分为${user.credits};
</body>
</html>
