import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Task 4");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Eneter second number: ");
        int number2 = scanner.nextInt();

        scanner.close();

        int gcd = findGCD(number1, number2);

        System.out.println("The greatest common denominator " + number1 + " & " + number2 + " = " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
