import my.*;
import java.rmi.*;
public class Client
{
	public static void main(String s[])
	{
		try{
			my.MyRemote m=(my.MyRemote)Naming.lookup("rmi://localhost:1099/Ducat");
			System.out.println(m.add(100,200));
		}
		catch(Exception e){
		
		System.out.println(e);}
	}
}