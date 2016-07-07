import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class ConHashMap
{
	public static void main(String []s)
	{
		Map<String,String>m=new ConcurrentHashMap<>();
		m.put("1","1");
		m.put("2","1");
		m.put("3","1");
		m.put("4","1");
		m.put("5","1");
		m.put("6","1");
		System.out.println("ConcurrentHashMap Before Iterator : "+m);
		Iterator<String>it=m.keySet().iterator();
		while(it.hasNext())
		{
			String Key=it.next();
			if(Key.equals("3"))m.put(Key+"new","new3");
		}
		System.out.println("ConcurrentHashMap After Iterator : "+m);//In concurrentHashMap new key/Value pair add after iterator()
		
		//HashMap
		m=new HashMap<String,String>();
		m.put("1","1");
		m.put("2","1");
		m.put("3","1");
		m.put("4","1");
		m.put("5","1");
		m.put("6","1");
		System.out.println("HashMap Before Iterator : "+m);
		Iterator<String>its=m.keySet().iterator();
		while(its.hasNext())
		{
			String Key=its.next();
			if(Key.equals("3"))m.put(Key+"new","new3");
		}
		System.out.println("HashMap After Iterator : "+m);//In HashMap we can not add new pair after iterator()  . It give exception
	}
}