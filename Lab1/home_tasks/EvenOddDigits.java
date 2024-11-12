public class EvenOddDigits {
    public static void main(String[] args) {
        int num = 123456;
        int evenCount = 0, oddCount = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num /= 10;
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}
