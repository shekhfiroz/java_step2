<%!
int day=4;
%>
<html>
<body>
<%
switch(day)
{
case 0:
%>
<font color="red" size="10">
sunday
</font>
<br/>
<%
break;
case 1:
%>
<font color="red" size="10">
monday
</font>
<br/>
<%
break;
case 2:
%>
<font color="red" size="10">
tuesday
</font>
<br/>
<%
break;
case 3:
%>
<font color="red" size="10">
wednesday
</font>
<br/>
<%
break;
case 4:
%>
<font color="red" size="10">
thursday
</font>
<br/>
<%
break;
case 5:
%>
<font color="red" size="10">
friday
</font>
<br/>
<%
break;
case 6:
%>
<font color="red" size="10">
saturday
</font>
<br/>
<%
break;
default:
%>
<font color="red" size="10">
wrong choice
</font>
<%
}
%>
<br/>
</body>
</html>