import java.util.*;
class ArryListEmp
{
	public static void main(String[] args) 
	{
		ArrayList<Emp>al=new ArrayList<>();
		al.add(new Emp(1001,"lalu"));
		al.add(new Emp(1002,"Rabari"));
		al.add(new Emp(1003,"Messa"));
		al.add(new Emp(1004,"Tej"));
		Iterator<Emp>i=al.iterator();
		while(i.hasNext())
		{
			Emp z=i.next();
			System.out.println(z.id+" "+z.name);
			if(z.id==1004)
			i.remove();
		}
		System.out.println();
		System.out.println("After removing elements");
		i=al.iterator();
		while(i.hasNext())
		{
			Emp z=i.next();
			System.out.println(z.id+" "+z.name);
		}
	}
}
class Emp
{
	int id;
	String name;
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
		