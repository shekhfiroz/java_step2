<html>
<body>
<jsp:useBean id="t1" class="my.AddBean" />
<jsp:setProperty name="t1" property="*" />
<%
out.println("Two variable set by add.jsp ");
%>
</body>
</html>