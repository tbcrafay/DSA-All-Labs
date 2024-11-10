public class MathOperations {
    public static void main(String[] args) {
        double num = -5.6;

        // Absolute value
        double absValue = Math.abs(num);

        // Square root
        double sqrtValue = Math.sqrt(Math.abs(num));

        // Power
        double powerValue = Math.pow(num, 2);

        System.out.println("Absolute value: " + absValue);
        System.out.println("Square root: " + sqrtValue);
        System.out.println("Power: " + powerValue);
    }
}
