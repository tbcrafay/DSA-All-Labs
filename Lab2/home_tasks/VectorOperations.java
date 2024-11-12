import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Vector<Integer> numbers = new Vector<>();

            System.out.print("Enter the number of integers: ");
            int n = scanner.nextInt();

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextInt());
            }

            // Sort the vector
            Collections.sort(numbers);

            // Display the largest number
            System.out.println("Largest number: " + numbers.lastElement());

            // Display the smallest number
            System.out.println("Smallest number: " + numbers.firstElement());
        }
    }
}