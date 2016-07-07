import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns={"/initParam"},
			initParams={@WebInitParam(name="email",value="abc@gmail.com"),
@WebInitParam(name="phone",value="12354")})

public class ServletInitParam extends HttpServlet
{
	private String email="",phone="";
	@Override
	public void init(ServletConfig sc)throws ServletException
	{
		super.init(sc);
		email=sc.getInitParameter("email");
		phone=sc.getInitParameter("phone");
	}
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		String html="<h2>Access Data using @WebInitParam</h2>";
		PrintWriter out=res.getWriter();
		html +="<h3>Email:"+email+"<br/>Phone No:"+phone+"</h3>";
		out.println(html);
	}
}
