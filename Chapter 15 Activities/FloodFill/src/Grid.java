import java.util.Scanner;
import java.util.Stack;
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    private Stack<Pair> stack;
    private int counter;

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Give Row: ");
        row = in.nextInt();
        System.out.println("Give Col: ");
        column = in.nextInt();
        Pair pair = new Pair(row, column);
        stack.add(pair);
        
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
