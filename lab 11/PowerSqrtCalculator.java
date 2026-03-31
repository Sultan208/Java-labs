import java.util.Scanner;

public class PowerSqrtCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Число: ");
        double a = sc.nextDouble();

        System.out.println("Квадрат: " + Math.pow(a, 2));
        System.out.println("Корень: " + Math.sqrt(a));
    }
}