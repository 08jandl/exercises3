package loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        //Create a new class “MultiplicationTable”.
        //Write a program that creates a multiplication table that covers numbers from 10-20.

        //We need two for loops for this exercise
        //We can imagine one for loop covering the rows or the table
        //and the other covering the columns
        for (int i = 10; i <= 20; i++) {
            // because our table goes from 10 to 20 in the rows as well as the columns,
            // our for-loops also cover the same range
            for (int j = 10; j <= 20; j++) {
                // in order for the table to look nice, we add a space before printing each result
                // of yourse you can store the calculation (i * j) in a variable before printing it
                // in this second loop we have access to both indexes i and j
                // that helps us to calculate the entire table in both directions
                System.out.print(" " + i * j);
            }
            // after each row we need a line break
            // otherwise the table doesn't print in nice looking rows
            System.out.println();
        }
    }
}
