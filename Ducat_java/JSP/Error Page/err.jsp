<html>
<body>
<%@ page isErrorPage="true" import="java.io.*" %>
<%= exception %>
<% exception.printStackTrace(new PrintWriter(out)); %>
</body>
</html>