// implement queue using two stacks
import java.util.*;
class stackdee
{
	private	int[] a;
    private  int s;
    private  int top;
        stackdee(int size)
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
       
 }

public class queue_us_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 stackdee s1=new stackdee(20);
	    stackdee s2=new stackdee(20);
       System.out.println("enter a number 1 deque 2 enque 0 exit");
       int i;
       i=sc.nextInt();
       while(i!=0)
       {
       	switch(i)
       	{
       	case 1:
       		System.out.println("enter a number");
       		int n=sc.nextInt();
       		
       		while(!s1.isempty())
       		{
       			s2.push(s1.pop());
       		}
       		s1.push(n);
       		while(!s2.isempty())
       		{
       			s1.push(s2.pop());
       		}
       		
       		break;
       	case 2:
       		int po=0;
       		if(s1.isempty())
       		{
       			System.out.println("q is empty");
       		}
       		else
       		{
       		System.out.println("poped element :"+s1.pop());
       		}
       		break;
       	}
       	System.out.println("enter a number");
       	i=sc.nextInt();
       }
		
	}

}
