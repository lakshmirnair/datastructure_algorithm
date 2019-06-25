// program to convert postfix to prefix 
import java.util.*;
import java.lang.*;
class stack6
{
	private	String[] a;
    private  int s;
    private  int top;
        stack6(int size)
        {
        	s=size;
        	a=new String[s];
        	top=-1;
        }
        public void push(String n)
        {
        	a[++top]=n;
        }
        public String pop()
        {
        	return a[top--];
        }
        public String peak()
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
        public String middle(int k)
        {
        	return a[k];
        }
       
 }
public class postfix2prefix {
	static String input(String x)
	{
	String s=new String(" ");
	stack6 st=new stack6(20);
	int i;
	for(i=0;i<x.length();i++)
	{
		
	  if(x.charAt(i)=='+'||x.charAt(i)=='-'||x.charAt(i)=='*'||x.charAt(i)=='/')
	  {
		  if(!st.isempty())
		  {
		  char c=x.charAt(i);
		  String op1=st.peak();
		  st.pop();
		  String op2=st.peak();
		  st.pop();
		  String r=" ";
		//concatenation order  is important
		  r=Character.toString(c)+op2+op1;
		  st.push(r);
		  }
		 
	  }
	  else
	  {
		  String c=Character.toString(x.charAt(i));
		  if(!st.isfull())
		  {
		    st.push(c);
		  }
	  }
	 
	}
     return st.peak();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a postfix expression");
		String in=sc.next();
		int n=in.length();
		int i;

		System.out.println("prefix expression : "+input(in));

	}

}





