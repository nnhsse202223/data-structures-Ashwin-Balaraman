import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
         //create a priority queue of todo items
         Queue<WorkOrder> g = new PriorityQueue<>();
         g.add(new WorkOrder(3, "vacuum"));
         g.add(new WorkOrder(2, "water plants"));
         g.add(new WorkOrder(2, "make dinner"));
         g.add(new WorkOrder(2,  "walk dog"));
         g.add(new WorkOrder(9, "play video games"));
         g.add(new WorkOrder(1, "take Chapter 15 quiz"));

         while (g.size() > 0)
         {
            System.out.println(g.remove()); 
         }
    }
}
