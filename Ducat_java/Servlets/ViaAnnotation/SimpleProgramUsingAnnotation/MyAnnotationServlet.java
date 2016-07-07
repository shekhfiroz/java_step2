import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="MyAnnotationServlet",urlPatterns={"/hello"})
//@WebServlet("/MyAnnotationServlet")  
public class MyAnnotationServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>Hello world from Servlet via Annotation<h1>");
		out.close();
	}
}