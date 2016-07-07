<%@ page import="java.io.*,java.util.*"%>

<html>
<body>
<table width="100%" border="1" align="center">
<tr bgcolor="#949494">
<th>Header Name</th>
<th>Header Value(s)</th>
</tr>
<%
Enumeration headerNames=request.getHeaderNames();
while(hesdNames.hasMoreElements())
{
	String paramName=(String)headerNames.nextElement();
	out.println("<tr><td>"+paramName+"</td>\n");

	String paramValue=request.getHeader(paramName);
	out.println("<td>"+paramValue+"</td></tr>\n");
}
%>
</table>
</body>
</html>