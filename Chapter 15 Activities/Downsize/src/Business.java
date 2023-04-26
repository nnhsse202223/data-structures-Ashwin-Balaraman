import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Business utility methods.
*/
public class Business
{
    /**
      * Removes every nth element from the linked list
      *
      * @param employeeNames the linked list to remove from
      * @param n                 the parameter to determine "nth"
     */
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        ListIterator<String> staff = employeeNames.listIterator();
        int i = 0;
        while(staff.hasNext())
        {
            i++;
            staff.next();
            if (i % n == 0)
            {
                staff.remove();
            }
        }
    }
}
