import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class WelServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String s=(String)req.getAttribute("name");
		out.println("welcom to My web of Ducat "+s);
		out.println("</body></html>");
	}
}