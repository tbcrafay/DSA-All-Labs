package Lab3.lab_tasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        int factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + ": " + factorial);
        scanner.close();
    }

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
