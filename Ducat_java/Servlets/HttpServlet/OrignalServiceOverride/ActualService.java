import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class ActualService extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		super.service(req,res);
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("Actual Service");
		out.println("</html></body>");
	}//orignal Service() of HttpServlet class that we override end..
}
/*WithOut super.service() :-
Now first we override Orignal Service method of httpServlet class so first orignal service() execute of 
HttpServlet class according to the first lifecycle and from this DuplicateService() did not call and 
our code which we write in orignal service() is execute.

With super.service() in Orignal Service() :-
Now we override Orignal Service method of httpServlet class so first orignal service() execute of 
HttpServlet class according to the first lifecycle from this DuplicateService() did not call and 
our code which we write in orignal service() is going to be execute But coz of super.service() it go to
HttpServlet class Orignal service method and execute it and there is nothing to print in it so error 
come at browser.
*/