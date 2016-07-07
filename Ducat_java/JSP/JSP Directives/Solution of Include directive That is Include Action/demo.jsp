<html>
<body>
<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");
out.println(name+" "+pass+" via demo.jsp");
%>
</body>
</html>