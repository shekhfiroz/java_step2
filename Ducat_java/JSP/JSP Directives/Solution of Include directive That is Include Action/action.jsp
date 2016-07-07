<html>
<body>
<%! String name,pass; %>
<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");
%>
<jsp:include page="demo.jsp">
<jsp:param name="name" value="<%=name%>"/>
<jsp:param name="pass" value="<%=pass%>"/>
</jsp:include>
<%="example of action include"%>
</body>
</html>