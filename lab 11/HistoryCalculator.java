import java.util.*;

public class HistoryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double res = a + b;

        String record = a + " + " + b + " = " + res;
        history.add(record);

        for (String h : history) {
            System.out.println(h);
        }
    }
}