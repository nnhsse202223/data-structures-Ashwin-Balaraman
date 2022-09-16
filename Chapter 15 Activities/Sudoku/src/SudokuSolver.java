import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SudokuSolver {
    private final int M = 3;
    private final int N = M * M;
    private int[][] grid;
    private ArrayList<Set<Integer>> rows;
    private ArrayList<Set<Integer>> cols;
    private ArrayList<Set<Integer>> squares;
    private Set<Integer> nums;
    private boolean add;

    public SudokuSolver(String fileName) {
        // read the puzzle file
        try (Scanner in = new Scanner(new File(fileName))) {

            this.grid = new int[N][N];

            for (int row = 0; row < N; row++) {
                String line = in.next();

                for (int col = 0; col < N; col++) {
                    String strVal = line.substring(col, col + 1);
                    int number;
                    if (strVal.equals("x")) {
                        number = 0;
                    } else {
                        number = Integer.parseInt(strVal);
                    }
                    this.grid[row][col] = number;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open: " + fileName);
        }

        // create the list of sets for each row (this.rows)
        // ...
        this.rows = new ArrayList<Set<Integer>>();
        for (int i = 0; i < this.grid.length; i++)
        {
           HashSet<Integer> set = new HashSet<Integer>();
           for (int j = 0; j < grid[i].length; j++)
           {
            set.add(grid[i][j]);
           }
           this.rows.add(set);
        }
        // create the list of sets for each col (this.cols)
        // ...
        this.cols = new ArrayList<Set<Integer>>();
        for (int i = 0; i < this.grid.length; i++)
        {
           HashSet<Integer> set = new HashSet<Integer>();
           for (int j = 0; j < this.grid[i].length; j++)
           {
                set.add(grid[j][i]);
           }
           this.cols.add(set);
        }
        // create the list of sets for each square (this.squares)
        /* the squares are added to the list row-by-row:
            0 1 2
            3 4 5
            6 7 8
         */
        // ...
        this.squares = new ArrayList<Set<Integer>>();
        int o = 0;
        int j = 0;
        for (int i = 0; i < grid.length; i+=3)
        {
            
           
<<<<<<< HEAD
            
=======
            boolean tru = true;
>>>>>>> 881cd895a3caa25dfd68c28a82bd12ac44ff8c7b
            for (j = 0; j < grid[i].length; j+= 3)
            {
                HashSet<Integer> set = new HashSet<Integer>();
                for (o=i; o < i +3; o++)
                {
                    for (int k = j; k < j + 3; k++)
                    {
                        set.add(this.grid[o][k]);
                    }
                }
                this.squares.add(set);
                
            }
            
              
        }
        // create a hash set for [1..9] (this.nums)
        // ...
        this.nums = new HashSet<Integer>();
        for (int i = 1; i < 10; i++)
        {
            this.nums.add(i);
        }
        // visually inspect that all the sets are correct
        for (int row = 0; row < N; row++) {
            System.out.println("row " + row + ": " + this.rows.get(row));
        }
        for (int col = 0; col < N; col++) {
            System.out.println("col " + col + ": " + this.cols.get(col));
        }
        for (int square = 0; square < N; square++) {
            System.out.println("square " + square + ": " + this.squares.get(square));
        }
        System.out.println(this.nums);
    }

    public boolean solve() {
        // find an empty location, if any
        boolean finished = true;
        int nextRow = -1;
        int nextCol = -1;
        for (int row = 0; row < N && finished; row++) {
            for (int col = 0; col < N && finished; col++) {
                if (this.grid[row][col] == 0) {
                    finished = false;
                    nextRow = row;
                    nextCol = col;
                }
            }
        }

        // the board is complete; we solved it
        if (finished) {
            return true;
        }

        // get all possible numbers for the row and column we are trying to populate
        /*
            Create a new set based on the this.nums and remove all elements in the sets
            corresponding to nextRow, nextCol, and the corresponding square (use the
            removeAll method).

            Properly indexing the squares list of sets is tricky. Verify that your
            algorithm is correct.
         */
        Set<Integer> possibleNums = new HashSet<Integer>();
        for (Integer i : this.nums)
        {
            possibleNums.add(i);
        }
        possibleNums.removeAll(this.cols.get(nextCol));
        possibleNums.removeAll(this.rows.get(nextRow));
        int squareIndex = findSquareCol(nextCol, nextRow);
        possibleNums.removeAll(this.squares.get(squareIndex));
        

        // if there are no possible numbers, we cannot solve the board in its current state
        if (possibleNums.isEmpty()) {
            return false;
        }

        // try each possible number
        for (Integer possibleNum : possibleNums) {
            // update the grid and all three corresponding sets with possibleNum
            

            // recursively solve the board
            if (this.solve()) {
                // the board is solved!
                return true;
            } else {
                /*
                 Undo the move before trying another possible number by setting the corresponding
                 element in the grid back to 0 and removing possibleNum from all three corresponding
                 sets.
                 */
                // ...
            }
        }

        return false;
    }

    public String toString() {
        String str = "";

        for (int[] row : grid) {
            for (int val : row) {
                str += val + "\t";
            }

            str += "\n";
        }

        return str;
    }
    public int findSquareCol(int col, int row)
    {
       row = row/3;
       col = col/3;
       return (col + (3* row));
    }

    public static void main(String[] args) {
        String fileName = "src/puzzle1.txt";

        SudokuSolver solver = new SudokuSolver(fileName);
        System.out.println(solver);
        if (solver.solve()) {
            System.out.println("Solved!");
            System.out.println(solver);
        } else {
            System.out.println("Unsolveable...");
        }
    }
}
