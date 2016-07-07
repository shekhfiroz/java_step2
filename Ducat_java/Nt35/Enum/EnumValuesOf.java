enum Week{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FIRDAY,SATURDAY};
public class EnumValuesOf{
	
	public static void main(String args[]){
 		weekday;
 		day = Week.valueOf("MONDAY"); 
 		System.out.println("Day Contains"+day);

 		day = Week.valueOf("TUESDAY"); 
 		System.out.println("Day Contains"+day);

 		day = Week.valueOf("WEDNESDAY"); 
 		System.out.println("Day Contains"+day);

 		day = Week.valueOf("THURSDAY"); 
 		System.out.println("Day Contains"+day);

 		day = Week.valueOf("FIRDAY"); 
 		System.out.println("Day Contains"+day);

 		day = Week.valueOf("SATURDAY");
 		System.out.println("Day Contains"+day);

 		day = Week.valueOf("SUNDAY");
 		System.out.println("Day Contains"+day);


	}
}
