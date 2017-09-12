/*
Satbir Dhaliwal
June 29, 2017
App: Node
Purpose: this class contains member variables
*/
import java.util.concurrent.atomic.AtomicBoolean;
public class Node<K extends Comparable<K>,V>
{
   private K key;
   private V value;
   private Node<K,V> left;
   private Node<K,V> right;
   private boolean red;

   public Node(K keyArg, V valueArg)
   {
      key = keyArg;
      this.value = valueArg;
      left = null;
      right = null;
      red = true;
   }

   /*
   * Returns true if this map contains a mapping for the specific key.
   *
   * @Param:  key whose precense in this map to be tested.
   * @Return: True if this key is mapping exist in map.
   */
   public boolean containsKey(K keyArg)
   {
      Node<K,V> temp = this;
      while(temp != null)
      {
         if(keyArg.compareTo(temp.key) == 0)
         {
            return true;
         }
         else if(keyArg.compareTo(temp.key) < 0)
         {
            temp = temp.left;
         }
         temp = temp.right;
      }
      return false;
   }


   public boolean containsValue(V valueArg)
   {
      if(this.value == valueArg)
      {
         return true;
      }
      else if(this.value != valueArg)
      {
         if(left == null && right != null)
         {
            if(right.containsValue(valueArg))
            {
               return true;
            }
         }
         else if(right == null && left != null)
         {
            if(left.containsValue(valueArg))
            {
               return true;
            }
         }
         else if(right == null && left == null)
         {
            return false;
         }
      }
      return false;
   }

   public V get(K keyArg)
   {
      V value = null;
      Node<K,V> temp = this;
      while(temp != null)
      {
         if(keyArg.compareTo(temp.key) == 0)
         {
            value = temp.value;
            break;
         }
         else if(keyArg.compareTo(temp.key) < 0)
         {
            temp = temp.left;
         }
         else
         {
            temp = temp.right;
         }
      }
      return value;

   }

   public V put(K keyArg, V valueArg, AtomicBoolean replaced)
   {
      Node<K,V> parent = null;
      Node<K,V> temp = this;

      if(parent == null)
      {
         temp.red = false;
      }

      replaced.set(false);

      V result = null;
      int diff = -1;
      while(diff != 0 && temp != null)
      {
         diff = keyArg.compareTo(temp.key);
         if(diff == 0)   // replacement
         {
            replaced.set(true);
            result = temp.value;
            temp.value = valueArg;
         }
         else if(diff < 0)  // left child
         {
            if(temp.left == null)
            {
               temp.left = new Node<>(keyArg, valueArg);
               // Did we just create a Linear 4-node fix it.
               result = null;
            }
            else
            {
               parent = temp;
               temp = temp.left;
            }
         }
         else  // right child
         {
            if(temp.right == null)
            {
            temp.right = new Node<>(keyArg, valueArg);
            result = null;
            }
            else
            {
               parent = temp;
               temp = temp.right;
            }
         }
      }
      return result;
   }

   public V delete(K keyArg)
   {
      Node<K,V> temp = this;
      Node<K,V> parent = null;
      
   }
}
