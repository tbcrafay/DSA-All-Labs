public class ArrayOperations {
    public static void main(String[] args) {
        double[] numbers = {1.2, 3.4, 5.6, 7.8, 9.0, 11.12, 13.14};
        double key = 7.8;

        // Calculate sum and mean
        double sum = calculateSum(numbers);
        double mean = calculateMean(numbers);

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);

        // Split the array
        int splitIndex = findKeyIndex(numbers, key);
        if (splitIndex != -1) {
            double[] firstHalf = Arrays.copyOfRange(numbers, 0, splitIndex + 1);
            double[] secondHalf = Arrays.copyOfRange(numbers, splitIndex + 1, numbers.length);

            System.out.println("First half: " + Arrays.toString(firstHalf));
            System.out.println("Second half: " + Arrays.toString(secondHalf));
        } else {
            System.out.println("Key not found in the array.");
        }
    }

    public static double calculateSum(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static double calculateMean(double[] numbers) {
        return calculateSum(numbers) / numbers.length;
    }

    public static int findKeyIndex(double[] numbers, double key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1; // Key not found
    }
}
