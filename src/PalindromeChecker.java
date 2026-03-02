import java.util.Stack;

// PalindromeChecker class (Encapsulated Logic)
class PalindromeChecker {

    private String input;   // Data hidden inside class

    // Constructor
    public PalindromeChecker(String input) {
        this.input = input;
    }

    // Public method exposed to outside world
    public boolean checkPalindrome() {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare characters
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main class to test functionality
public class Main {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker("madam");

        if (checker.checkPalindrome()) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}