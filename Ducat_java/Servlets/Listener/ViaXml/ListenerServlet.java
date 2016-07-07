import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ListenerServlet extends HttpServlet
{
	PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		out=res.getWriter();
		out.println("<html><body>");
		ServletContext ctx=getServletContext();
		Connection c=(Connection)ctx.getAttribute("con");
		try
		{
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from MyEmp");
			while(rs.next())
			{
				out.println("ID:"+rs.getString(1));
				out.println("name"+rs.getString(2));
				out.println("<br>");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		out.println("</body></html>");
	}
}