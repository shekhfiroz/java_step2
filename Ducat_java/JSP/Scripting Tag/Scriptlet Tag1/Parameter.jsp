<html>
<body>
<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");
RequestDispatcher rd=request.getRequestDispatcher("Demo.jsp");//By RequestDispatcher It go to Demo.jsp
rd.include(request,response);
if(name.equals("Ducat")&& pass.equals("Ducat"))
out.println("valid");
else
out.println("Invalid");
%>
</body>
</html>