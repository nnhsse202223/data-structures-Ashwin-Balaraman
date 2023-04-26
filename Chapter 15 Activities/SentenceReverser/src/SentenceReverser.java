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
        String reversedString = "";
        Scanner in = new Scanner(sentence);
        String delimeterString = "[\s]";
        in.useDelimiter(delimeterString);
        String rever = "";
        while (in.hasNext())
        {
            int i = 0;
        while (i != 1 && in.hasNext())
        {
            String word = in.next();
            if (word.contains("."))
            {
                sentences.push(word.substring(0, word.length()-1));
                i = 1;
            }
            else 
            {
                sentences.push((word));
            }
        }
        System.out.println(sentences);
        int size = sentences.size();
        while (sentences.size() > 0)
        {
            if (sentences.size() == size)
            {
                String tempString = sentences.pop();

                String temp2 = tempString.substring(0, 1);
                tempString =  tempString.substring(1, tempString.length());
                temp2 = temp2.toUpperCase();
                tempString = temp2 + tempString;
                rever += " " + tempString;
            }
            else if(sentences.size() == 1)
            {
                rever += " " + sentences.pop().toLowerCase() + ".";
            }
            else 
            {
                rever += " " + sentences.pop();
            }
            
        }
        }
        
        return rever;





    }
}
