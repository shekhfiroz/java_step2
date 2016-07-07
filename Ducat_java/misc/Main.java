class Base {
protected Base() {
	System.out.println("Base Class Constructor Called ");
}
}

class Derived extends Base {
Derived() {
	System.out.println("Derived Class Constructor Called u bitch");
}
}

public class Main {
public static void main(String[] args) { 
	Derived d = new Derived();
}
}