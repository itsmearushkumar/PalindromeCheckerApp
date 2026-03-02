class PalindromeChecker {

    public static void main(String[] args) {

        // Original String
        String original = "level";

        // Reversed String (initially empty)
        String reversed = "";

        // Loop to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}