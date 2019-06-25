//implement a queue using 2 stacks
import java.util.*;

class stack
{
	protected int s,top;
	protected int[] a;
	
	stack(int si)
	{
		s=si;
		a=new int[s];
		top=-1;
		
	}
	public void push(int n)
	{
		a[++top]=n;
	}
	public int pop()
	{
		return a[top--];
	}
	public int peak()
	{
		return a[top];
	}
	public boolean isempty()
	{
		return (top==-1);
	}
	public boolean isfull()
	{
	   return (top==s-1);
	}
	
}
public class quse_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		stack st1=new stack(n);
		stack st2=new stack(n);
		int i;
		System.out.println("enter 1 enqueue  2 dequeue ");
		i=sc.nextInt();
		while(i!=0)
		{
			switch(i)
			{
			case 1:
				if(!st1.isfull())
				{
				System.out.println("enter element");
				int ele=sc.nextInt();
				while(!st1.isempty())
				{
					st2.push(st1.peak());
					st1.pop();
					
				}
				st1.push(ele);
				}
				while(!st2.isempty())
				{
					st1.push(st2.peak());
					st2.pop();
				}
				break;
				
			case 2:
				if(!st1.isempty())
				{
					System.out.println("poped element  "+st1.pop());
				}
				
				
				break;
				
			}
			System.out.println("1 enque 2 deque");
			i=sc.nextInt();
		}

	}

}
