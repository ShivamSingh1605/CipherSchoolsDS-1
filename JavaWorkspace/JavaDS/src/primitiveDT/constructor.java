package primitiveDT;
class Car
{
	String name;
	String color;
	int manYear;
	Car(){
		System.out.println("Hi I'm default Constructor of Car");
	}
	Car(String name, String color, int manYear){

		this.name=name;
		this.color=color;
		this.manYear = manYear;
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
class Mustang extends Car{
	int topSpeed;
	Mustang(){
		System.out.println("Hi I'm Mustang");
	}
	Mustang(String name,String color, int manYear,int topSpeed){
//		this.name=name;
//		this.color=color;
//		this.manYear=manYear;
		super(name,color,manYear);
		this.topSpeed=topSpeed;
	}	
	void print(){
		System.out.println("Name: "+name+", Color: "
					+color+", Year: "+manYear+", Top Speed: "+topSpeed);
	}
	
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c = new Car();
//		c.print();
//		c.name = "Audi";
//		c.color = "Orange";
//		c.manYear = 2018;
//		Car c2 = new Car("Audi","Black",2020);
//		c2.print();
//		Car c3 = new Car("Mustang","White");
//		c3.print();
//		Mustang m = new Mustang("Abhinav","Black",2022,150);
//		m.print();
		Mustang m = new Mustang();
	}

}
