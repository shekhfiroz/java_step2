import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DemoServlet extends GenericServlet
{
	PrintWriter out;
	static int count=0;
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		out=res.getWriter();
		out.println("<html><body>");
		out.println("Hello servlet from Generic Servlet");
		out.println("<br>");//<br> for single line break
		out.println(this);//it prove that same servlet object use for all clients
		out.println("<br>");
		destroy();
		try
		{
			//Thread.sleep(2000);//now it maintain a pool of thread and make 2 or 3 objects 
			//and reuse it for all clients
			
			Thread.sleep(2000);//now when thread sleep for 20 sec so response didn't go to browser 
			//for other client new thread object made.so for client new thread object made
			out.println("<br>");
		}
		catch(Exception e)
		{}
		out.println(Thread.currentThread().getName());
		out.println("</body></html>");
	}
	public void destroy()
	{
		count++;
		out.println("Destroy method execute Explicitly "+count+" times");
	}
}