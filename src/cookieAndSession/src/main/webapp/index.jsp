<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<a href="<%= request.getContextPath()%>/makeCookie"> [쿠키 발급]</a>
<a href="<%=request.getContextPath()%>/checkCookie">[쿠키 체크]</a>

</body>
</html>