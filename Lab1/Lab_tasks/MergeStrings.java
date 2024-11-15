public class MergeStrings {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            mergedString.append(word1.charAt(i++));
            mergedString.append(word2.charAt(j++));
        }

        // Append remaining characters from the longer string
        while (i < word1.length()) {
            mergedString.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            mergedString.append(word2.charAt(j++));
        }

        return mergedString.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        String mergedString = mergeAlternately(word1, word2);
        System.out.println(mergedString);
    }
}
