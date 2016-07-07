import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet1 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s=req.getSession(false);
		if(s!=null)
		{
			String s1=(String)s.getAttribute("name");
			String s2=(String)s.getAttribute("pass");
			out.println("<html><body>");
			out.println(s1+"="+s2+" "+s.isNew());
			out.println("<br>");
			out.println("<a href='log'>Logout</a>");
			out.println("</body></html>");
		}
		else
		{
			out.println("please Login First ");
		}
	}
}

/* HttpSession s=req.getSession(false) Never make a new session when we paste copied url that is of after
the login page into the another browser but HttpSession s=req.getSession() or HttpSession s=req.getSession(true)
make new session.

*/