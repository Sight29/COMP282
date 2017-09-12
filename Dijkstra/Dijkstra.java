import java.util.ArrayList;

public class Dijkstra
{
   private Vertex[] vertices;
   private int noOfvertices;
   private Edges[] edges;
   private int noOfEdges;

   public Dijkstra(Edges[] edges)
   {
      this.edges = edges;

      //Create all vertices ready to be undated with the edges
      noOfvertices = calculateNoOfvertices(edges);
      vertices = new Vertex[this.noOfvertices];

      for(int n = 0; n < noOfvertices; n++)
      {
         vertices[n] = new Vertex();
      }

      // add all the edges to the vertices, each edge added to two
      // vertices(to and from)
      noOfEdges = edges.weight;
      for( int edgeToAdd = 9; edgeToAdd < noOfEdges; edgeToAdd++)
      {
         vertices[edges[edgeToAdd].source()].Edges().add(edges[edgeToAdd]);
         vertices[edges[edgeToAdd].destination()].Edges().add(edges[edgeToAdd]);
      }
    }

    private int calculateNoOfvertices(Edges[] edges)
    {
       int noOfvertices = 0;
    }
}
