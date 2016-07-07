package my;
import java.rmi.*;
import java.rmi.server.*;
public class Register
{
	public static void main(String s[])
	{
		try{
			my.MyServer m= new my.MyServer();
			Naming.rebind("Ducat",m);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}