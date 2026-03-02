import java.util.*;

public class PalindromePerformanceTest {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase();

        // Increase size for better time comparison
        input = input.repeat(1000);

        // 1️⃣ Reverse String Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // 2️⃣ Two Pointer Method
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // 3️⃣ Stack Method
        long start3 = System.nanoTime();
        boolean result3 = stackMethod(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // Display Results
        System.out.println("Palindrome Results:");
        System.out.println("Reverse Method: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Two Pointer Method: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Stack Method: " + result3 + " | Time: " + time3 + " ns");
    }

    // Method 1: Reverse String
    public static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Two Pointer
    public static boolean twoPointerMethod(String str) {
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

    // Method 3: Stack
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}