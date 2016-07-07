import java.util.*;
class ArryListDemo3
{
	public static void main(String[] args) 
	{
		ArrayList<ArrayList>al=new ArrayList<>();	
		
		ArrayList<String>als=new ArrayList<>();
		System.out.println(al.size());
		als.add("a");
		als.add("b");
		als.add("c");
		al.add(al);//self adding
		System.out.print(al.size());
		System.out.print(al);
	}
}
		
		