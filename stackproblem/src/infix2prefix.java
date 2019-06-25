//program to convert infix expression to prefix expression using stack
import java.util.*;
class stack8
{
	private	char[] a;
    private  int s;
    private  int top;
        stack8(int size)
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

public class infix2prefix {

	static String input(String x)
	{
	String s=new String(" ");
	stack8 st=new stack8(20);
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
	System.out.println(s);
	String r="";
	int le=s.length();
	int m;
	for(m=0;m<le;m++)
	{
		r=r+s.charAt(le-m-1);
	}
	
	return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an infix expression");
		String str=sc.next();
		System.out.println("expression in prefix");
		int i;
		String re="";
		int n=str.length();
		for(i=0;i<str.length();i++)
		{
			re=re+str.charAt(n-i-1);
		}
		System.out.println(input(re));
	}
}

