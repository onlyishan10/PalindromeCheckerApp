public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String text = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // Check palindrome
        System.out.println("================================");
        System.out.println("Hardcoded String: " + text);

        if (text.equals(reversed)) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }

        System.out.println("================================");
        System.out.println("Program Ended.");
    }
}

