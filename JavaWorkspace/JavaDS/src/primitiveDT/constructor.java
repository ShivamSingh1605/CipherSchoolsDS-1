package primitiveDT;
class Car
{
	String name;
	String color;
	int manYear;
	Car(){
		System.out.println("Hi I'm default Constructor");
	}
	Car(String n, String c, int y){
		name = n;
		color = c;
		manYear = y;
	}
	Car(String name,String color)
	{
		this.name=name;
		this.color=color;
	}
	void print(){
		System.out.println("Name: "+name+", Color: "+color+", Year: "+manYear);
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
//		c.print();
//		c.name = "Audi";
//		c.color = "Orange";
//		c.manYear = 2018;
		Car c2 = new Car("Audi","Black",2020);
		c2.print();
		Car c3 = new Car("Mustang","White");
		c3.print();

	}

}