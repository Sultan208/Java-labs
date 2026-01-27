public class ScopeDemo {

    int classValue = 100;

    public void showScope() {
        int localValue = 50;

        System.out.println("Поле класса: " + classValue);
        System.out.println("Локальная переменная: " + localValue);
    }

    public static void main(String[] args) {
        ScopeDemo demo = new ScopeDemo();
        demo.showScope();
    }
}
