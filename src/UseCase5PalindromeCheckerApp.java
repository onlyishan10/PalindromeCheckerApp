import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {

            stack.push(c);

        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Pop and compare
        for (char c : input.toCharArray()) {

            char popped = stack.pop();

            if (c != popped) {

                isPalindrome = false;
                break;

            }

        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);

    }
}

