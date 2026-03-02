// Palindrome Checker Application
// UC1: Display Welcome Message and App Details at Startup

class PalindromeChecker {


    public static void main(String[] args) {

        // UC2: Check whether a hardcoded string is a palindrome

        class PalindromeCheckerUC2 {

            // Main method - Entry point of the program
            public static void main(String[] args) {

                // Hardcoded string (String Literal)
                String word = "madam";

                // Variable to store reversed string
                String reversed = "";

                // Reverse the string using loop
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed = reversed + word.charAt(i);
                }

                // Check if original string equals reversed string
                if (word.equals(reversed)) {
                    System.out.println("The string \"" + word + "\" is a Palindrome.");
                } else {
                    System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
                }

                // Program ends
                System.out.println("Program exited successfully.");
            }
        }
    }
}
