import java.util.*;

 class MaxHeap
{
    private int[] Heap;
    private int size;
    private int maxsize;
    
 
    private static final int FRONT = 1;
 
    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
        
    }
 
    private int parent(int pos)
    
    {
    	return (pos/2);
    }
 
    private int leftChild(int pos)
    {
        return (2 * pos);
    }
 
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
 
    private boolean isLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        {
            return true;
        }
        return false;
    }
 
    private void swap(int fpos,int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    } 
    public void insertmaxh(int element)
    {
        Heap[++size] = element;
        int current = size;
 
        while(Heap[current] > Heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }	
    }
    public void insertminh(int element)
    {
        Heap[++size] = element;
        int current = size;
 
        while(Heap[current] < Heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }	
    }
 
    public void print()
    {
        for (int i = 1; i <= size / 2; i++ )
        {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i]
                  + " RIGHT CHILD :" + Heap[2 * i  + 1]);
            System.out.println();
        }
    }
}
public class maxheaprun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap m=new MaxHeap(20);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of elements ");
		int n=sc.nextInt();
		int op;
		int a[]=new int[n];
		
		
			
			 
			 	for(int i=0;i<n;i++)
			 		{
			 			System.out.println("enter element");
			 			a[i]=sc.nextInt();
			
			 		}
			
			 
			 
				 	for(int i=0;i<n;i++)
				 		{
				 			m.insertmaxh(a[i]);
				 		}
				 	System.out.println( " array rep. of given max heap");
				 	m.print();
			
				 	
			
		

	}

}
