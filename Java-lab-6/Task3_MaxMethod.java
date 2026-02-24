public class Task3_MaxMethod {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        System.out.println("Максимум (int): " + max(10, 25));
        System.out.println("Максимум (double): " + max(5.7, 9.3));
    }
}