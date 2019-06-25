// to find the middle element in a stack
import java.util.*;
class stackde
{
	private	int[] a;
    private  int s;
    private  int top;
        stackde(int size)
        {
        	s=size;
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
        	return (top==(s-1));
        }
        public int topindex()
        {
        	return top;
        }
        public int middle(int k)
        {
        	return a[k];
        }
       
 }
public class middleone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		 stackde s1=new stackde(20);
	    System.out.println("enter a number 1 push 2 pop 3 peak 4 middle element");
	    int i;
	    i=sc.nextInt();
	    while(i!=0)
	    {
	    	switch(i)
	    	{
	    	case 1:
	    		if(!s1.isfull())
	    		{
	    			System.out.println("enter a number");
	    			int n=sc.nextInt();
	    			s1.push(n);
	    			
	    		}
	    		else
	    		{
	    			System.out.println("stack is full");
	    		}
	    		break;
	    	case 2:
	    		if(!s1.isempty())
	    		{
	    			System.out.println("poped elemnt : "+s1.pop());
	    		}
	    		else
	    		{
	    			System.out.println("stack is empty");
	    		}
	    		break;
	    	case 3:
	    		if(!s1.isempty())
	    		{
	    			System.out.println("peak elemnt : "+s1.peak());
	    		}
	    		break;
	    	case 4:
	    		if(!s1.isempty())
	    		{
	    			int f=s1.topindex();
	    			int r=f/2;
	    			
	    			if(f%2==0)
	    			{
	    				System.out.println("middle element : "+s1.middle(r));
	    			}
	    			else
	    			{
	    				int r1=(int)r;
	    				int r2=r+1;
	    				System.out.println("middle elements are : "+s1.middle(r1)+" "+s1.middle(r2));
	    			}
	    		}
	    		break;
	    	}
	    	System.out.println("enter a number 1 push 2 pop 3 peak 4 middle element");
	    	i=sc.nextInt();
	    }

	}

}
