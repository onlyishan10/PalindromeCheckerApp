public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "radar";

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call service method
        boolean isPalindrome = service.checkPalindrome(input);

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
