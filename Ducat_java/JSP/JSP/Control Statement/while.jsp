<%!
int fontSize;
%>
<html>
<head>
<title>while loop example</title>
</head>
<body>
<%
while(fontSize<=3)
{
%>
<font color="green" size="<%=fontSize%>">
jsp tutorial
</font>
<br/>
<%
fontSize++;
}
%>
</body>
</html>