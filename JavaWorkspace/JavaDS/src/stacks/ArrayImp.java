package stacks;
class MyStack{
	final int size=10;
	int arr[]=new int[size];
	int top=-1;
	boolean isEmpty()
	{
		if(top==-1) return true;
		return false;
	}
	int peek()
	{
		if(this.isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return arr[top];
	}
	void push(int data)
	{
		if(top==9)
		{
			System.out.println("Stack is Full, Not Pushed");
			return;
		}
//		top=top+1;
//		arr[top]=data;
		arr[++top]=data;
	}
	int pop()
	{
//		if(top==-1)
		if(this.isEmpty())
		{
			System.out.println("Stack is already empty, Nothing to Pop");
			return -1;
		}
//		int x = arr[top];
//		top--;
//		return x;
		return arr[top--];
	}
}
public class ArrayImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyStack s = new MyStack();
			System.out.println(s.isEmpty());
			s.push(5);
			s.push(7);
			s.push(9);
			System.out.println(s.isEmpty());
			System.out.println(s.peek());
			System.out.println(s.peek());
			System.out.println(s.pop());
			System.out.println(s.peek());
//			s.push(1);
//			s.push(2);
//			s.push(3);
//			s.push(4);
//			s.push(5);
//			s.push(6);
//			s.push(7);
//			s.push(8);
//			s.push(10);
//			s.push(10);
//			s.push(10);
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.peek());
	}

}
