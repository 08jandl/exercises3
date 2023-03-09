package arrays;

public class DrawHouse {
    public static void main(String[] args) {

        //Initialize array
        int[][] house = new int[][]{
                // fill with values
                {0, 0, 0, 8, 0, 0, 0},
                {0, 0, 8, 0, 8, 0, 0},
                {0, 8, 8, 8, 8, 8, 0},
                {8, 8, 8, 8, 8, 8, 8},
                {8, 0, 8, 8, 8, 0, 8},
                {8, 8, 8, 0, 8, 8, 8},
                {8, 8, 8, 0, 8, 8, 8}
        };

        // print array
        for (int[] row : house) {
            for (int i : row) {
                if (i == 0) {
                    // replace the 0 with a space
                    //don't forget to NOT use println
                    System.out.print(" ");
                } else {
                    //print the rest as is (if you used 1, you can replace it here)
                    //don't forget to NOT use println
                    System.out.print(i);
                }
            }
            // print in rows by adding the line break after each row
            System.out.println();
        }
    }
}