<html>
<head>
<title>Using Buttons</title>
</head>
<body>
<h1>Using Buttons</h1>
<form name="form1" action="basic.jsp" method="post">
<input type="hidden" name="buttonname">
<input type="Button" value="Button1" onclick="button1()">
<input type="Button" value="Button2" onclick="button2()">
<input type="Button" value="Button3" onclick="button3()">
</form>
<script language="javascript">
<!--
function button1()
{
	document.form1.buttonname.value="button1"
	form1.submit()
}
function button2()
{
	document.form1.buttonname.value="button2"
	form1.submit()
}
function button3()
{
	document.form1.buttonname.value="button3"
	form1.submit()
}
}
//-->
</script>
</body>
</html>