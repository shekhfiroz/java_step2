import java.util.*;
class TreeMapDemo
{
	public static void main(String []a)
	{
		TreeMap<String,String>hm=new TreeMap<>();
		System.out.println(hm.size());
		hm.put("1004","dddd");
		hm.put("1003","cccc");
		hm.put("1002","bbbb");
		hm.put("1001","aaaa");
		show(hm);//by this all key and values print in sorted order coz SortedMap as a argument pass in show method 
		SortedMap sm=hm.headMap("1003");//headMap print keys and values less than 1003
		System.out.println("Less than 1003");
		show(sm);
		sm=hm.subMap("1002","1004");//subMap print keys and values between 1002 to 1004 but it does not include upperbound like in this upperbound is 1004
		System.out.println("Between 1002 and 1004");
		show(sm);
		sm=hm.tailMap("1002");//tailMap print keys and values greater than 1002 but it include 1002 also 
		System.out.println("Greater than 1002");
		show(sm);
	}
	static void show(SortedMap sm)
		{
			Set s=sm.entrySet();
			Iterator i=s.iterator();
			while(i.hasNext())
			{
				Map.Entry e=(Map.Entry)i.next();
				String K=(String)e.getKey();
				String V=(String)e.getValue();
				System.out.println(K+" = "+V);
			}
		}
}