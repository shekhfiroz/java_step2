<html>
<body>
<h1>Page Redirection</h1>
<%
String site=new String("http://www.google.com");
response.setStatus(response.SC_MOVED_TEMPORARILY);
response.setHeader("location",site);
%>
</body>
</html>