import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class OracleServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		ServletContext sc=getServletContext();
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		//Enumeration e=sc.getInitParameterNames();
		String driver=sc.getInitParameter("driver");
		String url=sc.getInitParameter("url");
		String user=sc.getInitParameter("user");
		String pass=sc.getInitParameter("pass");
		try
		{
			Class.forName(driver);
			Connection c=DriverManager.getConnection(url,user,pass);
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from MyEmp");
			while(rs.next())
			{
				out.println(rs.getString(1));
				out.println(rs.getString(2));
				out.println("<br>");
			}
		}
		catch(Exception e)
		{}
		out.println("</body></html>");
	}
}