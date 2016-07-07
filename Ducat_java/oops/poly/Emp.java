class Emp{
	static String company ="Kundoor";
	String name;
	int salary;

	void get(String s1,int s2)
	{
		name =s1;
		salary=s2;
	}
	void show(){
	System.out.println(name);
 	System.out.println(salary);
	System.out.println(company);
	}
	public static void main(String args[])
    {
	Emp e1=new Emp();
	e1.get("lalu",10001);
	e1.show();

	Emp e2=new Emp();
	e1.get("Rabari",2001);
	e1.show();
    }
  }