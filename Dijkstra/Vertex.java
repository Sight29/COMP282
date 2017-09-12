/*
Satbir Dhaliwal
Jul 5, 2017
App: Vertex
Purpose: A vertex must have a list of edges that are linked to edges.
*/
import java.util.ArrayList;
public class Vertex
{

   private int distanceFromSource = Integer.MAX_VALUE;
   private boolean visited; //node has been visited or no.
   private ArrayList<Edges> edges = new ArrayList<Edges>(); // now we must create edges.

   public Vertex(boolean visited, ArrayList<Edges> edges)
   {
      this.visited = visited;
      this.edges = edges;
   }

   public boolean isVisited()
   {
      return visited;
   }
}
