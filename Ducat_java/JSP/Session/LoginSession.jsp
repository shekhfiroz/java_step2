<html>
<body>
<%@ page import="java.sql.*" %>
<%@ page session="false" %>
<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sindhi");
	Statement s=c.createStatement();
	String s1="select * from Emp11 where name='"+name+"' and pass='"+pass+"'";
	ResultSet rs=s.executeQuery(s1);
	if(rs.next())
	{
		HttpSession s2=request.getSession();
		s2.setAttribute("name",name);
		s2.setAttribute("pass",pass);
		out.println("Data set sucsessfully "+s2.isNew());
		out.println("<br>");
		out.println("<a href='Session2.jsp'>welcome</a>");
		out.println("<a href='Session3.jsp'>welcome1</a>");
	}
	else
	{
		out.println("user is Invalid");
	}
}
catch(Exception e)
{
	out.println(e);
}
%>
</body>
</html>