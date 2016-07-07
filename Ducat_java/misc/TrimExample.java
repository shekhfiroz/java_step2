import java.util.*;
public class TrimExample{

	public static void main(String args[])
	{
		ArrayList<Integer> arrlist = new ArrayList<Integer>(50);
	   
	   arrlist.add(1);
	   arrlist.add(2);
	   arrlist.add(3);
	   arrlist.add(4);
	   arrlist.add(5);
	   arrlist.trimToSize();

	   System.out.println(arrlist);
	}
}