package primitiveDT;
interface AI{
	int x=5;
	void fun();
}
interface BI
{
	int x=10;
	void fun();
}
interface CI extends AI,BI{
	void fun2();
}
class interfaceKoInherit implements AI,BI
{
	public void fun()
	{
		System.out.println(AI.x);//Error of Ambiguity
		System.out.println(BI.x);//Error of Ambiguity
	}
}
public class InterfaceStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceKoInherit obj = new interfaceKoInherit();
		obj.fun();
//		System.out.println(obj.x);
		System.out.println(AI.x);
//		System.out.println(interfaceKoInherit.x);
	}

}
