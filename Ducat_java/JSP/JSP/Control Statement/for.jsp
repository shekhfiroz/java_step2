<%!
int fontSize;
%>
<html>
<body>
<%
for(fontSize=1;fontSize<=10;fontSize++)
{
%>
<font color="red" size="<%=fontSize%>">
jsp tutorial
</font>
<br/>
<%
}
%>
</body>
</html>