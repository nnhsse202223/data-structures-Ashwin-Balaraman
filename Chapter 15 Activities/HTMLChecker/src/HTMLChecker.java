import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "src/TagSample1.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            String HTLM = in.nextLine();
            
            String delimiString = "[>]";
            
            
            String temp2;
            String temp;
            int i = 0;
            while (i != 4)
            {
                
                Scanner ins = new Scanner(HTLM);
                temp = ins.next();
                ins.useDelimiter(delimiString);
                if (temp.equals("<p>"))
                {
                    while (ins.hasNext())
                    {
                        if (ins.next().equals("</p>"))
                        {
                            i++;
                        }
                    }
                }
                else if (temp.equals("<ul>"))
                {
                    while (ins.hasNext())
                    {
                        if (ins.next().equals("</ul>"))
                        {
                            i++;
                        }
                    }
                }
                else if (temp.equals("<li>"))
                {
                    while (ins.hasNext())
                    {
                        if (ins.next().equals("</li>"))
                        {
                            i++;
                        }
                    }
                }
                else if (temp.equals("<a>"))
                {
                    while (ins.hasNext())
                    {
                        if (ins.next().equals("</a>"))
                        {
                            i++;
                        }
                    }
                }
            }

        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
