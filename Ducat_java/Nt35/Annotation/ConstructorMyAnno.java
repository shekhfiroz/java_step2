import java.lang.annotation.*;
import java.lang.reflect.*;
@Target (Element Type.CONSTRUCTOR)
@Retention(Retention Policy.RUNTIME)
@ interface MyAnnoc{
	int val();
}
public class ConstructionAnno{
	@MyAnnoc(val=200)
	ConstructorAnno(int x)
	{
	}
	@MyAnnoc (val=100)
	{
		ConstructorAnno()
		{
		}
	}
	public static void readC()
	{
		try{
			Class c= ConstructorAnno.class;
		    Constructor c1=c.getDeclared Constructor();
		    Constructor c2=c.getDeclared Constructor();
		    MyAnnoc anno=(MyAnnoc)c1.getAnnotation(MyAnnoc.class);
		    MyAnnoc anno1=(MyAnnoc)c1.getAnnotation(MyAnnoc.class);
		    System.out.println(anno.val());
		    System.out.println(anno1.val());

		}
		catch (Exception exe){
			System.out.println(exe)
		}
	}
	public static void main(String[] args){
		readC();
	}
}