import java.util.NavigableMap;
import java.util.*;
public class Navigablemap
{
	public static void main(String []s)
	{
		NavigableMap nm=new TreeMap();
		nm.put("1","1");
		nm.put("2","2");
		nm.put("3","3");
		nm.put("4","4");
		nm.put("5","5");
		System.out.println("Orignal Map is : "+nm);
		Map.Entry higherEntry=nm.higherEntry("3");//it return one higherEntry from 3
		System.out.println("higher Entry is : "+higherEntry);
		
		Map.Entry lowerEntry=nm.lowerEntry("3");//it return one lowerEntry from 3
		System.out.println("Lower Entry is : "+lowerEntry);
	}
}