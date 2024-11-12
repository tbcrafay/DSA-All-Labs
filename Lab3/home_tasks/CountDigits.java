package Lab3.home_tasks;

public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = countDigits(num);
        System.out.println("Number of digits in " + num + ": " + count);
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }
}
