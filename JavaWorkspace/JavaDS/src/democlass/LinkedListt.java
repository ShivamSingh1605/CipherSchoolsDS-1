package democlass;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class LinkedListt {
	static Node insertAtHead(Node head,int data)
	{
		Node temp = new Node(data);//creation of node
		temp.next=head;
		head=temp;
		return head;
	}
	static Node insertAtEnd(Node head,int data)
	{
		if(head==null)
		{
//			Node temp = new Node(data);
//			head = temp;
//			return head;
			return new Node(data);
		}
		Node temp = new Node(data);//creation of node
		Node lastNode = head;
		while(lastNode.next!=null)//stop when the next of anything becomes null
		{
			lastNode = lastNode.next;
		}
		
		lastNode.next=temp;
		return head;
	}
	static int middleElement(Node head)
	{
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		//slow will be at the middle
		return slow.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next= new Node(4);
		Node temp= head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		//nothing got printed
		temp=head;
		int length = 0;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			length++;
		}
		System.out.println();
		System.out.println(length);
		head = insertAtHead(head,5);
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			length++;
		}
		System.out.println();
		head = insertAtEnd(head,6);
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			length++;
		}
		System.out.println();
		System.out.println(middleElement(head));
		head = insertAtEnd(head,7);
		System.out.println(middleElement(head));
	}

}
