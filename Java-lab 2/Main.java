public class Main {

    public static void main(String[] args) {

        Person person = new Person("Алексей", 30);
        person.displayInfo();

        System.out.println("----------------");

        Person student = new Student("Иван", 20, "ИС-2204");
        student.displayInfo();
    }
}
