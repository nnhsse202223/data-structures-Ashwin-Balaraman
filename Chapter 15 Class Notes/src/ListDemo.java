import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /*
         * The addLast method can be used to populate a list.
         */
         LinkedList<String> staff = new LinkedList<>();
         staff.addLast("Diana");
         staff.addLast("Romeo");
         staff.addLast("Harry");
         staff.addLast("Tom");

         //this list is current;y: DHRT

         /*
          * The listIterator method creates a new list iterator
          that is positioned at the fron tof the list.
          The "|" in the comment represents the iterator position.
          */
          ListIterator<String> iterator = staff.listIterator();//|DRHT
          /*
           * The next methjod advances the iterator over the nest element 
           * in the list
           */
        iterator.next();
        /*
         * The next method also returns the element that the iterator is 
         * passing.
         */
        String name = iterator.next(); // |DH|RT
        System.out.println(name);
        System.out.println("Expected: Romeo");
    }
}
