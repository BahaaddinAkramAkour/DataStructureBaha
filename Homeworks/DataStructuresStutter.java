
package datastructuresstutter;
import java.util.*;
public class DataStructuresStutter {
    public static void stutter (Queue<Integer> q){
       Queue<Integer> temp=new LinkedList<Integer>();
       while(!q.isEmpty())
       {int v= q.remove();
           temp.add(v);
       temp.add(v);}
       while(!temp.isEmpty())
       {
         q.add(temp.remove());
          
       }
    }



    public static void main(String[] args) {
   Queue<Integer> q= new LinkedList<Integer>();
   q.add(1);
   q.add(2);
   q.add(3);
   
   stutter(q);
   System.out.println(q);
    }
    
}
