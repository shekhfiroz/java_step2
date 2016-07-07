import java.util.*;
class ArryListDemo2
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<>();	
		int x[]={1,-1,2,-2,3,-3,5,-5};
		for(int i=0;i<x.length;i++)
		{
			al.add(x[i]);
		}
		Object o[]=al.toArray();//toArray() returns the array from ArrayList nd pass in object type array.This method act as bridge between collection API and 
								// Array base API.
		for(int i=0;i<o.length;i++) // By Forloop print all elements
		{
			Integer z=(Integer)o[i];//Downcast in Integer
			System.out.println(z.intValue()+" ");//intValue() returns the value of Integer in int .It is the method of Integer class.
		}
		System.out.println();
		for(Integer i:al)//By foreach loop print all elements
		{
			System.out.println(i.intValue()+"");// In this all things done automatically we have to just return Integer value in int using intValue()
		}
	}
}
		