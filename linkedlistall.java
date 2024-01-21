package datastructure;

public class linkedlistall {
	
		class Node {
			int data;
			Node next;
			Node(int data){
				this.data=data;
				
			}
			Node(int data,Node next){
				this.data=data;
				this.next=next;
			}
		}
		Node Head;
		Node Tail;
		int index1;
		void insertatfont(int data) {
			if(Tail==null) {
				Tail=Head;
			}
			Node cur=new Node(data);
			cur.next=Head;
			Head=cur;
			index1++;
			
		}
		void insrtatback(int data) {
			if(Head==null) {
				insertatfont(data);
				return;
			}
			Node fg=new Node(data);
			fg.next=null;
			Tail.next=fg;
			Tail=fg;
			index1++;
		}
		void insertatindex(int index,int data) {
			
			if(index==0) {
				insertatfont(data);
			
			}
			else if(index==index1) {
				insrtatback(data);
			}
			else {
				Node cur=Head.next;
				Node pre=Head;
				for(int i=1;i<index;i++) {
					cur=cur.next;
					pre=pre.next;
				}
				Node qw=new Node(data,cur);
				pre.next=qw;
				
			}
		}
		int getindex(int dat) {
			Node cur=Head;
			int count=0,ans=-1;
			while(cur.next!=null) {
				if(cur.data==dat) {
					ans=count;
					break;
				}
				cur=cur.next;
				count++;
			}
			return ans;
		}
		void deleteatfront() {
			Node cur=Head;
			Head=cur.next;
			index1--;
		}
		void deleteatindex(int index) {
			if(index==0) {
				deleteatfront();
			}
			else if(index==index1) {
				deleteatend();
			}
			else {
			Node cur=Head.next.next;
			Node pre=Head;
			for(int i=1;i<index;i++) {
				cur=cur.next;
				pre=pre.next;
			}
			pre.next=cur;
			index1--;
			}
		}
		void deleteatnode(int data)
		{
			int g=getindex(data);
			if(g!=-1) {
				deleteatindex(g);
			}
			else {
				System.out.println("element not found");
			}
		}
		void deleteatend() {
			Node cur=Head.next;
			Node pre=Head;
			while(cur.next!=null) {
				cur=cur.next;
				pre=pre.next;
			}
			pre.next=null;
			Tail=pre;
			index1--;
		}
		void display() {
			Node cur=Head;
			while(cur!=null) {
				System.out.print(cur.data+"-->");
				cur=cur.next;
				
			}
			System.out.println("null");
		}
		void reversedisplay() {
			if(Head.next==null && Head!=null) {
				display();
			}
			else if(Head!=null&& Head.next!=null) {
				Node cur=Head.next;
				Node pre=Head;
				while(cur!=null) {
					Node tem=cur.next;
					cur.next=pre;
					pre=cur;
					cur=tem;
				}
				Head.next=null;
				Head=pre;
				display();
			}
		}
		public static void main(String[] args) {
			linkedlistall sd=new linkedlistall();
			sd.insertatfont(23);
			sd.insertatfont(33);
			sd.insrtatback(99);
			sd.insrtatback(876);
			
			//sd.deleteatfront();
			//sd.deleteatend();
			sd.insertatindex(2, 9999);
			sd.display();
			sd.deleteatindex(3);
			sd.display();
			sd.getindex(99);
			sd.deleteatnode(33);
			sd.display();
			sd.reversedisplay();
			System.out.println("End");
		}
	}


