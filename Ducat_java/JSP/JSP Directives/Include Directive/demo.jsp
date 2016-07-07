<html>
<body>
<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");
out.println(name+" "+pass+" via demo.jsp");
%>
</body>
</html>

/* Now if replace this file with demo.jsp which is in [seprate demo.jsp file for include directive ] folder
then request from browser then changes not reflect in output coz servlet class made of only include.jsp file
so changes in demo.jsp could not reflect in include.jsp file that is the problem of include directive.for
this solution is include action. */ 