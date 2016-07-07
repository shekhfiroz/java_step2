import java.lang.annotation.*;
class TestDeprecated{
	@Deprecated
	static void display()
	{
	 System.out.println("Display");
	}
}
class TestAnnotation{
	public static void main(String args[]){
	new TestAnnotation().doSomeTestnow();
	}
	//@SupressWarning("checked","Deprecated")
	public void doSomeTestnow(){
		TestDeprecated.display();
	}
}