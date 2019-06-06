import java.util.*;
import java.math.*;
class btnode
{
	btnode rg,le;
	int da;
	public btnode()
	{
		le=null;
		rg=null;
		da=0;
	}
	public btnode(int n)
	{
		le=null;
		rg=null;
		da=n;
		
	}
}
class level{
	int le;
}
class bt
{
	
	static int pos=0;
	static btnode[] ar;
	int gr=0;
	int ay[];
	btnode root;
	int a[];
	int c,p,i;
	public bt()
	{
		root=null;
		
	}
	public boolean isEmpty()
	{
		return (root==null);
	}
	public void insert(int n)
	{
		root=insert(root,n);
	}
	private btnode insert(btnode b,int d)
	{
		if(b==null)
			b=new btnode(d);
		else
		{
			if(b.le==null)
				b.le=insert(b.le,d);
			else
				b.rg=insert(b.rg,d);
		}
		return b;
	}
	public void count()
	{
		 c=count(root);
		System.out.println("count :"+ c);
		
	}
	private int count(btnode b)
	{
		if(b==null)
			return 0;
		else
		{
			int c=1;
			c=c+count(b.le);
			c=c+count(b.rg);
			return c;
			
		}
		
	}
	
public	void inorder()
{
	inorder(root);
}
public void inorder(btnode r)
{
	if(r!=null)
	{
	inorder(r.le);
	System.out.println(r.da);
	inorder(r.rg);
	}
	
	
}
public	void preorder()
{
	preorder(root);
}
private void preorder(btnode r)
{
	if(r!=null)
	{
	System.out.println(r.da);
	preorder(r.le);
	preorder(r.rg);
	
	}
	
	
}
	
public	void postorder()
{
	postorder(root);
}
private void postorder(btnode r)
{
	if(r!=null)
	{
	
	postorder(r.le);
	
	postorder(r.rg);
	System.out.println(r.da);
	}
	
	
}
public void search( int d)
{
	System.out.println(search(root,d));
}
private  boolean search(btnode b,int d)
{
	if(b.da==d)
		return true;
	if(b.le!=null)
		if(search(b.le,d))
			return true;
	if(b.rg!=null)
		if(search(b.rg,d))
			return true;
	return false;
	
}

public void pre() 
	{	
	 i=0;
	a=new int[c];
	inpre(root);
	test();
	
	}
	
  void  inpre(btnode r)
{
	
	if(r!=null)
	{
		inpre(r.le);
		
		
			a[i]=r.da;
			System.out.println(a[i]);
			i++;
		
		inpre(r.rg);
		
	}	
	
}
  
  public  void  test()
  {
	Scanner ob=new Scanner(System.in);
		System.out.println("enter a no");
		int d=ob.nextInt();
	for(int  k=0;k<c;k++)
	{
		if(a[k]==d)
		{
			System.out.println(a[k+1]);
		}
			
	}
	//System.out.println("inorder :" +p);
		
		
  }
public  void  cbcb(int[] p,int[] pm,int s)
  {
	  btnode b;
	  level lee=new level();
	  int w=s-1;
	  b=binary(p,pm,lee,0,w,s);
	  inorder(b);
	  boolean ds=true;
	  oddlevel(b,true);
	  
  }
  
  btnode binary(int e[],int em[],level v,int lo,int h,int s)
  {
	  
	  
	  if(v.le>=s||lo>h)
		  return null;
	                                                                    
	  btnode r=new btnode(e[v.le]);
			  ++v.le;
	if(lo==h)
		return r;
	
	int f;
	for(f=lo;f<=h;f++)
	{
		if(e[v.le]==em[f])
			break;
	}
	
	
	
	if(f<=h)
	{
		
		
		r.le=binary(e,em,v,f,h,s);
		r.rg=binary(e,em,v,lo+1,f-1,s);
	}
	
	
	
	
	return r;
	
	
	
	
	
	  
  }
  void prein(int[] p,int[] pm,int s)
  {
	  btnode b;
	  level lee=new level();
	  
	  b=binprein(p,pm,lee,0,s-1,s);
	  postorder(b);
  }
  btnode binprein(int e[],int em[],level v,int lo,int h,int s)
  {
	  
	  
	  if(v.le>=s||lo>h)
		  return null;
	
	  btnode r=new btnode(e[v.le]);
	  ++v.le;
	  	if(lo==h)
	  		return r;

	  	int f;
	  	for(f=lo;f<=h;f++)
	  	{
	  		if(e[v.le]==em[f])
	  			break;
	  	}	
	  
	  
	  if(lo<=h)
	  {
	  	r.le=binary(e,em,v,lo,f-1,s);
		r.rg=binary(e,em,v,f+1,h,s);
	  
	  }	
	  
	  
	  return r;
  }
  
