//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
}
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Атыңызды жазыңыз: ");
        student.setName(scanner.nextLine());

        System.out.print("Фамилияңызды жазыңыз: ");
        student.setSurname(scanner.nextLine());

        System.out.print("Жашыңызды жазыңыз: ");
        student.setAge(scanner.nextInt());
        scanner.nextLine();

        List<String> courses = new ArrayList<>();
        System.out.print("Канча курс окуйсуз? ");
        int courseCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < courseCount; i++) {
            System.out.print((i + 1) + "-курс: ");
            courses.add(scanner.nextLine());
        }

        student.setCourses(courses);

        System.out.println("\n--- Студенттин маалыматы ---");
        System.out.println("Аты: " + student.getName());
        System.out.println("Фамилиясы: " + student.getSurname());
        System.out.println("Жашы: " + student.getAge());
        System.out.println("Курстары:");
        for (String course : student.getCourses()) {
            System.out.println("- " + course);
        }
    }












