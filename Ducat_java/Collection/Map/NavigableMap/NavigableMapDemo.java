import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;
public class NavigableMapDemo
{
	public static void main(String []s)
	{
		NavigableMap<Integer,String>nm=new TreeMap<>();
		nm.put(2,"Two");
		nm.put(1,"one");
		nm.put(3,"Three");
		System.out.println("Orignal Map is : "+nm+"\n");
		Entry firstEntry=nm.pollFirstEntry();//it return and remove firstEntry
		System.out.println("First Entry is : "+firstEntry);
		System.out.println("After polling first Entry "+nm+"\n");
		
		Entry lastEntry=nm.pollLastEntry();//it return and remove lastEntry
		System.out.println("Last Entry is : "+lastEntry);
		System.out.println("After polling Last Entry "+nm);
	}
}