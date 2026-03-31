import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Число 1: ");
        double a = sc.nextDouble();

        System.out.print("Число 2: ");
        double b = sc.nextDouble();

        System.out.print("Операция (+ - * /): ");
        char op = sc.next().charAt(0);

        double res = 0;

        switch(op) {
            case '+': res = a + b; break;
            case '-': res = a - b; break;
            case '*': res = a * b; break;
            case '/':
                if (b != 0) res = a / b;
                else {
                    System.out.println("Деление на 0!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка");
                return;
        }

        System.out.println("Ответ: " + res);
    }
}