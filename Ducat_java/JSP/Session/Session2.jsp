<html>
<body>
<%@ page import="java.sql.*" %>
<%@ page session="false" %>
<%
HttpSession s=request.getSession(false);
if(s!=null)
{
	String name=(String)s.getAttribute("name");
	String pass=(String)s.getAttribute("pass");
	out.println("welcome "+name);
	out.println("<br>");
	out.println(" "+s.isNew());
}
else
out.println("Login Please");
%>
</body>
</html>