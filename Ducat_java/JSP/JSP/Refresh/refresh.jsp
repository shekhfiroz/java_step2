<%@ page import="java.io.*,java.util.*"%>

<html>
<body>
<%
Date today=new Date();
response.setIntHeader("refresh",5);

Calender calender=new GregorianCalender();
calender.setTime(today);

String am_pm;

int hour=calender.get(Calender.HOUR);
int minute=calender.get(Calender.MINUTE);
int second=calender.get(Calender.SECOND);

if(calendar.get(Calendar.AM_PM)==0)
am_pm="AM";
else
am_pm="PM";

String CT=hour+":"+minute+":"+second+" "+am_pm;
out.println(CT+"\n");
%>
</body>
</html>