/*
Satbir Dhaliwal
Jul 5, 2017
App: Edges
Purpose: An edge is linked to two vertex. 
*/
public class Edges
{
   private int source;
   private int destination;
   private int weight;

   public Edges(int source, int destination, int weight)
   {
      this.source = source;
      this.destination = destination;
      this.weight = weight;
   }

   public int getNeighbourIndex(int nodeIndex)
   {
      if(source == nodeIndex)
      {
         return destination;
      }
      else
      {
         return source;
      }
   }

}
