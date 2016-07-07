import java.util.*;
class ArryList
{
	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<>();//ArrayList class of collection object (Now all collection introduce with generics by this elements goes Homogeneously )
		
		//ArrayList al=new ArrayList(); //This way is depricated now so warning generate at compile time. By this way elements goes Hetrogeneously
		System.out.println("Intial size Of ArrayList : " +al.size());
		al.add("d");
		al.add("b");
		al.add("a");
		al.add("b");//duplicate objects can store in ArrayList
		//al.add(new Integer(10)); // if we create ArrayList object with generic in which string data type so this is not allowed
		System.out.println("Size of ArrayList after adding objects : " +al.size());
		al.remove(2);// It remove the object on 2nd position
		System.out.println("Size of ArrayList after removing object : "+al.size());
		System.out.println("objects in the collection are : "+al);
	}
}