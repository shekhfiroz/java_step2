/*<applet code="applet.class" height=400 width=400></applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class  TestApplet extends Applet
{
	String s;
	public TestApplet()
	{
		s="constructor";
	}
	public void init()
	{
		s=s+"init";
	}
	public static void main(String... args)
	{
		System.out.print("main");
	}
	public void start()
	{
		setBackground(Color.yellow);
		s=s+"start";
		display();
	}
	public void paint(Graphics g)
	{
		s=s+"paint";
		g.drawString(s,30,30);
	}
	void display()
	{
		s=s+"display";
		System.out.print(s);
	}
}
