package Lab3.lab_tasks;

import java.util.Scanner;

public class RecursiveSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = sumArray(arr, n - 1);
        System.out.println("Sum of the array elements: " + sum);
        scanner.close();
    }

    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        return arr[index] + sumArray(arr, index - 1);
    }
}
