import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class ConfigServlet extends HttpServlet
{
	ServletConfig con;
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		con=getServletConfig();
		//Enumeration e=con.getInitParameterNames();//we can get all parameter from xml via Enumeration
		String image=con.getInitParameter("image");//we can get parameter from xml different different also
		String driver=con.getInitParameter("driver");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		//String name=getInitParameter("name");
		//String pass=getInitParameter("pass");
		//String image=getInitParameter("image");
		//String driver=getInitParameter("driver");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		if(name.equals("sagar")&& pass.equals("sagar"))
		{
			out.println("User is valid");
		}
		else
		{
			out.println("User is Invalid");
		}
		out.println("<html><body background="+image+">");
		out.println("<h2>"+driver+"</h2>");
		out.println("</body></html>");
	}
}