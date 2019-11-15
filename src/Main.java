import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of courses:");
        String courses = scanner.nextLine();
        Student student = new Student(Integer.parseInt(courses));
        student.average();
        student.conditional();
    }
}