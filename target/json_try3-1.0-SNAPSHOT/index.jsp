<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/send" method="post">
  <label>Your person in JSON is to be written here:</label><br><br>
  <textarea name="jsonStringEntered" cols="50" rows="4"></textarea>
  <p><input type = "submit" value = "send">
</form>
</body>
</html>