import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RequestServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(name.equals("Ducat")&&pass.equals("Ducat"))
		out.println("User is valid through Service Method");
		else
		out.println("User is Invalid through Service Method");
		out.println("</body></html>");
	}
}