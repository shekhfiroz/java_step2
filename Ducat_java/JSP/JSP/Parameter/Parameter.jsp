<html>
<body>
<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");

RequestDispatcher rd=request.getRequestDispatcher("Demo1.jsp");
rd.include(request,response);
if(name.equals("DUCAT")&&pass.equals("DUCAT"))
out.println("valid");
else
out.println("invalid");
%>
</body>
</html>