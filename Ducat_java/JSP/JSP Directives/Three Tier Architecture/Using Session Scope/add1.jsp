<html>
<body>
<jsp:useBean id="t1" class="my.AddBean" scope="session" />
<jsp:setProperty name="t1" property="*" />
<%
out.println("Data set successully ");
%>
</body>
</html>