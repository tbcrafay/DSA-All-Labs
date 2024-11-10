public class DoubleToWrapper {
    public static void main(String[] args) {
        double primitiveDouble = 10.5;

        // Explicit conversion using Double.valueOf()
        Double wrapperDouble = Double.valueOf(primitiveDouble);

        // Implicit conversion (autoboxing)
        Double wrapperDouble2 = primitiveDouble;

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper Double (explicit): " + wrapperDouble);
        System.out.println("Wrapper Double (implicit): " + wrapperDouble2);
    }
}
