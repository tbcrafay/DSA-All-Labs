import java.util.Scanner;

public class HashCodeExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            int hashCode = inputString.hashCode();
            System.out.println("Hash code of the string: " + hashCode);
        }
    }
}