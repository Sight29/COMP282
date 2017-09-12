/*
Satbir dhaliwal
June 28, 2017
App: TreeMap
purpose: implements Red Black Tree iterably.
*/
import java.util.concurrent.atomic.AtomicBoolean;
public class TreeMap<K extends Comparable<K>,V>
{
   private Node<K,V> root;
   private int size;    // tracked to O(1)... helpful if AtomicBoolean
                        // for pass by reference [c++]
   // Default constructor
   public TreeMap()
   {
      root = null;
      size = 0;
   }

   /*
   * Return the size of the map.
   */
   public int size()
   {
     return size;
   }


   /*
   * Removes all of the mappings from this map. This map
   * will be empty after this call returns.
   */
   public void clear()
   {
      root = null;
      size = 0;
   }

   /*
   * @Returns: True if tree contians no key-value node.
   */
   public boolean isEmpty()
   {
      return root == null;
   }

   /*
   * Return true if map contains specified key.
   */
   public boolean search(K lookfor)
   {
      if(root == null)
      {
         return false;
      }
      return root.containsKey(lookfor);
   }

   /*
   * Returns true if the map contains at least one mapping to
   * to the given value.
   */
   public boolean contains(V valueArg)
   {
      boolean found = false;
      if(root != null)
      {
         found = root.containsValue(valueArg);
      }
    return found;
   }

   /*
   * Print the value to which the specified key is mapped, or null
   * if this map contains no mapping for the key.
   */
   public V get(K keyArg)
   {
      V value = null;
      if(root == null)
      {
         return value;
      }
      return value = root.get(keyArg);
   }

   /*
   * Insert the specified value with the specified key in this map.
   */
   public V put(K keyArg, V valueArg)
   {
      if(root == null)
      {
         root = new Node<>(keyArg, valueArg);
         size++;
         return null;
      }
      else
      {
         AtomicBoolean replaced = new AtomicBoolean(false);
         V result;
         result = root.put(keyArg, valueArg,replaced);
         if(!replaced.get())
         {
            size++;
         }
         return result;
      }
   }

   /*public V delete(K keyArg)
   {
      V result = null;
      if( root != null)
      {
         result = root.remove(keyArg);
         if(result != null)
         {
            size--;
         }
      }
      return result;
   }*/
}
