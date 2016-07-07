import java.lang.reflection.*;
import java.awt.*;
class SampleModifier{
	public static void printModifier(Object o)throws Exception{
		//Class c=o.getClass();
		class c =class.forName("java.awt.graphics");
		int m c.getModifier();
		if(Modifier ispublic(m))
		System.out.println("public");

		if Modifier.isFind(m)
		System.out.println("Find");

		if (Modifier.isAbstract(m))
		System.out.println("Abstract");
	}
	public static void main(String s[]) throws Exception{
		String a =new String ("AAA");
		printModifier(a);
	}
}