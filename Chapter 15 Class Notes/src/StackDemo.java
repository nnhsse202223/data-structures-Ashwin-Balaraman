import java.util.Stack;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;
import java.util.logging.FileHandler;

/**
 * This program simulates an undo stack. Note that operations
 * must be undone in the opposite order in which they are first
 * issued.
*/
public class StackDemo
{
    public static void main(String[] args)
    {
        //stack a stack of comands
        Stack<String> commands = new Stack<>();
        
        //craete a ton of pushs
        commands.push("Insert 'Hello'");
        commands.push("Insert: ','");
        commands.push("Insert: ' '");
        commands.push("Insert: '?'");
        commands.push("Delete: '?'");
        commands.push("Insert: '!'");

        System.out.println(commands);
        for (int i = 0; i < 4; i++)
        {
            String command  = commands.pop();
            System.out.println("Undo: " + command);
        }
    }
}
