/* This program is based on Adjacency list and Recursion */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
 
public class BreadthFirstSearch {
	
  private Queue<Integer> q;
  public boolean[] visited = new boolean[9]; //Assuming there are only 9 vertices in the graph
   static int ct=0;// use n*(n-1) method to check connectivity
  
  public BreadthFirstSearch() //constructor
  {
            q = new LinkedList(); // java built in queue can be implemented using either PriorityQueue or LinkedList
  } 

 public void bfs(ArrayList<ArrayList<Integer>> adjLists, int v)
 {
   visited[v]=true;
   q.add(v);
   System.out.print(v + " ");
   while(!q.isEmpty())
   {  
      for(int w:adjLists.get(v)) 
      {
                       if(!visited[w])
                       {		
                              visited[w] = true;
                              System.out.print(w + " ");
                              q.add(w);
                       }
      }  
    q.remove(v);
    if(!q.isEmpty())
       v = q.peek();
   
   
   
   
   }
  // System.out.println("cross edge"+ct);
}

    public static void main(String[] args) {
         

        ArrayList<ArrayList<Integer>> adjLists = new ArrayList<ArrayList<Integer>>();
        final int n = 9;
         

        for(int v=0; v<n; v++){
            adjLists.add(new ArrayList<Integer>());
        }
         
       BreadthFirstSearch bfsearch = new BreadthFirstSearch();


       adjLists.get(0).add(1);
        adjLists.get(0).add(8);
      
         

        adjLists.get(1).add(0);

         

        adjLists.get(8).add(0);
        adjLists.get(8).add(2);
        adjLists.get(8).add(6);


        adjLists.get(2).add(3);
        adjLists.get(2).add(4);
        adjLists.get(2).add(5);
        adjLists.get(2).add(8);
 

        adjLists.get(3).add(2);

        adjLists.get(4).add(2);
        adjLists.get(4).add(7);


        adjLists.get(5).add(2);
        adjLists.get(5).add(6);

        adjLists.get(6).add(5);
        adjLists.get(6).add(7);
        adjLists.get(6).add(8);

        adjLists.get(7).add(4);
        adjLists.get(7).add(6);
        
       
         

        bfsearch.bfs(adjLists, 0);
 
        
      
        
    }
}
 
