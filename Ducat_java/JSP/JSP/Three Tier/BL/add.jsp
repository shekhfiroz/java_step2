<html>
<body>
<%
String firstno=request.getParameter("firstno");
String secondno=request.getParameter("secondno");
%>
<jsp:useBean id="t1" class="my.AddBean" />
<jsp:setProperty name="t1" property="firstno" value="<%=firstno%>"/>
<jsp:setProperty name="t1" property="secondno" value="<%=secondno%>"/>
<%
int r=t1.add();
out.println("the sum of two no="+r);
%>
<jsp:getProperty name="t1" property="firstno"/>
<jsp:getProperty name="t1" property="secondno"/>
</body>
</html>