import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RequestServlet1 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String s=req.getMethod();
		out.println(s);
		if(s.equals("POST"))
		doPost(req,res);
		if(s.equals("GET"))
		doGet(req,res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
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
			Statement s1=c.createStatement();
			int x=s1.executeUpdate("insert into MyEmp values('"+name+"','"+pass+"')");
			ResultSet rs=s1.executeQuery("select * from MyEmp");
			ResultSetMetaData rsmd=rs.getMetaData();
			out.println("<table bgcolor='yellow' border=1 width=200");
			out.println("<tr>");
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				out.println("<th>"+rsmd.getColumnName(i)+"</th>");
			}
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("</tr>");
			}
		}
		catch(Exception e)
		{}
		out.println("</table>");
		if(name.equals(name)&&pass.equals(pass))
		out.println("User is Valid through post");
		else
		out.println("User is Invalid through post");
		out.println("</body></html>");			
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(name.equals("Ducat")&&pass.equals("Ducat"))
		out.println("User is Valid through Get");
		else
		out.println("User is Invalid through Get");
		out.println("</body></html>");		
	}
}

/*
String s=req.getMethod();
out.println(s);
if(s.equals("POST"))
doPost(req,res);
if(s.equals("GET"))
doGet(req,res);
By this we know explicitly request come from get or post so that method execute.Generally that thing 
done internally when Duplicate service called from orignal service and we override get and post.
*/
