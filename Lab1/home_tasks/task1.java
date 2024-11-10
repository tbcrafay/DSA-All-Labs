public class AutoboxingAndWrapperMethods {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive to wrapper object
        int num = 10;
        Integer intObj = num; // Autoboxing

        // Unboxing: Converting wrapper object to primitive
        int num2 = intObj; // Unboxing

        // Wrapper class methods
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Double.parseDouble(\"3.14159\") : " + Double.parseDouble("3.14159"));
        System.out.println("Integer.toString(123) : " + Integer.toString(123));
    }
}
