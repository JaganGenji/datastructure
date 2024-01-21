package datastructure;



public class linkedlist {
	Node head;
	int size;
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data=data;
			this.next=null;
			size++;
		}
	}
	public void insertFirst(String data)
	{
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
	}
	public void insertlast(String data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		Node currentnode=head;
		while(currentnode.next!=null)
		{
			currentnode=currentnode.next;
			
		}
		currentnode.next=newnode;
		
	}
	void deletefirst()
	{
		if(head==null)
		{
			System.out.println("linkedlist is empty");
		}
		head=head.next;
		size--;
	}
public void deleteend() {
	if(head==null)
	{
		System.out.println("linked list is empty");
	}
	Node secondlast=head;
	Node last=head.next;
	if(head.next==null)
	{
		head=null;
		return;
	}
	size--;
	while(last.next!=null)
	{
		secondlast=secondlast.next;
		last=last.next;
	}
	secondlast.next=null;
	
		
	}

	public void printlist()
	{
		Node currentnode =head;
		
		while(currentnode!=null)
		{
			System.out.print(currentnode.data+"-->");
			currentnode=currentnode.next;
		}
		System.out.println("Null");
		System.out.println("size of list=="+size);
	}
	
			
	public static void main(String[] args) {
		linkedlist l=new linkedlist();
		l.insertFirst("jagan");
		l.insertFirst("mohan");
		l.insertFirst("genji");
		l.insertlast("duppalapudi");
		
		l.printlist();
		l.deletefirst();
		
		l.printlist();
		l.deleteend();
		l.printlist();
		
		
	}

}
