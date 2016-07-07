import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyCookie extends HttpServlet
{
	PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		out=res.getWriter();
		Cookie c[]=req.getCookies();
		if(c==null)
		{
			Cookie c1=new Cookie("name","sagar");
			Cookie c2=new Cookie("address","Rajpura");
			res.addCookie(c1);
			res.addCookie(c2);
			out.println("Cookies Added");
		}
		else
		{
			for(int i=0;i<c.length;i++)
			{
				out.println(c[i].getName());
				out.println(c[i].getValue());		
				out.println("<br>");
			}
		}
	}
}