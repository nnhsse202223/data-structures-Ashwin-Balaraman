import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
        // Complete this method. Use a Stack.
        Stack<String> sentences = new Stack<>();
        Scanner in = new Scanner(sentence);
        String delimeterString = "[\s]";
        in.useDelimiter(delimeterString);
        int i = 0;
        while (i == 1)
        {
            if (in.next().contains("."))
            {
                i = 1;
            }
            else 
            {
                sentences.push(in.next)
            }
        }
        System.out.println(sentences);
        int index = 0;
        
        String rever = "";
        while (sentences.size() > 0)
        {
            rever += " " + sentences.pop();
        }
        return rever;





    }
}
