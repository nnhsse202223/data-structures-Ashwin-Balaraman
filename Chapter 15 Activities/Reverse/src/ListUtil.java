import java.util.LinkedList;
import java.util.ListIterator;  



/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iter = strings.listIterator(); 
        LinkedList<String> string = new LinkedList<String>(strings);
        String temp;
        for (int i = 0; i < strings.size(); i++)
        {
            temp = string.removeLast();
            iter.next();
            iter.set(temp); 
            
        }

    }
}