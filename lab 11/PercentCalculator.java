import java.util.Scanner;

public class PercentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(); // процент
        double b = sc.nextDouble(); // число

        System.out.println("Ответ: " + (b * a / 100));
    }
}