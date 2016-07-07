package my;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
import java.io.*;

public class MyDate extends TagSupport 
{
	JspWriter out;
	String name;
	int count=0;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int doAfterBody() throws JspException
	{
		if(++count<5)
		{
			return EVAL_BODY_AGAIN;
		}
		else
		return SKIP_BODY;
	}
	public int doStartTag()throws JspException
	{
		out=pageContext.getOut();
		try
		{
			out.println("Start Tag");
		}
		catch(Exception e)
		{}
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag()throws JspException
	{
		String s=new Date().toString();
		try
		{
			out.println("Today Date is : "+s);
		}
		catch(Exception e)
		{}
		return EVAL_PAGE;
	}
}




