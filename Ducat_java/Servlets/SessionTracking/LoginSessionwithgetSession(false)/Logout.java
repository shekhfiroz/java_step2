import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class Logout extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s=req.getSession();
		//HttpSession s=req.getSession(false);
		if(s!=null)
		{
			s.invalidate();
			out.println("<html><body>");
			out.println("you have Logout Succesfully");
			out.println("<br>");
			out.println("<a href='Login.html'>Login</a>");
			out.println("</body></html>");	
		}
		else
		{
			out.println("Please Login First");
		}
	}
}