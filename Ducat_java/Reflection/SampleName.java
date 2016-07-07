import java.lang.reflect.*;
import java.awt.*;
class SampleName{
	public static void PrintName(Object o)
	{
		Class c =o.getClass();
		System.out.println(c.getName());
	}
	public static void main(String s[]){
		try{
			class c=Class.forName();
			System.out.println(c.getName());
			StringBuffer sb =(StringBuffer)c.newInstance();
			System.out.println(sb.length());
			System.out.println(sb.capacity());
		}
		catch(Exception e){System.out.print(e);}
	}
	public static void printName(String s[])
	{
		try{
			Class c=Class.forName(s);
			System.out.println(c.getName());
			Temp sb=Temp(c.newInstance());
		    sb.show();
		}
		catch(Exception e){System.out.println(e);}
	}
	public static void main(String s[])
	 {
		Button b=new Button(b);
		printName(b);
		printName("java.lang.StringBuffer");
		//PrintName("java.lang.awt.Frame");
		printName("Temp");
		Class c=java.lang.Thread.Class;
		System.out.println(c.getName());
	 }
}
 class Temp{
	Temp(){
		System.out.println("default constant");
	}
	void show()
	{
		System.out.println("create of object via reflection");
	}
}