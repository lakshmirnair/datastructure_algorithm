import java.util.*;
import java.lang.*;
class stack4
{
	private	String[] a;
    private  int s;
    private  int top;
        stack4(int size)
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
public class prefix2infix {
	static String input(String x)
	{
	String s=new String(" ");
	stack4 st=new stack4(20);
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
		
		  r="("+op1+Character.toString(c)+op2+")";
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
		System.out.println("Enter a prefix expression");
		String in=sc.next();
		int n=in.length();
		int i;
		String re="";
		for(i=0;i<n;i++)
		{
			re=re+in.charAt(n-i-1);
			
		}
		;
		System.out.println("infix expression : "+input(re));

	}

}
