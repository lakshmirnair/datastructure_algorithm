import java.util.*;
class Dnode
{
	public int da;
	public Dnode ne,pr;
	public Dnode(int e)
	{
		da=e;
		ne=pr=null;
		
	}
	public Dnode(int e,Dnode x,Dnode y)
	{
		da=e;
		ne=x;
		pr=y;
	}
}
class dlist
{
	public Dnode h,t;
	public dlist()
	{
		h=t=null;
	}
	
	public void insertf(int e)
	{
		Dnode n=new Dnode(e,h,null);
		if(h==null)
			h=t=n;
		else
			h.pr=n;
			h=n;
			
		
	}
	public void insertb(int e)
	{
		Dnode n=new Dnode(e,null,t);
		if(h==null)
			h=t=n;
		else
			t.ne=n;
			t=n;
				
	}
	public int deletef()
	{
	
		int a=h.da;
			if(h==t)
				h=t=null;
			else
			{
			h=h.ne;
			h.pr=null;
			}
		
		return a;
	}
	public int  deleteb()
	{
		int a=t.da;
		if(h==t)
			h=t=null;
		else
		{
			t=t.pr;
		t.ne=null;
		}
		return a;
	}
	public void display()
	{
		Dnode te;
		for(te=h;te!=null;te=te.ne)
		{
			System.out.print(te.da+" ");
		}
	}
	public int length()
	{
		int c=0;
		Dnode te;
		for(te=h;te!=null;te=te.ne)
		{
			c++;
		}
		return c;
	}
	public void insertone(int e,int e1)
	{
		Dnode te,n;
		for(te=h;te!=null && te.da!=e ; te=te.ne);
		if(te!=null)
		{
			n=new Dnode(e1,te.ne,te);
			te.ne=n;
			if(te==t)
			{
				t=te.ne;
			}
			
			te.ne.pr=n;
			
			
		}
	}
	public void delete(int e)
	{
		if(h==null)
			System.out.println("list is empty");
		else if(h.da==e && h==t)
			h=t=null;
		else
			if(h.da==e)
			{
				h=h.ne;
				h.pr=null;
			}
		else
		{
			Dnode te;
			for(te=h;te!=null && te.da!=e;te=te.ne);
			if(te!=null)
			{
				if(te==t)
				{
					t=te.pr;
					t.ne=null;
				}
				else
				{
				te.pr.ne=te.ne;
				te.ne.pr=te.pr;
				}
			}
			
		}
		
		
	}
	public void deletepos(int p)
	{
		if(h==t && p==1)
			h=t=null;
		else if(p==1)
		{
			h=h.ne;
			h.pr=null;
		}
		else
		{
			Dnode te=h;
			for(int i=1;i<p-1 && te!=null;i++)
			{
				te=te.ne;
			}
			if(te!=null)
			{
				if(te.ne.ne!=null)
				{
				te.ne=te.ne.ne;
				te.ne.pr=te;
				}
				else
				{
				t=	te;
				te.ne=null;
				}
			}
			
		}
			
				
				
	}
	public void palindrom(Dnode x,Dnode y)
	{
		int c=1;
		Dnode te1=x,te2=y;
		for(;te1!=null && te2!=null ;te1=te1.ne,te2=te2.ne)
		{
			if(te1.da!=te2.da)
			{
				c=0;
				break;
			}
		}
		if(c==1)
			System.out.println("palindrom");
		else
			System.out.println(" not palindrom");
	}
	public void count(int e)
	{
		int c=0;
		Dnode te;
		for(te=h;te!=null;te=te.ne)
		{
			if(te.da==e)
				c++;
		}
		System.out.println("no. of occurence "+ " "+c );
	}
	public void duplicatesort()
	{
			Dnode te;
			for(te=h;te!=null;te=te.ne)
			{
				if(te.da==te.ne.da)
				{
					if(te.ne!=t)
					{
					te.ne=te.ne.ne;
					te.ne.pr=te;
					}
					else
					{
						t=te;
						te.ne=null;
					}
				}
			}
	}
	public void dupliunsort()
	{
		Dnode te1=h,te2;
		while(te1!=null && te1.ne!=null)
		{
			te2=te1.ne;
			while(te2!=null)
			{
				if(te1.da==te2.da)
				{
					Dnode dp=te2.ne;
					deletenode(h,te2);
					te2=dp;
				}
				else
						te2=te2.ne;
			
			}	
		te1=te1.ne;
		}
	}
	public void deletenode(Dnode x,Dnode y)
	{
		if(x==null || y==null)
			System.out.println("empty");
		if(x==y)
			x=y.ne;
		if(y.ne!=null)
			y.ne.pr=y.pr;
		if(y.pr!=null)
			y.pr.ne=y.ne;
		
	}
}
public class doublyist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		dlist s=new dlist();
		dlist s1=new dlist();
		dlist s2=new dlist();
		System.out.println("13 remove duplicate in unsorted 12 remove duplicate in sorted list 11 count 10 palindrom 8 delete one element 9 delete via position  1 insert front 2 insert back 3 delete front 4 delete back 5 display 6 length 7 insert one ele after another");
		int op=sc.nextInt();
		do
		{
			
			switch(op)
			{
			case 1:
					System.out.println("enter a element");
					int n=sc.nextInt();
					s.insertf(n);
					break;
			case 2:
				System.out.println("enter a element");
				int m=sc.nextInt();
				s.insertb(m);
				break;
			case 3:
				System.out.println(s.deletef());
				break;
			case 4:
				System.out.println(s.deleteb());
				break;
			case 5:
				s.display();
				break;
			case 6:
				System.out.println("length of the list");
				System.out.println(s.length());
				break;
			case 7:
				System.out.println("enter 2 numbers one after other");
				int i=sc.nextInt();
				int j=sc.nextInt();
				s.insertone(i, j);
				break;
			case 8:
				System.out.println("enter a number ");
				int  f=sc.nextInt();
				s.delete(f);
				break;
			case 9:
				System.out.println("enter position");
				int pos=sc.nextInt();
				s.deletepos(pos);
				break;	
			case 10:
				System.out.println(" 1 for add element");
				int q=sc.nextInt();
				do
				{
					System.out.println("enter a element");
					int ele=sc.nextInt();
					s.insertf(ele);
					s1.insertb(ele);
					System.out.println(" 1 for add element");
					q=sc.nextInt();	
					
				}while(q!=0);
				s2.palindrom(s.h, s1.h);
				break;
				
			case 11:
				System.out.println("enter element to be searched");
				int se=sc.nextInt();
				s.count(se);
				break;
			case 12:
				s.duplicatesort();
				break;
			case 13:
				s.dupliunsort();
				break;
				
			}
			System.out.println("enter a number");
			op=sc.nextInt();
			
		}while(op!=0);

	}

}
