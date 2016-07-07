<%
Cookie firstname=new Cookie("first_name",request.getParameter("first_name"));
Cookie lastname=new Cookie("last_name",request.getParameter("last_name"));

firstname.setMaxAge(60*60);
lastname.setMaxAge(60*60);

response.addCookie(firstname);
response.addCookie(lastname);
%>
<html>
<body>
<ul>
<b>First name:</b>
<%=request.getParameter("first_name")%><br/>
<b>Last name:</b>
<%=request.getParameter("last_name")%>
</body>
</html>