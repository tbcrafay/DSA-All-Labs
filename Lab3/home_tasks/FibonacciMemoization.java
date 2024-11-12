package Lab3.home_tasks;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {
    public static void main(String[] args) {
        int N = 10; // Change N to the desired term
        Map<Integer, Integer> memo = new HashMap<>();
        int result = fibonacci(N, memo);
        System.out.println("The " + N + "-th Fibonacci number is: " + result);
    }

    public static int fibonacci(int N, Map<Integer, Integer> memo) {
        if (N <= 1) {
            return N;
        }

        if (memo.containsKey(N)) {
            return memo.get(N);
        }

        int result = fibonacci(N - 1, memo) + fibonacci(N - 2, memo);
        memo.put(N, result);
        return result;
    }
}
