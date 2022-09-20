import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import javax.swing.text.AttributeSet.ColorAttribute;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
         * The Map interface is a generic. The first is the type 
         * of the key; the second, the type of the value.
         */
        Map<String, Color> favoriteColors = new HashMap<>();

        favoriteColors.put("Mazz", Color.GREEN);
        favoriteColors.put("Wyatt", Color.GREEN);

        //two different keys can have the same value
        favoriteColors.put("Kurt", Color.BLUE);
        favoriteColors.put("Alanna", Color.BLUE);
        favoriteColors.put("Samika", Color.PINK);

        //same key cant have the two different values
        favoriteColors.put("Samika", Color.GREEN);

        //create a set of the keys in the map
        Set<String> keys = favoriteColors.keySet();
        for (String key: keys)
        {
            System.out.println(key + " (" + key.hashCode() + "):" + favoriteColors.get(key));
        }


    }
}
