<%@ page import="java.io.*%>
<html>
<body>
<%
String name=request.getParameter("text1");
String text=request.getParameter("textarea1");
String file=application.getRealPath("/")+"test4.txt";

FileWriter filewriter=new FileWriter(file);
PrintWriter pw=new PrintWriter(filewriter);
pw.println(name+"\n"+text);
pw.close();
%>
</body>
</html>