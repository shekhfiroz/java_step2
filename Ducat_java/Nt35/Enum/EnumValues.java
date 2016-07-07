enum Week{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FIRDAY,SATURDAY};
public class EnumValues{
	public static void main(String args[])
	{
		System.out.println("Here is all week\n");
		Week allWeek[]=Week.values();
		for(Week aday:allWeek){
			System.out.println(aday);
		}
		for(int i =0;i<allWeek.length;i++)
		{
			System.out.println(allWeek[i]);
		}
	}
}