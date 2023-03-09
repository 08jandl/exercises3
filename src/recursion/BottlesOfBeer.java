package recursion;

import java.util.Scanner;

public class BottlesOfBeer {
    public static void main(String[] args) {
        // Optional scanner input for the number at which the song should end
        Scanner scanner = new Scanner(System.in);
        System.out.println("At which number should the song 99 bottles of beer end? ");
        int endingNumber = scanner.nextInt();

        // calling the method with the starting number and the ending number
        printBottlesOfBeer(99, endingNumber);
    }

    // The method needs to take two parameters, the ending number that we get from the scanner - as it might be different every time we call the method
    // and the starting number, because it will have to change in the recursion so the recursion can end eventually
    public static void printBottlesOfBeer(int startingNumberOfBottles, int endingNumberOfBottles) {
        // checking if the base case has been reached
        if (startingNumberOfBottles != endingNumberOfBottles) {
            // the base case has not been reached
            // Optional: this sout is here to make it possible for the song to end in a full stop
            System.out.println();
            // printing first line of the song
            System.out.println(startingNumberOfBottles + " Bottles of Beer on the wall, " + startingNumberOfBottles + " Bottles of Beer");
            // decrementing our starting number
            startingNumberOfBottles--;
            // Second line of the song
            // Optional: not println but print, so we can have a full stop at the end
            System.out.print("Take one down, pass it around, " + startingNumberOfBottles + " Bottles of Beer on the wall");
            // recursion with the new decremented starting number
            printBottlesOfBeer(startingNumberOfBottles, endingNumberOfBottles);
        } else {
            // Optional: once we reach the base case, we can add a full stop
            System.out.println(".");
        }
    }
}
