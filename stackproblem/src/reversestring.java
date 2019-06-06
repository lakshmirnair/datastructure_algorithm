import java.util.*;
class stack
{
	int s;
	char[] a;
	int top;
	stack(int size)
	{
		s=size;
		a=new char[s];
		top=-1;
	}
	public void push(char n)
	{
		a[++top]=n;
		
	}
	public char  pop()
	{
		return (a[top--]);
		
	}
	public char peek()
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
public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ano.");
		int n=sc.nextInt();
		stack s=new stack(n);
		System.out.println("enter a string");
		String st=sc.next();
		for(int i=0;i<st.length();i++)
		{
			s.push(st.charAt(i));
		}
		
		while(!s.empty())
		{
			System.out.print(s.pop());
		}
	}

}
