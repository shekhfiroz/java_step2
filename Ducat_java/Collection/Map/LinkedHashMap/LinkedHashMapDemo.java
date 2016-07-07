import java.util.*;
class LinkedHashMapDemo
{
	public static void main(String []a)
	{
		LinkedHashMap<String,String>hm=new LinkedHashMap<>(10,0.75f,true);
		System.out.println(hm.size());
		hm.put("1003","aaaa");
		hm.put("1002","bbbb");
		hm.put("1001","cccc");
		hm.put("1004","dddd");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			String K=(String)e.getKey();
			String V=(String)e.getValue();
			System.out.println(K+" = "+V);
		}
		String s1[]={"1001","1002","1003","1004"};
		for(int i1=0;i1<s1.length;i1++)
		{
			System.out.println(hm.get(s1[i1]));//it print the values according to the keys  in s1 array of String type
		}
		s=hm.entrySet();
		i=s.iterator();
		System.out.println("");
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			String K=(String)e.getKey();
			String V=(String)e.getValue();
			System.out.println(K+" = "+V);
		}
	}
}