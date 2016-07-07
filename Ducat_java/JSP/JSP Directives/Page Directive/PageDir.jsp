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
	Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sindhi");
	Statement s=c.createStatement();
	String s1="select * from Employee1 where name='"+name+"'and id="+pass+"";
	ResultSet rs=s.executeQuery(s1);
	if(rs.next())
	out.println("User is Valid");
	else
	out.println("User is Invalid");
}
catch(Exception e)
{
	System.out.println(e);
}
%>
</body></html>