import java.util.Scanner;

public class CalculatorLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again;

        do {
            System.out.print("Число 1: ");
            double a = sc.nextDouble();

            System.out.print("Число 2: ");
            double b = sc.nextDouble();

            System.out.print("Операция (+ - * /): ");
            char op = sc.next().charAt(0);

            switch(op) {
                case '+': System.out.println("Ответ: " + (a + b)); break;
                case '-': System.out.println("Ответ: " + (a - b)); break;
                case '*': System.out.println("Ответ: " + (a * b)); break;
                case '/':
                    if (b != 0)
                        System.out.println("Ответ: " + (a / b));
                    else
                        System.out.println("Ошибка: деление на 0");
                    break;
            }

            System.out.print("Еще раз? (yes/no): ");
            again = sc.next();

        } while(again.equalsIgnoreCase("yes"));
    }
}