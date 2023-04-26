import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //create a print queue of strings( using a linked list)
        Queue<String> jobs = new LinkedList<>();

        // add several print jobs
        jobs.add("Joe: Expense Report #1");
        jobs.add("Cathy: Meeting Memo");

        System.out.println("Printing: " + jobs.remove());
        jobs.add("Cathy: Purchase Order#1");
        jobs.add("Joe: Expense Report #2");
        jobs.add("Joe: Weekly Report");

        System.out.println("Printing: " + jobs.remove());

        //print the rest of th ejobs in queue
        while(jobs.size() > 0)
        {
            System.out.println("Printing: " + jobs.remove());
        }
    }
}
