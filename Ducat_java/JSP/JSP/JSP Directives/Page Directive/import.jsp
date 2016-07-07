<html>
<body>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","12345");
			
	Statement s=c.createStatement();

	String s1="select * from emp101 where name='"+name+"'and pass='"+pass+"'";

	//out.println(s1);

	ResultSet rs=s.executeQuery(s1);
	if(rs.next())
	out.println("user is valid");
	else
	out.println("user is invalid");
}
catch(Exception e)
{
	out.println(e);
}
%>
</body>
</html>