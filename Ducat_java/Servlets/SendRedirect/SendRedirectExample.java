import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class SendRedirectExample extends HttpServlet
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
			String s1="select * from MyEmp where name='"+name+"' and pass='"+pass+"'";
			ResultSet rs=s.executeQuery(s1);
			if(rs.next())
			{
				//res.sendRedirect("wel.htm");
				res.sendRedirect("wel");
			}
			else
			{
				res.sendRedirect("err");
			}	
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("After");
		out.println("</body></html>");
	}
}