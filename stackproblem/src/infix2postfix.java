import java.util.*;
class stackd
{
	private	char[] a;
    private  int s;
    private  int top;
        stackd(int size)
        {
        	s=size;
        	a=new char[s];
        	top=-1;
        }
        public void push(char n)
        {
        	a[++top]=n;
        }
        public char pop()
        {
        	return a[top--];
        }
        public char peak()
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
        int prec(char ch)
        {
        	switch(ch)
        	{
        	case '+':
        	case '-':
        		return 1;
        		
        	case '*':
        	case '/':
        		return 2;
        	
        	}
        	return -1;	
        }
        
}

public class infix2postfix {

	static String input(String x)
	{
	String s=new String(" ");
	stackd st=new stackd(20);
	int i;
	for(i=0;i<x.length();i++)
	{
		char c=x.charAt(i);
		if(Character.isLetterOrDigit(c))
		{
			s=s+c;
		}
		else if(c=='(')
		{
			st.push(c);
		}
		else if(c==')')
		{
			while(!st.isempty() && st.peak()!='(')
			{
				s=s+st.pop();
			}
			if(!st.isempty() && st.peak()!='(')
			{
				System.out.println("expression is valid");
			}
			else
				st.pop();
		}
		else
		{
			while(!st.isempty() && st.prec(c)<=st.prec(st.peak()))
			{
				s=s+st.pop();
				
			}
			st.push(c);
		}
	}
	while(!st.isempty())
	{
		s=s+st.pop();
	}
	return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an expression");
		String str=sc.next();
		System.out.println("expression in postfix");
		System.out.println(input(str));
	}
}
