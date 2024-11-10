public class StringInitialization {
    public static void main(String[] args) {
        // a) String literals
        String str1 = "Hello, World!";
        String str2 = "This is a string literal.";

        // b) New keyword
        String str3 = new String("New string object.");
        String str4 = new String("Another new string object.");

        // Using intern() method and demonstrating immutability
        String str5 = "Immutable string";
        String str6 = str5.intern();

        // Attempting to modify a string (will fail due to immutability)
        str5 += " modified";

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        System.out.println("str5: " + str5); // Original string remains unchanged
        System.out.println("str6: " + str6); // Interned string also remains unchanged
    }
}
