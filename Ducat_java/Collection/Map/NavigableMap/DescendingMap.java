import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;
public class DescendingMap
{
	public static void main(String []s)
	{
		NavigableMap<Integer,String>nm=new TreeMap<>();
		nm.put(2,"Two");
		nm.put(1,"one");
		nm.put(3,"Three");
		System.out.println("Orignal Map is : "+nm+"\n");
		NavigableMap reverse=nm.descendingMap();// by descendingMap() method all the Entry print in descending order 
		System.out.println("Descending Order is : "+reverse+"\n");
	}
}