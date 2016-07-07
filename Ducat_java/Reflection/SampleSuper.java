import java.lang.refelect.*;
import java.awt.*;
class SampleSuper{
	public static void printSuperClass(Object o)
	{
	 Class SubClass=o.getClass();
	 Class superClass=sub Class.getsuperclass();
	 while(superClass!=null)
	 {
	 	System.out.println(superClass.getName());
	 	subclass =superClass;
	 	superClass = subClass.getsuperclass();
	 }
	}
	public static void main(String s[])
	{
		Frame f=newFrame("aaaa");
		printSuperClass(f);
	}
}