//circular queue
import java.util.*;
class circularque
{
	protected int[] a;
	protected int s,front,rear,len;
	circularque(int size)
	{
		s=size;
		a=new int[s];
		front=0;
		rear=0;
		len=0;
	}
	public boolean isempty()
	{
		return (front==0 && rear==0);
	}
	public boolean isfull()
	{
		return ((front==0 && rear==(s-1))|| front==rear+1);
	}
	public void insert(int n)
	{
		if(isfull())
		{
			System.out.println("underflow");
		}
		else if(isempty())
		{
			front=1;
			a[++rear%s]=n;
			++len;
		}
		else if(rear==s)
		{
			rear=1;
			a[++rear%s]=n;
			++len;
		}
		else
		{
			a[++rear%s]=n;
			++len;
		}
	}
	public int delete()
	{
		if(isempty())
		{
			System.out.println("empty");
		}
		int e=a[front];
		a[front]=0;
		if(front==rear)
		{
			rear=front=0;
			
		}
		else if(front==s)
		{
			front=1;
		}
		else
		{
			front++;
		}
		return e;
	}
	public void display()
	{
		if(front==0)
		{
			System.out.println("empty");
		}
		else if(front<=rear)
		{
			int i;
			for(i=front;i<=rear;i++)
			{
				System.out.println(a[i]);
			}
		}
		else
		{
			int i;
			for(i=front;i<s;i++)
			{
				System.out.println(a[i]);
			}
			for(i=1;i<=rear;i++)
			{
				System.out.println(a[i]);
			}
			
		}
		
	}
	
}
public class circularq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int si=sc.nextInt();
		circularque c=new  circularque(si);
		int i;
		System.out.println("1 insertion 2 deletion 3 display");
		i=sc.nextInt();
		while(i!=0)
		{
			switch(i)
			{
			case 1:
				System.out.println("enter an element");
				int ele=sc.nextInt();
				c.insert(ele);
				break;
			case 2:
				System.out.println("deleted element");
				System.out.println(c.delete());
				break;
			case 3:
				System.out.println("elements");
				c.display();
				break;
			}
			System.out.println("enter 1.insertion 2 deletion 3 display");
			i=sc.nextInt();
		}
	}

}
