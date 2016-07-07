import java.util.*;
class ArryList1
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<>();//ArrayList class of collection object (Now all collection introduce with generics by this elements goes homogeneously )
		
		//ArrayList al=new ArrayList(); //This way is depricated now so warning generate at compile time. By this way elements goes heterogeneously 
		
		int x[]={1,-1,2,-2,3,-3,5,-5};
		for(int i=0;i<x.length;i++)
		{
			al.add(x[i]);
		}
		System.out.println("Intially objects in the collection are : "+al);

		Iterator<Integer>i=al.iterator();//iterator() method of Iterator Interface excess the next elements.In this ArrayList execute on 
						 //iterator() method so it can excess all elements in ArrayList class of collection
		           
		//Iterator i=al.iterator();
		while(i.hasNext()) // hasNext() method tell that further element present or not
		{
			//Integer z=(Integer)i.next(); // when ArrayList class object create without generics than we have to downcast the iterator to integer
			Integer z=i.next();//next() method move the next element and return that element
			if(z.intValue()<0)//negative values in array which name is x are less than 0
			i.remove();//so negative values remove
		}
		System.out.println("objects in the collection after removing negative elements are : "+al);
	}
}
