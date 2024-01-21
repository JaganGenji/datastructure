package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class stack {
	int a[];
	int t=-1;
	int size;
	public stack(int n) {
		size=n;
		
		a=new int[n];
	}
	void push(int p)
	{
		if(t<size)
		{
			t++;
		}
		a[t]=p;
	}
	void pop()
	{
		int pop_ele;
		if(t!=-1)
		{
			pop_ele=a[t];
			a[t]=0;
			t--;
		}
	}
	void peek()
	{
		int peek = 0;
		if(t!=-1)
		{
			peek=a[t];
		}
		System.out.println("peek element is  :"+peek);
	}
	void print()
	{
	/**for (int i = 0; i <=t; i++) {
		System.out.println(a[i]);
		
	}**/
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void main(String[] args) {
		int n;
		int el;
		System.out.println("enter size of stack");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		stack t=new stack(n);
		System.out.println("1.push   2.pop   3.peek 4.print   5.break");
		while(true)
		{
			
		
		System.out.println("enter operation");
		int op=sc.nextInt();
		switch (op) {
		
		case 1:
			System.out.println("enter push element");
			el=sc.nextInt();
			  t.push(el);
			  break;
		case 2:
			t.pop();
			break;
		case 3:t.peek();
		break;
		case 4:
			System.out.println("stack elements");
			t.print();
			break;
		case 5:
			System.out.println("terminated");
			System.exit(0);
			break;
		
		
			
		

		default:
			System.out.println("");
			break;
		}
		}
		
		
		
	}

}
