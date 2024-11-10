public class ReverseVowels {
    public static String reverseVowels(String str) {
        char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        while (i < j) {
            if (!vowels.contains(chars[i])) {
                i++;
            } else if (!vowels.contains(chars[j])) {
                j--;
            } else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "hello world";
        String reversedVowelsStr = reverseVowels(str);
        System.out.println(reversedVowelsStr);
    }
}
