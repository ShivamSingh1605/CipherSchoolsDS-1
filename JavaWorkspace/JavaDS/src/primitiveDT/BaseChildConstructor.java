package primitiveDT;
class Base
{   int x;
	Base(){
		x=5;
		System.out.println("Base Class Constructor");
	}
}
class Derived extends Base{
	Derived(){
		System.out.println("Derived Class Constructor");
		System.out.println(x);
	}
}
public class BaseChildConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d= new Derived();
	}

}
