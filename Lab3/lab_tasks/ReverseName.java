package Lab3.lab_tasks;

import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        reverseName(name);
        scanner.close();
    }

    public static void reverseName(String name) {
        if (name.isEmpty()) {
            return;
        }
        reverseName(name.substring(1));
        System.out.print(name.charAt(0));
    }
}