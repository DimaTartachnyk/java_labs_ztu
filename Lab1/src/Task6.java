import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Task 6");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        scanner.close();

        int[] fibonacciForward = generateFibonacciForward(n);
        int[] fibonacciReverse = generateFibonacciReverse(n);

        System.out.println("The increasing Fibonacci sequence: ");
        printArray(fibonacciForward);

        System.out.println("Reverse Fibonacci sequence: ");
        printArray(fibonacciReverse);
    }

    public static int[] generateFibonacciForward(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        if (n > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }

    public static int[] generateFibonacciReverse(int n) {
        int[] fibonacci = generateFibonacciForward(n);
        int[] reverseFibonacci = new int[n];
        for (int i = 0; i < n; i++) {
            reverseFibonacci[i] = fibonacci[n - 1 - i];
        }
        return reverseFibonacci;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
