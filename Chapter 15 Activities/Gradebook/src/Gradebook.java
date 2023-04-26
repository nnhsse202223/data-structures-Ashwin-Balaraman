import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;   
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> gradeMap = new HashMap<>();
        

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                gradeMap.put(in.next(), in.next());

            } else if (input.equals("R"))
            {
                gradeMap.remove(in.next());
            } else if (input.equals("M"))
            {
                gradeMap.entrySet(in.next(), in.next());
            } else if (input.equalsIgnoreCase("P"))
            {
                Set<String> names = gradeMap.keySet();
                for (int i = 0; i < names.size() - 1; i++)
                {
                    if (names.get(i).compareTo(names.get(i+1)) > 0)
                    {
                        
                    }
                }
            } else
            {
                done = true;
            }
        }
    }
}
