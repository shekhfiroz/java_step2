package My;
abstract public class Temp extends 
weblogic.servlet.jsp.JspBase//jspbase show the functionality of servlet
{
	public String show()
	{
		return "lalu from Temp";
	}
}
/* it run on jdk6 . it compile on other version also but run only when itt compiled by jdk 6 . coz weblogic
support jdk 6 */