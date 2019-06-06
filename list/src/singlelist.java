import java.util.*;
class node
{
	int da;
	public node ne;
	public node(int e)
	{
		da=e;
		ne=null;
	}
	public node(int e,node n)
	{
		da=e;
		ne=n;
	}
	
}
class list
{
	node h,t;
	public list()
	{
		h=t=null;
	}
	public boolean empty()
	{
		return (h==null);
	}
	public void insertf(int e)
	{
		
			node a=new node(e,h);
			h=a;
		if(h==null)
			t=h;
	}
	public void insertb (int e)
	{
		if(!empty())
		{
			//node tem;
		 
		// for(tem=h;tem!=null;tem=tem.ne);
		 //t=tem;
		 t.ne=new node(e,t.ne);
		 
		 
		 t=t.ne;
		}
		else
		{
			h=t=new node(e);
			
		}
		
	}
	public int deletef()
	{
		int x=h.da;
		if(t==h)
			h=null;
		else
			h=h.ne;
		
		return x;
			
	}
	public int deleteb()
	{
		int x=t.da;
		
		if(t==h)
			h=t=null;
		else
		{node tem;
		for(tem=h;tem.ne!=t;tem=tem.ne);
		
		
		
			t=tem;
			t.ne=null;
		}	
			return x;
	}
	public void display(node n)
	{
		node tem;
		if(!empty())
		{
		for(tem=n;tem!=null;tem=tem.ne)
			System.out.println(tem.da);
		}
	}
	public void insert(int a,int b)
	{
		if(!empty())
		{
			node tem;
			for(tem=h;tem.da!=a && tem!=null;tem=tem.ne);
			if(tem==null)
			{
				System.out.println("no element is present");
			}
			else
			{
				tem.ne=new node(b,tem.ne);
				if(t==tem)
					t=tem.ne;
			}
		}
		
	}
	public int  length(node n)
	{
		
		if(n==null)
			return 0;
		else
			return 1+length(n.ne);
			
	}
	public void deletemiddle(int e)
	{
		if(!empty())
		{
			if(h.da==e && h==t)
			{
				h=t=null;
			}
			if(h.da==e)
				h=h.ne;
			else
			{
				node tem;
				for(tem=h;tem.ne.da!=e && tem!=null;tem=tem.ne);
				if(tem!=null)
				{
				tem.ne=tem.ne.ne;
				if(tem.ne==t)
					t=tem;
				}
				
			}
		}
	}
	public void deleteposition(int a)
	{
		int i;
		if(h==null)
			return;
		if(a==0)
			h=h.ne;
		node tem=h;
		for(i=0;i<a-1 && tem!=null;i++)
		{
			tem=tem.ne;
		}
		if(tem!=null)
		{
		tem.ne=tem.ne.ne;
		}
	}
	public void reverse(node n)
	{//rectify rewrite the same program code
		node pr=null;
		node cu=n;
		node next=null;
		while(n!=null)
		{
			next=cu.ne;
			cu.ne=pr;
			pr=cu;
			cu=next;
		}
		h=pr;
		printreverse(h);
	}
	public void printreverse(node n)
	{
		if(n==null)
			return;
		else
		{
			System.out.println(n.da);
			printreverse(n.ne);
		}
		
	}
	public void sort(node a,node b)
	{
		node he=new node(0);
		node p=he;
		while(a!=null && b!=null)
		{
			
				if(a.da < b.da)
				{
					p.ne=a;
					a=a.ne;
				}
				else
				{
					p.ne=b;
					b=b.ne;
				}
				
				p=p.ne;
			
		
		}
		while(a!=null)
		{
			p.ne=a;
			p=p.ne;a=a.ne;
		}
		while(b!=null)
		{
			p.ne=b;
			p=p.ne;b=b.ne;
		}
		
		node tem;
		for(tem=he.ne;tem!=null;tem=tem.ne)
		{
			System.out.println(tem.da);
		}
	}
	public void swap(int a,int b)
	{
		 if (a == b) return;
		 
	        // Search for x (keep track of prevX and CurrX)
	        node preva = null, curra = h;
	        while (curra != null && curra.da != a)
	        {
	            preva = curra;
	            curra = curra.ne;
	        }
	 
	        // Search for y (keep track of prevY and currY)
	        node prevb = null, currb = h;
	        while (currb != null && currb.da != b)
	        {
	            prevb = currb;
	            currb = currb.ne;
	        }
	 
	        // If either x or y is not present, nothing to do
	        if (curra == null || currb == null)
	            return;
	 
	        // If x is not head of linked list
	        if (preva != null)
	            preva.ne = currb;
	        else //make y the new head
	            h = currb;
	 
	        // If y is not head of linked list
	        if (prevb != null)
	            prevb.ne = curra;
	        else // make x the new head
	            h = curra;
	 
	        // Swap next pointers
	        node temp = curra.ne;
	        curra.ne = currb.ne;
	        currb.ne = temp;
	}
	public void middle()
	{
		int i;
		int c=0;
		node tem;
		for(tem=h;tem!=null;tem=tem.ne)
		{
			++c;
		}
		
		if(h==t)
			System.out.println(h.da);
		node p;
		if(c%2==1)
		{
			int a=(c/2)+1;
		for(i=1,p=h; i<a && p!=null ;i++,p=p.ne);
		
		System.out.println(p.da);
		}
		else
		{
			int a=(c/2);
			for(i=1,p=h; i<a && p!=null ;i++,p=p.ne);
			
			System.out.println(p.da);
			System.out.println(p.ne.da);
		}
	}
	public void find(int nr)
	{
		node p;
		int i=1;
		for(p=h;i<nr && p!=null;p=p.ne,i++);
		System.out.println(p.da);
	}
	public void findlast(int nr)
	{	int co=0;
	node p;
		for(p=h;p!=null;p=p.ne)
		{
			co=co+1;
		}
		
		int i=1;
		for(p=h;i<co-nr+1 && p!=null;p=p.ne,i++);
		System.out.println(p.da);
	}
	
