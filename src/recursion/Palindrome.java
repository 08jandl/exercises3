package recursion;

//Another option on how to solve it
public class Palindrome {
    public static void main(String[] args) {
//        Was it a car or a cat I saw
//        Murder for a jar of red rum
//        Go hang a salami, I'm a lasagna hog
//        Otto
//        1122332211
        boolean anna = isPalindrome("Go hang a salami, I'm a lasagna hog");
        System.out.println(anna);
        System.out.println(isPalindrome("Anna2"));
    }

    public static boolean isPalindrome(String potentialPalindrome) {
        // make all letters lower case
        potentialPalindrome = potentialPalindrome.toUpperCase();
        // replace special characters and spaces with nothing with the replace() method in String
        potentialPalindrome = potentialPalindrome.replace("'", "");
        potentialPalindrome = potentialPalindrome.replace(",", "");
        potentialPalindrome = potentialPalindrome.replace(" ", "");

        // You don't have to save these extra, but it might help with readability
        char firstLetter = potentialPalindrome.charAt(0);
        // use the length() -1 to get to the last letter - remember the array starts counting at 0!
        char lastLetter = potentialPalindrome.charAt(potentialPalindrome.length() - 1);

        // check if they are the same
        if (firstLetter == lastLetter) {
            //If they are the same you can use .substring(1, string.length-1), which only saves everything from the second to the penultimate letters in the String.
            // This way you only keep comparing the last letters until you are out of letters.
            potentialPalindrome = potentialPalindrome.substring(1, potentialPalindrome.length() - 1);
            //Once the palindrome is too short to compare further (<=1), you can return true: it is a palindrome!
            //If it is not short enough: use a recursive call to keep going until you are out of letters to compare.
            if (potentialPalindrome.length() <= 1) {
                return true;
            }
             // otherwise use a recursive call to go over it again
            return isPalindrome(potentialPalindrome);
        }
        // if it never returned true, return false
        return false;
    }
}