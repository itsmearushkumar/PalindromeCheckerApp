import java.util.*;

// 1️⃣ Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// 2️⃣ Stack Strategy (LIFO)
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// 3️⃣ Deque Strategy (Front & Rear Comparison)
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// 4️⃣ Context Class (Strategy Injection)
class PalindromeContext {

    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.checkPalindrome(input);
    }
}

// 5️⃣ Main Class
public class Main {

    public static void main(String[] args) {

        String word = "racecar";

        // Choose Strategy at Runtime
        PalindromeContext context = new PalindromeContext(new StackStrategy());

        boolean result = context.execute(word);

        System.out.println("Using Stack Strategy:");
        System.out.println("Is Palindrome? " + result);

        // Switch to Deque Strategy dynamically
        context.setStrategy(new DequeStrategy());

        result = context.execute(word);

        System.out.println("\nUsing Deque Strategy:");
        System.out.println("Is Palindrome? " + result);
    }
}