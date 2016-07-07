import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;
public class NavigableMapDemo1
{
	public static void main(String []s)
	{
		NavigableMap<Integer,String>nm=new TreeMap<>();
		nm.put(2,"Two");
		nm.put(1,"one");
		nm.put(3,"Three");
		System.out.println("Orignal Map is : "+nm);
		Entry firstEntry=nm.firstEntry();//it return firstEntry
		System.out.println("First Entry is : "+firstEntry);
		
		System.out.println("First Key is : "+nm.firstKey());//firstKey() return the firstKey
		
		Entry lastEntry=nm.lastEntry();//it return lastEntry
		System.out.println("Last Entry is : "+lastEntry);
		
		System.out.println("Last Key is : "+nm.lastKey());//lastKey() return the lastKey
		
		System.out.println("After All Operations the list is : "+nm);
	}
}