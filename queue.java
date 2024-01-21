package datastructure;

import java.util.Arrays;

public class queue {
	int a[]=new int[5];
	int first=-1,last=-1;
	 void insert(int e)
	{
		if(first==-1)
		{
			first++;
			last++;
			a[first]=e;
			
		}
		else
		{
			last++;
			a[last]=e;
		}
		System.out.println(Arrays.toString(a));
	}
	 void delete()
	 {
		 a[first]=0;
		 first++;
		 System.out.println(Arrays.toString(a));
	 }
	 void peek()
	 {
		System.out.println("peek value="+a[first]); 
	 }
	public static void main(String[] args) {
		queue q=new queue();
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.delete();
		q.delete();
		q.delete();
		
		q.insert(3);
		q.insert(4);
		q.peek();
		
		
		
		
	}

}
