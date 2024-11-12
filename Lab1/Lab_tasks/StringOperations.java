public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "How";
        String str4 = "are";
        String str5 = "you";

        // a. Concatenate all five strings
        String concatenatedString = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Concatenated string: " + concatenatedString);

        // b. Convert fourth string to uppercase
        String uppercaseStr4 = str4.toUpperCase();
        System.out.println("Uppercase fourth string: " + uppercaseStr4);

        // c. Find the substring from the concatenated string from 8 to onward
        String substring = concatenatedString.substring(8);
        System.out.println("Substring from 8 onward: " + substring);
    }
}
