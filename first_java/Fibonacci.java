import java.util.Scanner;

public class Fibonacci {
    static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }
        if (n < 2) {
            return n;
        }

        int[] memo = new int[n + 1];
        return fibHelper(n, memo);
    }

    static int fibHelper(int n, int[] memo) {
        if (n < 2) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }

        int fibValue = fibHelper(n - 1, memo) + fibHelper(n - 2, memo);
        memo[n] = fibValue;
        return fibValue;
    }

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = user_input.nextInt();

        try {
            int result = fib(n);
            System.out.println("The Fibonacci number is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}

