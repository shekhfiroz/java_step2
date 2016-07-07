import java.lang.annotation.*;
import java.lang.reflect.*;
@Retentation(RetentationPolicy.RUNTIME)

@interface MySingle{
	int value();
}

public class Single{
	@MySingle(100)
	public static void myMeth(){
	Single ob =new Single();
	  try {
	        method m =ob.getClass().getMethod("myMeth");
	        MySingle anno =m.getAnnotation(MySingle.class);
	        Class c=anno.getClass();
	        System.out.print(c.getName());
	        Class inter[]=c.getInterfaces();
	        for(int i=0;i<inter.length;i++)
	        {
		    System.out.println(inter[i].getName());
		 }
	      int x =anno.value();
	      System.out.println(x);
	  }
          catch(NoSuchMethodException exc){
   	      System.out.println("Method not Found");
   }
     public static void main(String args[]){
	   myMeth();
     }
       }
  		}