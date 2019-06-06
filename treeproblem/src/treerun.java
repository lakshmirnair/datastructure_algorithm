import java.util.*;
class node
{
	int da;
	node rg,le;
	node(int e)
	{
		da=e;
		rg=le=null;
	}
	
}
class bst
{
	
	static int c;
	 static int i=0;
	 boolean[] a;
	 Queue<Integer> q;
	node root;
	bst()
	{
		root=null;
	}
	public void insert(int k)
	{
		root=insert(root,k);
	}
	
	
private node insert(node n,int k)
	{
		if(n==null)
		{
			n=new node(k);
			return n;
		}
		if(k<n.da)
			n.le=insert(n.le,k);
		if(k>n.da)
			n.rg=insert(n.rg,k);
		
		return n;
	
	}
public void preorder(node n)
{
	if(n!=null)
	{
		System.out.print(n.da+" ");
		preorder(n.le);
		preorder(n.rg);
	}
}
public void postorder(node n)
{
	if(n!=null)
	{
		
		preorder(n.le);
		preorder(n.rg);
		System.out.print(n.da+" ");
	}
}
public void inorder(node n)
{
	if(n!=null)
	{
		
		preorder(n.le);
		System.out.print(n.da+" ");
		preorder(n.rg);
		
	}
}


public  void large(node n)
{
	/*if(n.rg==null)
		System.out.println(n.da);
	else
		large(n.rg);*/
	
	if(n!=null)
	{
		
		large(n.le);
		
		if(i<n.da)
			i=n.da;
		
		large(n.rg);
		
	}
	
	
	
	
	
	
}
public  void count(node n)
{
	
	while(n!=null)
	{
		count(n.le);
		i=n.da;c++;
		count(n.rg);
	}
	
}
//public void levelorder(bst bs,int v)

	



}
public class treerun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bst b=new bst();
		Scanner sc=new Scanner(System.in);
		System.out.println("1 insert 2 preorder 3 inorder 4 postorder 5 large 6 count ");
		int p;
		
		p=sc.nextInt();
		while(p!=0)
		{
			switch(p)
			{
			
			case 1:
					System.out.println("enter no of elements");
					int n=sc.nextInt();
					System.out.println("enter  elements");
					for(int i=0;i<n;i++)
					{
						int x=sc.nextInt();
						b.insert(x);
					}
					break;
			case 2:
				b.preorder(b.root);
				break;
				
			case 3:
				b.inorder(b.root);
				break;	
			case 4:
				b.postorder(b.root);
				break;	
				
			case 5:
				b.large(b.root);
				System.out.println(b.i);
				break;
			case 6:
				b.count(b.root);
				System.out.println(b.c);
				break;
				
			}
			
			System.out.println("1 insert 2 pre 3 in 4 post 5 large 6 count  7 level order traversal ");
			p=sc.nextInt();
		}
		
	}

}







