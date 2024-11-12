public class ArraySumMean {
    public static void main(String[] args) {
        double[] numbers = {1.2, 3.4, 5.6, 7.8, 9.0, 11.12, 13.14};
        double sum = 0;

        // Calculate the sum
        for (double num : numbers) {
            sum += num;
        }

        // Calculate the mean
        double mean = sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }
}

/*
Memory Management:

Array Allocation:

When you declare double[] numbers = {1.2, 3.4, 5.6, 7.8, 9.0, 11.12, 13.14};, the JVM allocates a contiguous block of memory to store the 7 double-precision floating-point numbers.
The size of this block is determined by the number of elements and the size of each element (8 bytes for a double).
Variable Allocation:

The variables sum and mean are also allocated on the stack, which is a memory region used for storing local variables and function call information.
These variables are temporary and will be deallocated when the main method finishes execution.
Garbage Collection:

Once the main method completes, the array numbers is no longer needed.
The JVM's garbage collector will eventually reclaim the memory occupied by the array.
The garbage collector periodically scans the heap for objects that are no longer reachable and frees up the memory they occupy.

*/
