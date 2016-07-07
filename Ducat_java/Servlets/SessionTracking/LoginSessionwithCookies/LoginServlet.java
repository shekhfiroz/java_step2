import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class LoginServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sindhi");
			Statement s=c.createStatement();
			String s1="select * from Emp11 where name='"+name+"'and pass='"+pass+"'";
			ResultSet rs=s.executeQuery(s1);
			if(rs.next())
			{
				HttpSession se=req.getSession();
				se.setAttribute("name",name);
				se.setAttribute("pass",pass);
				out.println("user is valid"+" "+se.isNew());
				out.println("<br>");
				out.println("<a href='demo'>demo</a>");
				out.println("<br>");
				out.println("<a href='log'>Logout</a>");
			}
			else
			{
				out.println("user is invalid");
			}
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("</body></html>");
	}
}