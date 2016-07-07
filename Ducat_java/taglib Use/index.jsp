<%@taglib prefix="MyTag" uri="/WEB-INF/My1.tld"%>
<html>
<body>
<%!String s="Attribute"; %>
<MyTag:MyDate name="<%=s%>" >
<%="body"%>
</MyTag:MyDate>
</body>
</html>