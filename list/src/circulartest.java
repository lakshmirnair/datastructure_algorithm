import java.util.*;
class node1
{
	int da;
	node1 ne;
	node1(int e)
	{
		da=e;
		ne=null;
	}
	node1(int e,node1 n)
	
	{
		da=e;
		ne=n;
	}
	
}
class list1
{
	node1 h;
	list1()
	{
		h=null;
	}
	public void insertempty(int e)
	{
		node1 a=new node1(e);
		a.ne=a;
		h=a;
	}
	public void insertf(int e)
	{
		node1 tem;
		
		node1 a=new node1(e,h);
		for(tem=h;tem.ne!=h;tem=tem.ne);
		
			tem.ne=a;
			h=a;
		
	}
	public void insertb(int e)
	{
		node1 tem;
		
		node1 a=new node1(e,h);
		for(tem=h;tem.ne!=h;tem=tem.ne);
			
		
		
			tem.ne=a;
			
		
	}
	public void deletef()
	{
		node1 tem;
		int c=h.da;
		for(tem=h;tem.ne!=h;tem=tem.ne);
		
		tem.ne=h.ne;
			h=h.ne;
		
		
	}
	public void deleteb()
	{
		node1 tem;
		int c;
		for(tem=h;tem.ne.ne!=h;tem=tem.ne);
		c=tem.ne.da;
		tem.ne=h;
			
	}
	public void display()
	{
		node1 p=h;
		do {
			p=p.ne;
			System.out.println(p.da);
			
		}while(p!=h);
			
		
		
	}
}



public class circulartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		list1 t=new list1();
		System.out.println("1 insert to an empyt list 2 insert front 3  insert back 4 delete front 0 exist");
		int op;
		op=sc.nextInt();
		while(op!=0)
		{
			switch(op)
			{
			case 1:
				System.out.println("enter element");
				int k=sc.nextInt();
				t.insertempty(k);
				break;
			
			case 2:
				System.out.println("enter element");
				int i=sc.nextInt();
				t.insertf(i);
				break;
				
			case 3:
				System.out.println("enter element");
				int j=sc.nextInt();
				t.insertb(j);
				break;	
				
			case 4:
				t.deletef();
				break;
			case 5:
				t.display();
				break;
			case 6:
				t.deleteb();
				break;
			}
			System.out.println("6 delete back 1insert to an empty list   2 insert front 3  insert back 4 delete front 5 display 0 exist");
		
			op=sc.nextInt();
		}

	}

}
