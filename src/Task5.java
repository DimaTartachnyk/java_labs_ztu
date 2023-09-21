import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть ціле позитивне число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Введене число не є позитивним.");
        } else {
            int sum = calculateSumOfDigits(number);
            System.out.println("Сума цифр числа " + number + " дорівнює " + sum);
        }
        
        scanner.close();
    }
    
    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;  // Отримуємо останню цифру числа
            sum += digit;          // Додаємо цю цифру до суми
            num /= 10;             // Видаляємо останню цифру з числа
        }
        
        return sum;
    }
}
