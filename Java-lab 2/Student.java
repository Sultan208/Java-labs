public class Student extends Person {

    private String group;

    public Student() {
        super();
        group = "Не задано";
    }

    public Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}
