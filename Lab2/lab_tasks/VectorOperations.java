import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        // Display all integers
        System.out.println("All integers in the vector:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Calculate the sum of integers
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all integers: " + sum);

        // Find the maximum element
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("Maximum element: " + max);
    }
}