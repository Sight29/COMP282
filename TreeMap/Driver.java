/*
Satbir dhaliwal
June 30, 2017
App: Driver
Purpose: test all the methods of Red Black tree.
*/
public class Driver
{
   public static void main(String[] args)
   {
      TreeMap<Integer, Integer> rbt = new TreeMap<Integer, Integer>();

      //Check to see if the tree is empty.
      System.out.println("Tree is empty. " + rbt.isEmpty());

      // Check the size of the tree.
      System.out.println("Size of the tree: " + rbt.size());

      rbt.put(23, 45);
      rbt.put(12, 23);
      rbt.put(27, 56);
      rbt.put(15, 32);
      rbt.put(45, 67);

      //Check to see if the tree is empty.
      System.out.println("Tree is empty. " + rbt.isEmpty());

      // Check the size of the tree.
      System.out.println("Size of the tree: " + rbt.size());

      System.out.println("Tree contains 23. " + rbt.search(23));
      //System.out.println("Tree contains 11. " + rbt.search(11));

      System.out.println(rbt.get(12));

      System.out.println("Does map contains value 56: " + rbt.contains(56));
      //rbt.clear();

      System.out.println("Tree is empty. " + rbt.isEmpty());


   }
}
