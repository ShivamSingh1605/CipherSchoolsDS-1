package primitiveDT;
class bada{
	final int x=10; // intialize while declaration
	final int y;
	bada(){
		y = 10; // we can also initialize final variables in constructors
	}
	
	final void print() // final methods cannot be overridden
	{
		System.out.println("Hi I'm Bada");
	}
	void print(int n) // we can overload final methods
	{
		System.out.println("N: "+n);
	}
}
class chhota extends bada{
//	void print() //final methods cannot be overridden
//	{
//		System.out.println("Hi I'm Chhota");
//		super.print();
//	}
}
final class Myclass{
	
}
//class Hello extends Myclass{ // we cannot inherit final classes
//	
//}
public class keywords {
	public static void main(String[] args)
	{
		chhota c = new chhota();
		c.print();
		final int x = 5;
//		x = 10; we cannot change the value of final variables
		
	}
}
