package primitiveDT;
class Coders{
	String name;
	int numId;
	static int counter=0;
	Coders(String name, int numId) {
		this.name = name;
		this.numId = numId;
		counter++;
	}
	static void showCount(){
		System.out.println(counter);
//		System.out.println(name);  cannot use non static variables in a static method
		
	}
	
}
public class StaticCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coders c1 = new Coders("Shivam",1);
		System.out.println(c1.counter);
		Coders c2 = new Coders("Radhika",2);
		System.out.println(c1.counter);
		System.out.println(c2.counter);
		Coders c3 = new Coders("Saumil",3);
//		System.out.println(Coders.counter);//static members belong to class
		Coders.showCount();
	}

}
