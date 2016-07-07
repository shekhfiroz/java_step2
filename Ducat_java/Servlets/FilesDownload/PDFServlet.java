import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
public class PDFServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String fileName="SampleQuestions.pdf";
		ServletOutputStream stream=null;
		BufferedInputStream buf=null;
		try
		{
			stream=res.getOutputStream();
			String s1=getServletContext().getRealPath("/Work/SampleQuestions.pdf");
			File doc=new File(s1);
			res.setContentType("application/pdf");
			res.addHeader("content-Disposition","attachment;fileName="+fileName);
			res.setContentLength((int)doc.length());
			FileInputStream input=new FileInputStream(doc);
			buf=new BufferedInputStream(input);
			int readBytes=0;
			while((readBytes=buf.read())!=-1)
			stream.write(readBytes);
		}
		catch(Exception e)
		{}
	}
}