import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.Utilities;

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
           Iterator<String> iterator = staff.listIterator();//|DRHT
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

        /*
         * add method inserts an element at the iterator position.
         * The iterator is then positioned after thge leemnet that was added.
         *    (the text is a bit confusing on this point..)
         */
        iterator.add("Juliet");
        iterator.add("Nina");

        /*
         * The remove method removes the element returned by the
         *  last call to next or previpos/
         * The remopve method can only be called once after calling next
         *  or previous.
         * The remove mehtod cannot be called after calling add.
         */

         iterator.next();  //DHJNR|T
         iterator.remove(); //DHJN|T
         System.out.println(staff);
    
         System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
         /*
          * The set method updates the leement returned by the 
          last call to next or previous.
          */
          iterator.previous();//DHJ|NT
          iterator.set("Albert");

          /*
           * The hasNext method isoften used in the contextr of a while loop.
           */
          iterator = staff.listIterator();  //|DHJAT
          while(iterator.hasNext())
          {
            String n = iterator.next();
            if (n.equals("Juliet"))
            {
                iterator.remove(); // DHJ|AT -> DH|AT
            }
                
            }
            // DHAT|
            for (String n : staff)
            {
                System.out.print(n+" ");

            }
            System.out.println();
            System.out.println("Expected: Diana Romeo Albert Tom");

            /*
             * Concurrent modificationException
             * 
             * Cannot modify a linked list while also using an iterator
             *  unless you use that iterator to do so
             */
            iterator = staff.listIterator();
            while(iterator.hasNext())
            {
                String n = iterator.next();
                if (n.equals("Romeo"))
                {
                    //staff.remove("Diana");
                }
            }
            /*
             * ConcurrentModificationException
             * 
             * That enhanced for lo9op automatically creates an 
             * iterator!
             * That's how it works
             */
            for (String n : staff)
            {
                if (n.equals("Harry"))
                { 
                    staff.add("Charlie");
                }
                
            }
          }
    }


