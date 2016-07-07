import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class FormServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		ServletOutputStream out=res.getOutputStream();
		res.setContentType("text/html");
		out.println("<html><head><title>Basic form Processor Output</title></head>");
		out.println("<body>");
		out.println("<h1>Here is you form Data</h1>");
		String title=req.getParameter("name");
		String name=req.getParameter("name");
		String city=req.getParameter("city");
		String tel=req.getParameter("tel");
		String age=req.getParameter("age");
		String []interests=req.getParameterValues("interests");
		out.println("Your title is "+title);
		out.println("<br>Your Name is "+name);
		out.println("<br>Your city is "+city);
		out.println("<br>Your telephone no. is "+tel);
		out.println("<br>Your interests include <ul>");
		for(int i=0;i<interests.length;i++)
		{
			out.println("<li>"+interests[i]);
		}
		out.println("</ul>");
		out.println("<br>your age is"+age);
		out.println("</body></html>");
	}
}
