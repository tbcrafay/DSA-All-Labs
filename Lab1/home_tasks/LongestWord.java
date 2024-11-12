public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String sentence = "This is a sample sentence with different word lengths";
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);
    }
}
