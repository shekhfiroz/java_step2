import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyCookieWithAge extends HttpServlet
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
			c1.setMaxAge(30*60);//Now cookie will not delete from browser for 30*60=1800 sec=30 min 
			//Now if we close the browser after copy the url and paste after start again then data show direct 
			//coz of cookie
			c2.setMaxAge(30*60);
			out.println("Cookies Added");
		}
		else
		{
			out.println("<html><body>");
			out.println("<form>");
			out.println("<input type='text' value="+c[0].getValue()+">");
			out.println("<br>");
			out.println("<input type='text' value="+c[1].getValue()+">");
			out.println("<br>");
			out.println("<input type='submit'>");
			out.println("</form>");
			out.println("</body></html>");
		}
	}
}