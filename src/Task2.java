import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Task 2");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        scanner.close();

        System.out.println("The sum of two numbers: " + sum);

        
    }
}
