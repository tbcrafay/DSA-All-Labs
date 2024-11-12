import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStringExample {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("apple");
        

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Display all elements");
            System.out.println("2. Display the largest String");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (String str : strings) {
                        System.out.println(str);
                    }
                    break;
                case 2:
                    String largest = strings.get(0);
                    for (int i = 1; i < strings.size(); i++) {
                        if (strings.get(i).compareTo(largest) > 0) {
                            largest = strings.get(i);
                        }
                    }
                    System.out.println("Largest String: " + largest);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }
}