	void oddlevel(btnode b,boolean c)
	{
		
		if(b==null)
			return ;
		
		if(c)
			System.out.print(b.da+" ");
		
		
		oddlevel(b.le,!c);
		oddlevel(b.rg,!c);
			
	}
	void arraytest(int he)
	{
		
		 for (i=1; i<=he; i++)
	            printlev(root, i);
		
		 
		 
		
	}
	void printlev(btnode  b,int g)
	{
		
		if (b == null)
            return;
        if (g == 1)
            System.out.print(b.da + " ");
        else if (g > 1)
        {
            printlev(b.le, g-1);
            printlev(b.rg, g-1);
        }
		
		
		
	}
	
	public int  maxhe(btnode n)
	{
		if(n==null)
			return 0;
		else
		{
			int lh=maxhe(n.le);
			int rh=maxhe(n.rg);
			
		if(lh>rh)
			return (lh+1);
		else
			return (rh+1);
		
		}
		
	}
	void  artobi(int he)
	{
		
		
		
	 int[] y= {2,1,4,-1,-1,3,5};
	 btnode f =new btnode();
	 f=cnvrt(y,0);
	 inorder(f);
		
		
		
		
	}
	
	btnode cnvrt(int[] ar,int pos){
        if((pos>ar.length-1)||(ar[pos]==-1))
            return null;
        btnode tmp = new btnode();
        tmp.da = ar[pos];
        tmp.le = cnvrt(ar,2*pos+1);
        tmp.rg = cnvrt(ar,2*pos+2);
        return tmp;
    }
	
	void great()
	{
		
		
		int k=great(root);
		System.out.println(k);
		
		
		
	}
	int  great(btnode b)
	{
		
		if(b!=null)
		{
			great(b.le);
			
			if(b.da>gr)
				gr=b.da;
			
			great(b.rg);
			
		}
		
		
	return gr;
	}
	
	
}
	

	


public class btexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int th=0;
		bt t=new bt();
		Scanner sc =new Scanner(System.in);
		int p;
		System.out.println(" 14 greatest no.enter 13 array to binary 12 height 11 make array from bt10 ct bt from in and pre order 9 print oddlevel 8 ct bt from mirror preorder 1 insert 2 preorder 3 inorder 4 postorder 5 search 6 count  7predessor");
		p=sc.nextInt();
		while(p!=0)
		{
			switch(p)
			{
			case 1:
				System.out.println("enter a no");
				t.insert(sc.nextInt());
				break;
				
			case 2:
				t.preorder();
				break;
				
			case 3:
				t.inorder();
				break;
			case 4:
				t.postorder();
				break;
			case 5:
				t.count();
				break;
			case 6:
				System .out.println("enter a element");
				int i=sc.nextInt();
				t.search(i);
				break;
			case 7:
				
				t.pre();
				break;
			case 8:
				int kp[]= {1,2,4,5,3,6,7};
				int kpm[]= {1,3,7,6,2,5,4};

				
				t.cbcb(kp,kpm,7);
				break;
			case 9:
				boolean gh=true;
				t.oddlevel(t.root,gh);
				break;
			case 10:
				int kp1[]= {1,2,4,5,3,6,7};
				int kpm1[]= {4,2,5,1,6,3,7};
				t.prein(kp1,kpm1,7);
				break;
			case 11:
				t.arraytest(th);
				break;
				
			case 12:
				 th=t.maxhe(t.root);
				/* th--  then  make array from  bt is  showing error  if it is not there  height is show-error  */
				System.out.println("height  "+ th);
				break;
			case 13:
				t.artobi(th);
				break;
			case 14:
				t.great();
				break;
				
			}
				System.out.println("14 greatest no.13 array to binary 12 height 11 make array from bt 10 ct bt from in and pre order enter 9 print level 8mirror preorser 1 insert 2 preorder 3 inorder 4 postorder 5 search 6 count  7predessor");
				p=sc.nextInt();
			
			
		}
	}

}
