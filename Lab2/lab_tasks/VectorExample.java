import java.util.Vector;

public class VectorExample {
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

        int sum = 0;
        for (Integer number : numbers) {
            System.out.println(number);
            sum += number;
        }

        System.out.println("Sum of all numbers: " + sum);
    }
}