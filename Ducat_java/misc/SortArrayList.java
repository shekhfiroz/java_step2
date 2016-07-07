import java.util.*;
public class SortArrayList{
	public static void main(String args[])
	{
		ArrayList<String>listofcountries= new ArrayList<String>();
		listofcountries.add("india");
		listofcountries.add("us");
		listofcountries.add("china");
		listofcountries.add("Denmark");
		listofcountries.add("Norway");

		System.out.println("Before Shorting");{
		   for(String counter:listofcountries){
		   		System.out.println(counter);
		     }
		     Collections.sort(listofcountries);
		}
			

			System.out.println("After Shorting :-");{
			   for(String counter:listofcountries){
		   		System.out.println(counter);
		       }
			}
	}
}
//why china is not coming at first after shorting?