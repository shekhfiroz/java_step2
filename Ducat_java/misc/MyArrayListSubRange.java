import java.util.ArrayList;
import java.util.List;

public class MyArrayListSubRange{
	public static void main(String[] args){

       ArrayList<String>arrl=new ArrayList<String>();
       //adding elements to the end;
       arrl.add("first");
       arrl.add("second");
       arrl.add("third");
       arrl.add("fourth");
       arrl.add("random");
       arrl.add("click");
         System.out.println("Actual ArrayList:"+arrl);
         List<String>List =arrl.subList(1,5);
         //subList method helps us to get a small list from arraylist
         System.out.println("subList:"+List);
	}
}
