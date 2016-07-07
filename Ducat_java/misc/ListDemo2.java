import Java.util.*;
class ArrayListDemo2
{
public static void main(String s[]){
ArrayList <integer> al= new ArrayList <integer>();
//ArrayList al= new ArrayList();
int x[] ={1,-1,2,-2,3,-3,4,-4 };
for(int i=0;i<=x.length;i++)
 {
   al.add(x[i]);
     }
 object o[] al.toArray();
 for(int i=0;i<o.length;i++)
  {
  integer z= (Integer) o[i];
  System.out.println(z[i] + "");
  }
 System.out.println ("");
     for(integer i:al){
      System.out.println(al[i] + "");
     }
   }
 }