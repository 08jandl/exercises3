package arrays;

public class Arrays {
    public static void main(String[] args) {
        //Write the method:
        //public static void printArray(int[] numbers) {...}
        //This method prints the contents of the array in a line. The values should be separated with a comma.
        printArray(new int[]{1, 3, 5, 8, 4});

        //Write a second method:
        //public static boolean containsNumber(int[] numbers, int n)
        //This method checks whether n is contained in the array. Print the result to the console.
        System.out.println(containsNumber(new int[] {12, 24, 35}, 12));

    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
    }

    public static boolean containsNumber(int[] numbers, int n) {
        // first we create a variable in which we store our return value
        // we initialize it as false, because it is only true if there's a match
        boolean isContained = false;
        // here it makes sense to use the for-each loop
        // because we are looking at each item, one after the other
        for (int number : numbers) {
            // if a number matches, we store true in our return variable
            if (number == n) {
                isContained = true;
            } else {
                // if it doesn't match we do NOT store false
                // if we did store false we would overwrite any true we found before with a false
                // so unless the last number the loop gets to is a match,
                // saving false in our isContained variable would give us a false result!
                // Therefore, in this case we simply print a line in our else
                System.out.println("The array does not contain " + n);
            }
        }
        //and lastly we return the return value
        return isContained;
    }

    // Option 2 to write the contains logic
    public static boolean containsNumber2(int[] numbers, int n) {
        // same as above, we determine our return value
        // and initialize it as false
        boolean numberFound = false;
        for (int item : numbers) {
            if (item == n) {
                numberFound = true;
                // here we could use a break
                // this prevents us from overwriting our numberFound variable with false
                // instead, we break the whole method - i.e. we are done with this method
                // as soon as we find any variable that matches
                // so we also don't really need an else in this case
                // as we return our numberFound variable in the end if it is never set to true
                break;
            }
        }
        return numberFound;
    }
}
