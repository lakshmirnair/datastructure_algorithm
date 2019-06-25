import java.util.*;
class defineq
{
	protected int a[];
	protected int fr,rear,s,len;
	public defineq(int si)
	{
		s=si;
		a=new int[s];
		rear=-1;
		fr=-1;
		len=0;
	}
	public boolean isfull()
	{
		return (rear==s-1 && fr==0);
	}
	public boolean isempty()
	{
		return fr==-1;
	}
	public int peak()
	{
		if(isempty())
		{
			System.out.println("queue is empty");
		}
		else
		{
			return a[fr];
		}
		return -1;
	
	}
	public void insert(int n)
	{
		if(rear==-1)
		{
			fr=rear=0;
			a[fr]=n;
		}
		else if(rear+1>=s)
		{
			System.out.println("insertion not possible");
		}
		else
		{
			a[++rear]=n;
		}
		  
	}
	public int delete()
	{
		int e=0;
		if(isempty())
		{
			System.out.println("underflow q is empty");
		}
		else
		{
			len--;
			 e=a[fr];
			if(fr==rear)
			{
				fr=rear=-1;
			}
			else
			{
				fr++;
			}
			
		}
		return e;
		
	}
	public void display()
	{
		if(len==0)
		{
			System.out.println("empty");
		}
		for(int i=fr;i<=rear;i++)
		{
			System.out.println(a[i]);
		}
	}
			
}
public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int si=sc.nextInt();
		defineq q=new defineq(si);
		int i;
		System.out.println("enter a number 1 insertion 2 delete 3 display");
		i=sc.nextInt();
		while(i!=0)
		{
			switch(i)
			{
			case 1:
				System.out.println("enter a number");
				int ele=sc.nextInt();
				q.insert(ele);
				break;
			case 2:
				System.out.println("dequed element "+q.delete());
				break;
			case 3:
				q.display();
				break;
			}
			System.out.println("enter 1 insertion 2 delete 3 display");
			i=sc.nextInt();
		}

	}

}
