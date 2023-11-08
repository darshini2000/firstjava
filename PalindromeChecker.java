public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "racecar"; // Replace with the string you want to check

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Remove non-alphanumeric characters and convert to lowercase
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // It's not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }
}
