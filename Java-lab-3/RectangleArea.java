import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину: ");
        double length = sc.nextDouble();

        System.out.print("Введите ширину: ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Площадь прямоугольника = " + area);
    }
}
