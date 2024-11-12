package Lab3.lab_tasks;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        int sum = calculateSum(N);
        System.out.println("Sum of numbers from 1 to " + N + ": " + sum);
        scanner.close();
    }

    public static int calculateSum(int N) {
        if (N == 0) {
            return 0;
        }
        return N + calculateSum(N - 1);
    }
}
