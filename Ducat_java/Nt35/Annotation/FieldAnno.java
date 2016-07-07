import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(ElementType.Field)
@Retentation(RetentationPolicy.RUNTIME)
@Interface MyAnno11
  {
	int val();
 }
public class FieldAnno{
	@MyAnno11(val=100)
	public int x;
	public static void myMeth()
	{
		FieldAnno ob =new FieldAnno();
		try{
			Class c=ob.getClass();
			Field f=c.getField();
			MyAnno11 anno =f.getAnnotation(MyAnno11.class);
			System.out.println(anno.val());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		myMeth();
	}
}