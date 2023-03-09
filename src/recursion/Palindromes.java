package recursion;

public class Palindromes {
    public static void main(String[] args) {
        // Was it a car or a cat I saw
        // Murder for a jar of red rum
        // Go hang a salami, I'm a lasagna hog
        // Otto
        // 1122332211
        String palindromeCandidate = "Anna";


        // Prepare the Strings - in case there are capital letters, you might want to convert them all to lowercase or upper case.
        // here I chose lowercase, but upper case is just as good
        String checkPalindrome = palindromeCandidate.toLowerCase();
        // If you are checking sentences, you will need to get rid of spaces.
        // Remember that Strings are basically an array of chars
        String checkPalindromeWithoutSpaces = "";
        for (int i = 0; i < checkPalindrome.length(); i++) {
            // You don't have to save the current char you are checking in the loop in a variable, but it might help with readability
            char charToCheck = checkPalindrome.charAt(i);
            // Here we make sure no special characters are considered
            if (charToCheck != ' ' && charToCheck != ','  && charToCheck != '\'' && charToCheck != '.' && charToCheck != '?' && charToCheck != '!') {
                // and we add each char that is a letter to a new String
                checkPalindromeWithoutSpaces += charToCheck;
            }
        }

        // calling our method and printing the result right away
        System.out.println(palindromeCandidate + " is a palindrome: " + checkIfPalindrome(checkPalindromeWithoutSpaces));


    }

    public static boolean checkIfPalindrome(String checkPalindromeArray) {
        //Save the first and the last letters of your potential palindrome in a char variable. Then you compare: are the first and the last letter the same?
            if (checkPalindromeArray.charAt(0) == checkPalindromeArray.charAt(checkPalindromeArray.length() - 1)) {
                //If they are the same you can use .substring(1, string.length-1), which only saves everything from the second to the penultimate letters in the String.
                // This way you only keep comparing the last letters until you are out of letters.
                checkPalindromeArray = checkPalindromeArray.substring(1, checkPalindromeArray.length() - 1);
                //Once the palindrome is too short to compare further (<=1), you can return true: it is a palindrome!
                //If it is not short enough: use a recursive call to keep going until you are out of letters to compare.
                if (checkPalindromeArray.length() <= 1) {
                    return true;
                } else {
                    // only if the String is long enough we use recursion
                    return checkIfPalindrome(checkPalindromeArray);
                }
            }
        //If the first and last letters don‘t match: return false; it is not a palindrome.
        return false;
    }
}

