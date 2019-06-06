import java.util.*;
class stack3
{
	int s;
	int[] a;
	int t1,t2;
	stack3(int size)
	{
		s=size;
		a=new int[s];
		t1=-1;
		t2=s-1;
	}
	public void push1(int  n)
	{
		if(t1<t2-1)
		{
		a[++t1]=n;
		}
		else
		{
			System.out.println("stack overflow");
		}
		
	}
	public void push2(int n)
	{
		if(t1<t2-1)
		{
		a[t2--]=n;
		}
		else
		{
			System.out.println("stack overflow");
		}
		
	}
	public int  pop1()
	{
		if(t1>=0)
			return (a[t1--]);
		else
		{
			System.out.println("underflow");
			
		}
		return 0;
	}
	public int  pop2()
	{
		if(t2<s)
			return (a[++t1]);
		else
		{
			System.out.println("underflow");
			
		}
		return 0;
	}
}
public class doublestack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		stack3 s3=new stack3(10);
		s3.push1(12);
		s3.push2(13);
		s3.push1(14);
		s3.push2(15);
		System.out.println(s3.pop1());
	}

}
