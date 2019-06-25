//reversing a queue
import java.util.*;
class que
{
	protected int[] a;
	protected int f,r,s,len;
	que(int size)
	{
		s=size;
		a=new int[s];
		f=0;
		r=s-1;
		len=0;
	}
	public boolean isempty()
	{
	  return (r==s-1 );	
	}
	public boolean isfull()
	{
		return (r==-1);
	}
	public void enque(int n)
	{
		if(r<0)
		{
			System.out.println("enque not possible");
		}
		else
		{
			a[r]=n;
			r--;
			len++;
		}
	}
	public int  deque()
	{
		int e=0;
		if(f==0 && r!=(s-1))
		{
			e=a[f];
			len--;
			if(f==r)
			{
				f=0;
				r=s-1;
			}
			else
			{
				f++;
			}
		}
		return e;
		
	}
	public void display()
	{
		int i;
		for(i=f;i<=len;i++)
		{
			System.out.println(a[i]);
		}
	}
}
public class reverseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		que q1=new que(n);
		System.out.println(" enter 1 enque 2 deque ");
        int i;
        i =sc.nextInt();
        while(i!=0)
        {
        switch(i)
        {
        case 1:
        	if(!q1.isfull())
        	{   System.out.println("enter a number");
        		int e=sc.nextInt();
        		q1.enque(n);
        	}
        	else
        	{
        		System.out.println("full");
        	}
        	break;
        	
        case 2:
        	if(!q1.isempty())
        	{
        		System.out.println("element "+q1.deque());
        	}
        	break;
        
        }
       System.out.println("enter 1 enque 2 deque ");
       i=sc.nextInt();
	}
        
	}

}
