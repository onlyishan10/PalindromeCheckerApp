import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for(char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Find middle index
        int slow = 0;
        int fast = 0;

        while(fast < list.size()-1 && fast+1 < list.size()-1) {
            slow++;
            fast += 2;
        }

        // Reverse second half
        LinkedList<Character> secondHalf = new LinkedList<>();

        for(int i = list.size()-1; i >= slow+1; i--) {
            secondHalf.add(list.get(i));
        }

        // Compare halves
        for(int i = 0; i < secondHalf.size(); i++) {

            if(list.get(i) != secondHalf.get(i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}
