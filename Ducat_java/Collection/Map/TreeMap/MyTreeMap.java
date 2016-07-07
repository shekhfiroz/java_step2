import java.util.*;
import java.util.Map.Entry;
class MyTreeMap
{
	public static void main(String []a)
	{
		Comparator m1=new MysalaryComp();
		Comparator m2=new MysalaryComp();
		TreeMap t=new TreeMap(m1);
		System.out.println("Sorting with salary is :");
		add(t);
		show(t);
		Emp em=(Emp)t.firstKey();
		System.out.println("Lowest salary employee : "+em.salary);
		Entry<Emp,String>ent=t.firstEntry();
		System.out.println("Entry set values ");
		Emp K=(Emp)ent.getKey();
		System.out.println(K.salary+" = "+ent.getValue());
		System.out.println("Sorting with name is : ");
		TreeMap t1=new TreeMap(m2);
		add(t1);
		show(t1);
	}
	static void add(TreeMap t)
	{
		t.put(new Emp("lalu",101),"aaaa");
		t.put(new Emp("bhalu",202),"bbbb");
		t.put(new Emp("rabari",401),"cccc");
		t.put(new Emp("messa",212),"dddd");
		
	}
	static void show(TreeMap tm)
	{
		Set s=tm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			Emp K=(Emp)e.getKey();
			String V=(String)e.getValue();
			System.out.println(K.name+" = "+K.salary+" , Value = "+V);
		}
	}
}

class MysalaryComp implements Comparator<Emp>
{
	@Override
	public int compare(Emp e1,Emp e2)
	{
		if(e1.getSalary()>e2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class MyNameComp implements Comparator<Emp>
{
	public int compare(Emp e1,Emp e2)
	{
		return e1.name.compareTo(e2.name);
	}
}
class Emp
{
	String name;
	int salary;
	Emp(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	int getSalary()
	{
		return salary;
	}
}
	