package Lab3.lab_tasks;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        int count = countDigits(num);
        System.out.println("Number of digits in " + num + ": " + count);
        scanner.close();
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }
}
