import java.util.Scanner;

public class EngineeringCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        System.out.println("sin: " + Math.sin(x));
        System.out.println("cos: " + Math.cos(x));
        System.out.println("tan: " + Math.tan(x));
    }
}