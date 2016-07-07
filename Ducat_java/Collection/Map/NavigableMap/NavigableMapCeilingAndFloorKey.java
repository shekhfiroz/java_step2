import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMapCeilingAndFloorKey
{
	public static void main(String []s)
	{
		NavigableMap<String,String>nm=new TreeMap<>();
		nm.put("c++","Good Programming Language ");
		nm.put("Java","Best Programming Language ");//if we do not write this line then ceilingKey return python coz p is greater than j 
		nm.put("Python","Language which Google Use ");//if we do not write this line then floorKey return java coz j is smaller than p
		nm.put("HTML","Designing Language ");
		System.out.println("Sorted Map is : "+nm);
		System.out.println("Ceiling Key is : "+nm.ceilingKey("Java"));//ceilingKey return key which is greater than or equal to specified Key
		System.out.println("Floor Key is : "+nm.floorKey("Python"));//FloorKey return key which is less than or equal to specified key 
	}
}