	public void duplicate()
	{
		
		node tem;
		if(h!=null)
		{
			for(tem=h;tem.ne!=null;tem=tem.ne)
			{
				if(tem.da==tem.ne.da)
				
					tem.ne=tem.ne.ne;
				
				
					
			}
		}
		
	}
	public void duplicate1()
	{
		node tem,p;
		for(tem=h;tem.ne!=null;tem=tem.ne)
		{
			p=tem;
			for(;p.ne!=null;p=p.ne)
			{
				if(tem.da==p.ne.da)
					p.ne=p.ne.ne;
			}
		}
	}
	public void swappair()
	{
		node p;
		for(p=h;p.ne!=null && p!=null ;p=p.ne.ne)
		{
			int  tem;
			tem=p.da;
			p.da=p.ne.da;
			p.ne.da=tem;
		}
	}
	public void deletealter()
	{
		node p;
		for(p=h;p.ne!=null && p!=null ;p=p.ne)
		{
			p.ne=p.ne.ne;
		}
	}
	public void middleone(node n)
	{
		if(n==null)
			return ;
		node fa=n;
		node sl=n.ne;
		while(fa!=null)
			
		{
			fa=fa.ne;
		if(fa!=null)
			{
				
				sl=sl.ne;
				fa=fa.ne;
			}
		}
		
		System.out.println("middle "+sl.da);
		
	}
}
public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		list s=new list();
		list s1=new list();
		list s2=new list();
		Scanner sc=new Scanner(System.in);
		int p;
		int el;
		System.out.println("13 middle element 12 swap without swapping data 1 insert front 2 insert back 3 delete front 4 delete back 5 display  0 exit");
		 p=sc.nextInt();
		 while(p!=0)
		 {
			 switch(p)
			 {
			 case 1:
				 System.out.println("enter a number");
				 el=sc.nextInt();
				 s.insertf(el); break;
				 
			 case 2:
				 System.out.println("enter a number");
				 el=sc.nextInt();
				 s.insertb(el); break;
				 
				 
			 case 3:
				 if(s.empty())
					 System.out.println("empty list");
				 else
				 {
					 el=s.deletef();
					 System.out.println(el);
				 }
				 
				 break;
				 
				 
			 case 4:
				 if(s.empty())
					 System.out.println("empty list");
				 else
				 {
					 el=s.deleteb();
					 System.out.println(el);
				 }
				 
				 break;
			 case 5:
				 s.display(s.h);
				 break;
			 case 0:
				 break;
			 case 6:
				 System.out.println("enter 2 elements");
				 int f=sc.nextInt();
				 int g=sc.nextInt();
				 s.insert(f,g );
				 break;
			 case 7:
				 System.out.println(s.length(s.h));
				 break;
			 case 8:
				 System.out.println("enter a no");
				 int k=sc.nextInt();
				 s.deletemiddle(k);
				 break;
			 case 9:
				 System.out.println("enter the position");
				 int y=sc.nextInt();
				 s.deleteposition(y);
				 break;
			 case 10:
				 s.reverse(s.h);
				 break;
				 
			 case 11:
				 System.out.println("enter no of elements");
				 int n=sc.nextInt();
				 System.out.println("enter elements for 1st list(from large element to small");
				 for(int i=0;i<n;i++)
				 {
					 int e=sc.nextInt();
					 s1.insertf(e);
				 }
				 
				 
				 System.out.println("enter elements for 2nd list(from large element to small");
				 for(int i=0;i<n;i++)
				 {
					 int e=sc.nextInt();
					 s2.insertf(e);
				 }
				 s.sort(s1.h,s2.h);
				 
				 break;
				 
				 
			 case 12:
				 System.out.println("ënter elements");
				 int x=sc.nextInt();
				 int q=sc.nextInt();
				 s.swap(x,q);
				 break;
			 case 13:
				 s.middle();
				 break;
			 case 14:
				// s.palindrome();
				 break;
				 
			 case 15:
				 System.out.println("enter a nth node");
				 int  fq=sc.nextInt();
				 s.find(fq);
				 break;
				 
			 case 16:
				 System.out.println("enter a nth node");
				 int  lq=sc.nextInt();
				 s.findlast(lq);
				 break;
			 case 17:
				 s.duplicate();
				 break;
			 case 18:
				 s.duplicate1();
				 break;
			 case 19:
				 s.swappair();
				 break;
			 case 20:
				 s.deletealter();
				 break;
				 
			 case 21:
				 s.middleone(s.h);
				 break;
				 
			 }
		 
			 System.out.println("	21	middle by recursively	20 delete	al	ternatenodes 	19 swap pair wise		18duplicate from unsorted list 17  remove duplicate from sorted linked list 16 find from the last  15 find nth node element 14 check palindrome 13 middle 12 swap without swapping data 11 merge two sorted list 10 reverse a list 9 delete via position  8 delete middle  7 length 6 insert element in middle 1 insert front 2 insert back 3 delete front 4 delete back 5 display  0 exit");
			 p=sc.nextInt();
		 }

	}

}
