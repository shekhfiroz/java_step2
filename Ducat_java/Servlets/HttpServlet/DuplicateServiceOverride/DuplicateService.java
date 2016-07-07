import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class DuplicateService extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		//super.service(req,res);//with super only Duplicate service print
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("Duplicate Service");
		out.println("</body></html>");
	}//DuplicateService() end...
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("Get Method");
		out.println("</body></html>");
	}
}
/*WithOut super.service() :-
Now first we override DuplicateService method of httpServlet class so first orignal service() execute of 
HttpServlet class according to the first lifecycle from this call DuplicateService() that we override it
so our code which we write in DuplicateService() execute and doGet() did not call from DuplicateService().

With super.service() in DuplicateService() :-
Now we override DuplicateService method of httpServlet class so first orignal service() execute of 
HttpServlet class according to the first lifecycle from this call DuplicateService() that we override it
so our code which we write is going to be execute then coz of super.service() HttpServlet class 
DuplicateService() call then from this doGet() call that we override so our code of doGet() execute
then Our code of DuplicateService() execute.
*/



