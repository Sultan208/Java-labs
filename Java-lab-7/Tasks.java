import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lab7 {

    private static final Random random = new Random();

    // ====== ВСПОМОГАТЕЛЬНЫЕ ФУНКЦИИ ======
    private static int[] randomIntArray(int n, int min, int max) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = random.nextInt(max - min + 1) + min;
        return a;
    }

    private static double[] randomDoubleArray(int n, double min, double max) {
        double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = min + (max - min) * random.nextDouble();
        return a;
    }

    private static int[][] randomIntMatrix(int r, int c, int min, int max) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = random.nextInt(max - min + 1) + min;
        return m;
    }

    private static double[][] randomDoubleMatrix(int r, int c, double min, double max) {
        double[][] m = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = min + (max - min) * random.nextDouble();
        return m;
    }

    private static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int x : row) System.out.printf("%5d", x);
            System.out.println();
        }
    }

    private static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double x : row) System.out.printf("%10.3f", x);
            System.out.println();
        }
    }

    // ================= ЗАДАНИЕ 1 =================
    // A[20] (int): сумма отрицательных
    public static void task1() {
        int[] A = randomIntArray(20, -50, 50);
        int sum = 0;
        for (int x : A) if (x < 0) sum += x;
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("Сумма отрицательных = " + sum);
    }

    // ================= ЗАДАНИЕ 2 =================
    // B[15] (int): сумма положительных
    public static void task2() {
        int[] B = randomIntArray(15, -50, 50);
        int sum = 0;
        for (int x : B) if (x > 0) sum += x;
        System.out.println("B = " + Arrays.toString(B));
        System.out.println("Сумма положительных = " + sum);
    }

    // ================= ЗАДАНИЕ 3 =================
    // A[12] (double): произведение отрицательных
    public static void task3() {
        double[] A = randomDoubleArray(12, -10.0, 10.0);
        double prod = 1.0;
        boolean found = false;

        for (double x : A) {
            if (x < 0) {
                prod *= x;
                found = true;
            }
        }

        System.out.println("A = " + Arrays.toString(A));
        if (found) System.out.println("Произведение отрицательных = " + prod);
        else System.out.println("Отрицательных элементов нет.");
    }

    // ================= ЗАДАНИЕ 4 =================
    // C[25] (int): произведение положительных
    public static void task4() {
        int[] C = randomIntArray(25, -10, 10);
        long prod = 1L;
        boolean found = false;

        for (int x : C) {
            if (x > 0) {
                prod *= x;
                found = true;
            }
        }

        System.out.println("C = " + Arrays.toString(C));
        if (found) System.out.println("Произведение положительных = " + prod);
        else System.out.println("Положительных элементов нет.");
    }

    // ================= ЗАДАНИЕ 5 =================
    // D[17] (double): среднее арифметическое
    public static void task5() {
        double[] D = randomDoubleArray(17, -20.0, 20.0);
        double sum = 0;
        for (double x : D) sum += x;

        System.out.println("D = " + Arrays.toString(D));
        System.out.println("Среднее арифметическое = " + (sum / D.length));
    }

    // ================= ЗАДАНИЕ 6 =================
    // A[10][10] (int): сумма отрицательных по строкам -> B[10]
    public static void task6() {
        int[][] A = randomIntMatrix(10, 10, -20, 20);
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            int sumNeg = 0;
            for (int j = 0; j < 10; j++) if (A[i][j] < 0) sumNeg += A[i][j];
            B[i] = sumNeg;
        }

        System.out.println("A (10x10):");
        printMatrix(A);
        System.out.println("B (сумма отрицательных по строкам) = " + Arrays.toString(B));
    }

    // ================= ЗАДАНИЕ 7 =================
    // B[5][5] (int): сумма положительных по строкам -> A[5]
    public static void task7() {
        int[][] B = randomIntMatrix(5, 5, -20, 20);
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            int sumPos = 0;
            for (int j = 0; j < 5; j++) if (B[i][j] > 0) sumPos += B[i][j];
            A[i] = sumPos;
        }

        System.out.println("B (5x5):");
        printMatrix(B);
        System.out.println("A (сумма положительных по строкам) = " + Arrays.toString(A));
    }

    // ================= ЗАДАНИЕ 8 =================
    // A[12][6] (double): произведение отрицательных по столбцам
    public static void task8() {
        double[][] A = randomDoubleMatrix(12, 6, -10.0, 10.0);
        double[] prodByCol = new double[6];
        boolean[] hasNeg = new boolean[6];

        Arrays.fill(prodByCol, 1.0);

        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    prodByCol[j] *= A[i][j];
                    hasNeg[j] = true;
                }
            }
        }

        System.out.println("A (12x6):");
        printMatrix(A);

        System.out.println("Произведение отрицательных по столбцам:");
        for (int j = 0; j < 6; j++) {
            if (hasNeg[j]) System.out.printf("Столбец %d -> %.6f%n", j, prodByCol[j]);
            else System.out.printf("Столбец %d -> нет отрицательных%n", j);
        }
    }

    // ================= ЗАДАНИЕ 9 =================
    // C[5][5] (int): произведение положительных элементов главной диагонали
    public static void task9() {
        int[][] C = randomIntMatrix(5, 5, -9, 9);
        long prod = 1L;
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            int x = C[i][i];
            if (x > 0) {
                prod *= x;
                found = true;
            }
        }

        System.out.println("C (5x5):");
        printMatrix(C);
        if (found) System.out.println("Произведение положительных на главной диагонали = " + prod);
        else System.out.println("На главной диагонали нет положительных элементов.");
    }

    // ================= ЗАДАНИЕ 10 =================
    // D[7][7] (double): среднее арифметическое главной диагонали
    public static void task10() {
        double[][] D = randomDoubleMatrix(7, 7, -10.0, 10.0);
        double sum = 0;
        for (int i = 0; i < 7; i++) sum += D[i][i];

        System.out.println("D (7x7):");
        printMatrix(D);
        System.out.println("Среднее главной диагонали = " + (sum / 7.0));
    }

    // ================= ЗАДАНИЕ 11 =================
    // A[n=25] (int): поменять местами max и min
    public static void task11() {
        int[] A = randomIntArray(25, -50, 50);

        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIdx]) minIdx = i;
            if (A[i] > A[maxIdx]) maxIdx = i;
        }

        System.out.println("A (до)  = " + Arrays.toString(A));
        System.out.printf("min=%d (idx=%d), max=%d (idx=%d)%n", A[minIdx], minIdx, A[maxIdx], maxIdx);

        int tmp = A[minIdx];
        A[minIdx] = A[maxIdx];
        A[maxIdx] = tmp;

        System.out.println("A (после)= " + Arrays.toString(A));
    }

    // ================= ЗАДАНИЕ 12 =================
    // B[n=25] (int): сортировка по возрастанию
    public static void task12() {
        int[] B = randomIntArray(25, -50, 50);
        System.out.println("B (до) = " + Arrays.toString(B));
        Arrays.sort(B);
        System.out.println("B (после сортировки) = " + Arrays.toString(B));
    }

    // ================= ЗАДАНИЕ 13 =================
    // C[n=20] (double): среднее значение
    public static void task13() {
        double[] C = randomDoubleArray(20, -30.0, 30.0);
        double sum = 0;
        for (double x : C) sum += x;
        System.out.println("C = " + Arrays.toString(C));
        System.out.println("Среднее значение = " + (sum / C.length));
    }

    // ================= ЗАДАНИЕ 14 =================
    // D[n=30] (int): сумма четных и сумма нечетных (по значению)
    public static void task14() {
        int[] D = randomIntArray(30, -50, 50);
        int sumEven = 0, sumOdd = 0;

        for (int x : D) {
            if (x % 2 == 0) sumEven += x;
            else sumOdd += x;
        }

        System.out.println("D = " + Arrays.toString(D));
        System.out.println("Сумма четных = " + sumEven);
        System.out.println("Сумма нечетных = " + sumOdd);
    }

    // ================= ЗАДАНИЕ 15 =================
    // Таблица 3x5 случайных чисел < 10
    public static void task15() {
        int[][] t = randomIntMatrix(3, 5, 0, 9);
        System.out.println("Таблица 3x5 (a(i,j) < 10):");
        printMatrix(t);
    }

    // ================= ЗАДАНИЕ 16 =================
    // Пример с maxX(): массив short[10], найти максимальный
    private static short maxX() {
        short[] array = new short[10];

        System.out.print("Исходный массив short[10]: ");
        for (int i = 0; i < 10; i++) {
            array[i] = (short) Math.round(50 * Math.random());
            System.out.print(array[i] + (i < 9 ? ", " : ""));
        }
        System.out.println();

        short max = array[0];
        for (int i = 1; i < 10; i++) if (array[i] > max) max = array[i];
        return max;
    }

    public static void task16() {
        System.out.println("Максимальный элемент = " + maxX());
    }

    // ================= ЗАДАНИЕ 17 =================
    // s1..s5: если s4 == s5 -> s1+s2, иначе s1+s3
    public static void task17(Scanner sc) {
        sc.nextLine(); // съесть перевод строки после nextInt() в меню

        System.out.print("Введите s1: ");
        String s1 = sc.nextLine();
        System.out.print("Введите s2: ");
        String s2 = sc.nextLine();
        System.out.print("Введите s3: ");
        String s3 = sc.nextLine();
        System.out.print("Введите s4: ");
        String s4 = sc.nextLine();
        System.out.print("Введите s5: ");
        String s5 = sc.nextLine();

        String result = s4.equals(s5) ? (s1 + s2) : (s1 + s3);
        System.out.println("Результат: " + result);
    }

    // ================= MAIN / MENU =================
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Лабораторная 7 (Java) =====");
            System.out.println("1  - сумма отрицательных A[20]");
            System.out.println("2  - сумма положительных B[15]");
            System.out.println("3  - произведение отрицательных A[12]");
            System.out.println("4  - произведение положительных C[25]");
            System.out.println("5  - среднее D[17]");
            System.out.println("6  - A[10][10] сумма отрицательных по строкам -> B[10]");
            System.out.println("7  - B[5][5] сумма положительных по строкам -> A[5]");
            System.out.println("8  - A[12][6] произведение отрицательных по столбцам");
            System.out.println("9  - C[5][5] произведение положительных главной диагонали");
            System.out.println("10 - D[7][7] среднее главной диагонали");
            System.out.println("11 - A[25] swap min/max");
            System.out.println("12 - B[25] сортировка");
            System.out.println("13 - C[20] среднее");
            System.out.println("14 - D[30] сумма четных и нечетных");
            System.out.println("15 - таблица 3x5 < 10");
            System.out.println("16 - maxX() массив short[10]");
            System.out.println("17 - строки s1..s5 (условие)");
            System.out.println("0  - выход");
            System.out.print("Выберите номер задания: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Нужно ввести число.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: task1(); break;
                case 2: task2(); break;
                case 3: task3(); break;
                case 4: task4(); break;
                case 5: task5(); break;
                case 6: task6(); break;
                case 7: task7(); break;
                case 8: task8(); break;
                case 9: task9(); break;
                case 10: task10(); break;
                case 11: task11(); break;
                case 12: task12(); break;
                case 13: task13(); break;
                case 14: task14(); break;
                case 15: task15(); break;
                case 16: task16(); break;
                case 17: task17(scanner); break;
                case 0:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Неверный номер задания.");
            }
        }
    }
} 