import java.util.*;
class stack1
{
	int s;
	char[] a;
	int top;
	stack1(int size)
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
public class paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean  b=true;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ano.");
		int n=sc.nextInt();
		stack1 st =new stack1(n);
		System.out.println("enter a string");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' ||s.charAt(i)=='{') 
			{
				st.push(s.charAt(i));
				
			}
			else
				if(s.charAt(i)==')' ||s.charAt(i)=='}') 
			{
				if(st.empty())
					b=false;
				
				
				else
				{
					ch=st.pop();
					if(s.charAt(i)==')'&&ch!='(')
						b=false;
					else
						if(s.charAt(i)=='}'&&ch!='{')
							b=false;
					
				}
			}
		}
			if(!st.empty())
			{
				b=false;
			}	
			
			
		
		if(b)
			System.out.println(" maching ");
		else
			System.out.println("not  maching ");
	}

}

