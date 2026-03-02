class PalindromeChecker {

    public static void main(String[] args) {

        String original = "A man a plan a canal Panama";

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = original.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome (ignoring spaces & case).");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }

    // Two-pointer palindrome logic
    public static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}