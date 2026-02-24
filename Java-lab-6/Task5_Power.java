import java.util.Scanner;

public class Task5_Power {

    public static long power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        int base = scanner.nextInt();

        System.out.print("Введите степень: ");
        int exponent = scanner.nextInt();

        long result = power(base, exponent);

        System.out.println("Результат: " + result);

        scanner.close();
    }
}