package module3assignment.recursion;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 9; // Change this value to test different positions
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
