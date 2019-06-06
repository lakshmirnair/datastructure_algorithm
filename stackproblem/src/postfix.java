import java.util.*;
class stack2
{
	int s;
	int[] a;
	int top;
	stack2(int size)
	{
		s=size;
		a=new int[s];
		top=-1;
	}
	public void push(int  n)
	{
		a[++top]=n;
		
	}
	public int  pop()
	{
		return (a[top--]);
		
	}
	public int peek()
	{
		return a[top];
	}
	public boolean full()
	{
		return (top==s-1);
	}
	public boolean empty()
	{
		return (top==-1);
	}
}
public class postfix {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int p1,p2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ano.");
		int n=sc.nextInt();
		stack2 s1 =new stack2(n);
		System.out.println("enter a string");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9') 
			{
				s1.push(s.charAt(i)-'0');
			}
			else
			{
			p1=s1.pop();
			p2=s1.pop();
			switch(s.charAt(i))
			{
			case'+': s1.push(p2+p1);break;
			case'-': s1.push(p2-p1);break;
			case'*': s1.push(p1*p2);break;
			case'/': s1.push(p2/p1);break;
			
			}
			}
		}
		System.out.println(s1.pop());
	}

}
