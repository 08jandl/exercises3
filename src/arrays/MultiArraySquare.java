package arrays;

public class MultiArraySquare {
    public static void main(String[] args) {

        // Create a two-dimensional array containing three arrays with three fields each.
        int[][] twoDArray = new int[3][3];
        // Initialize the multidimensional array with the int 1 at each position.
        twoDArray[0] = new int[]{1, 1, 1};
        twoDArray[1] = new int[]{1, 1, 1};
        twoDArray[2] = new int[]{1, 1, 1};

        printArrayOfArrays(twoDArray);

        // Change the value in the middle to 9.
        twoDArray[1][1] = 9;

        printArrayOfArrays(twoDArray);

        // Change the corner values to 3
        twoDArray[0][0] = 3;
        twoDArray[2][2] = 3;
        twoDArray[0][2] = 3;
        twoDArray[2][0] = 3;

        printArrayOfArrays(twoDArray);

    }

    // Print all the values to the console in the form of a square.
    // Method is not necessary, but since we are printing the same array three times after changing the values
    // it is a good way to reuse code
    public static void printArrayOfArrays(int[][] array) {
        // For two-dimensional arrays, we need 2 for loop to iterate over the contents
        for (int[] row : array) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            // We want a line break at the end of each row
            System.out.println();
        }
        // This is just for legibility in the console
        System.out.println("----------------");
    }
}
