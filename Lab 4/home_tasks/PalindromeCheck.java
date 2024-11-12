public class PalindromeCheck {
    public static void main(String[] args) {
        String[] strings = {"racecar", "level", "hello", "madam"};

        for (String str : strings) {
            boolean isPalindrome = true;
            int left = 0, right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }
}
