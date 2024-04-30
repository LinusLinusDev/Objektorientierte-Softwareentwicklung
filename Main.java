import Classes.Employee;
import Classes.Student;
import Classes.UniMember;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee("Stan", 300);
        var student = new Student("John", "Mathe");
        var uniMember = new UniMember("Steve");

        System.out.println(uniMember.getName());
        System.out.println();
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println();
        System.out.println(student.getName());
        System.out.println(student.getSubject());
    }
}
