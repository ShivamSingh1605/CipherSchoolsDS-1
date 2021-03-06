package LinkedLists;
class Node//we have defined this class
{
	int data;
	Node next;//reference variable
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class MyLL {
	static Node insertAtHead(Node head,int data)
	{
		Node temp=new Node(data);
		temp.next=head;
		return temp;
//		head=temp;
//		return head;
	}
	static Node insertAtEnd(Node head,int data)
	{
		Node temp=new Node(data);
		if(head==null)//if first node being created
		{
			return temp;
//			head=temp;
//			return head;
		}
		Node last = head;
		while(last.next!=null)
		{
			last=last.next;
		}
		//last refers to the last node of the list
		last.next = temp;
		return head;
	}
	static Node insertAtPos(Node head,int data,int pos)
	{
		if(pos==1)//equivalent to insertion at head
		{
			Node temp=new Node(data);
			temp.next=head;
			return temp;//no need to write else because of return
		}
		Node nayaNode=new Node(data);
		Node temp = head;
		for(int i=0;i<pos-2;i++)
		{
			temp=temp.next;
		}
		nayaNode.next=temp.next;
		temp.next=nayaNode;
		return head;	
	
	}
	static void printLL(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	static void middleElement(Node head)
	{
		int len = 0;
		Node temp=head;
		while(temp!=null)
		{
			len++;
			temp=temp.next;
		}
		temp=head;
		for(int i=0;i<len/2;i++)
		{
			temp=temp.next;
		}
		System.out.println("Middle element is: "+temp.data);
	}
	static void efficientMiddleElement(Node head)
	{
		Node fptr=head;
		Node sptr=head;
//		while(fptr.next!=null && fptr!=null)
		while(fptr!=null && fptr.next!=null)
		{
			fptr=fptr.next.next;
			sptr=sptr.next;
		}
		System.out.println(sptr.data);
	}
	static Node reverse(Node head)
	{
		Node current = head;
		Node prev=null;
		Node next=null;
		while(current!=null)
		{
			//store the next node
			next=current.next; // 2
			//swapping
			current.next=prev;
			//now we have to move current ahead
			prev=current;
			current=next;//shift current to next node
		}

		//after the loop, current will be null and prev will be at the last position which is the head for the new LL

		return prev;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		//directly using head is not a good way, use temp instead
//		while(head!=null)
//		{
//			System.out.print(head.data+" ");
//			head=head.next;
//		}
		Node temp=head;
		while(temp!=null)//head has become null
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
//		temp=head;
//		while(temp!=null)//head has become null
//		{
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
		head=insertAtHead(head,6);//CLEAR WALA CLEAR????
		//ITTTTUUUU saa bhi doubt hai kisiko???
		printLL(head);
		head = insertAtEnd(head,7);
		printLL(head);
		// 6 1 2 3 4 5 7 
		head = insertAtPos(head,8,1);
		head = insertAtPos(head,9,3);
		printLL(head);
//		head = insertAtPos(head,9,12);
//		printLL(head);
		middleElement(head);
		efficientMiddleElement(head);
		head = insertAtPos(head,10,7);
		printLL(head);
		middleElement(head);
		efficientMiddleElement(head);
		head = reverse(head);
		printLL(head);
	}

}
