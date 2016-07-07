enum Week{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FIRDAY,SATURDAY};
public class DefaultValue{
	public static void main(String args[]){
		//obtain all ordinal value ordinal
		System.out.println("Here are all week consant" + "there ordinal value()");
		Week day1[]=Week.values();
		for(int i =0;i<day1.length;i++)
		{
			System.out.println(day1[i] +"=");
			System.out.println(day1[i].ordinal());
		}
		for(Week day:Week day1[].values())
		{
			System.out.println(Week[day].ordinal());
		}
	}
}