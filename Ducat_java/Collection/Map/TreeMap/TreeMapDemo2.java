import java.util.*;
class TreeMapDemo2
{
	public static void main(String []a)
	{
		TreeMap<Temp,String>hm=new TreeMap<>();
		System.out.println("Intial Size is : "+hm.size());
		hm.put(new Temp(10),"aaaa");
		hm.put(new Temp(20),"bbbb");
		hm.put(new Temp(4),"cccc");
		hm.put(new Temp(8),"dddd");
		show(hm);
		
		Temp e1=new Temp(10);
		SortedMap sm=hm.headMap(e1);
		System.out.println("Less than 10");
		show(sm);
		
		e1=new Temp(8);
		sm=hm.tailMap(e1);
		System.out.println("Greater than 8");
		show(sm);
		
		Temp e2=new Temp(10);
		sm=hm.subMap(e1,e2);
		System.out.println("Between 8 and 10");
		show(sm);
		
		System.out.println(hm.isEmpty());//if print false because TreeMap is not empty 
		System.out.println(hm.get(e1));//it get the value which is in e1 ref. variable 
		hm.remove(e1);//it remove the value which is in e1 ref. variable
		show(hm);// Now it print key value pair according to show method 
		
		System.out.println("Now size is : "+hm.size());
		Map<Temp,String>rm=hm.descendingMap();
		System.out.println("Key Value pair in Descending Order is : ");
		show(rm);
	}
	
	static void show(Map<Temp,String>hm)
	{
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			Temp K=(Temp)e.getKey();
			String V=(String)e.getValue();
			System.out.println(K.id+" = "+V);
		}
	}
}

class Temp implements Comparable<Temp>
{
	int id;
	Temp(int id)
	{
		this.id=id;
	}
	public int compareTo(Temp t)
	{
		if(this.id>t.id)
		return 1;
		else if(this.id<t.id)
		return -1;
		else
		return 0;
	}
}