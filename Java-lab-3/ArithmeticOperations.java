import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();

        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();

        System.out.println("Сложение: " + (a + b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));
    }
}
