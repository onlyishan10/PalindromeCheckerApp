public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Create strategy (Stack)
        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time
        long startTime = System.nanoTime();

        // Execute algorithm
        boolean result = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        // Print output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

    }
}


/**
 * Strategy Interface
 */
interface PalindromeStrategy {

    boolean check(String input);
}


/**
 * Stack Strategy Implementation
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack =
                new java.util.Stack<>();

        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        for(char c : input.toCharArray()) {

            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}