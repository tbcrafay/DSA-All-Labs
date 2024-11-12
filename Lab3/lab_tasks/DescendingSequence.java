package Lab3.lab_tasks;

import java.util.Scanner;

public class DescendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value (k): ");
        int k = scanner.nextInt();

        for (int i = k; i >= 0; i--) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}