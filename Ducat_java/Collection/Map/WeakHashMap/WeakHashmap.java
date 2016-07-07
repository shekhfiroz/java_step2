import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
public class WeakHashmap
{
	public static void main(String []s)
	{
		Map m=new HashMap();
		Map whm=new WeakHashMap();
		
		Temporary t1=new Temporary();
		Temporary t2=new Temporary();
		
		m.put(t1,"ABC");
		System.out.println("Before HashMap gets Garbage Collected : "+m);
		t1=null;
		System.gc();
		System.out.println("After HashMap Gets Garbage Collected : "+m);// After t1 object null value available in HashMap object
		
		whm.put(t2,"ABC");
		System.out.println("Before WeakHashMap gets Garbage Collected : "+whm);
		t2=null;
		System.gc();
		System.out.println("After WeakHashMap Gets Garbage Collected : "+whm);//After t2 object null value in WeakHashMap object automatically Deleted
	}
}

class Temporary
{
	public String toString()
	{
		return "Temporary";
	}
}