import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ContextAttribute extends HttpServlet
{
	PrintWriter out;
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		out=res.getWriter();
		ServletContext ctx=getServletContext();
		Integer count=(Integer)ctx.getAttribute("count");//intially count is 0 
		if(count==null)//intially count null so integer class object make with 0 parameter
		{
			count=new Integer(0);
		}
		count=new Integer(count.intValue()+1);//now 0+1=1
		ctx.setAttribute("count",count);//count set to 1
		out.println(count.intValue());
	}
}
//count will increase 1 whenever request come from browser.it Does not matter from which browser request come