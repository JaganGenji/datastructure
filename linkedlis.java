package datastructure;

import datastructure.linkedlist.Node;

public class linkedlis {
	node head;
	int size;
	class node
	{
		String data;
		node next;
		node(String data)
		{
			this.data=data;
			this.next=null;
			size++;
			
		}
	}
	void insertfirst(String data)
	{
		node newnode=new node(data);
		newnode.next=head;
		head=newnode;
	}
	void insertlast(String data)
	{
		node newnode=new node(data);
		node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newnode;
	}
	void delfirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		size--;
		head=head.next;
	}
	void dellast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			
		}
		size--;
		node secondlast=head;
		node last=head.next;
		
		if(head.next==null)
		{
			head=null;
			return;
		}
		
		while(last.next!=null)
		{
			last=last.next;
			secondlast=secondlast.next;
		}
		secondlast.next=null;
	}/**public void deleteend() {
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
	
		
	}**/
	void print()
	{
		node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println("null");
		System.out.println("size==="+size);
	}
	public static void main(String[] args) {
		linkedlis l=new linkedlis();
		l.insertfirst("jagan");
		
		l.insertfirst("genji");
		l.insertlast("mohan");
		l.print();
		l.delfirst();
		l.print();
		l.dellast();
		l.print();
		
		
	}

}
