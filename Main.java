import Classes.*;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee("Stan", 300);
        var student = new Student("John", "Mathe");
        var uniMember = new UniMember("Steve");
        var professor = new Professor("Tom", 1000);
        var phd = new PhD("Jim", 500);
        var tutor = new Tutor("Joe", "Informatik", 50);

        System.out.println(uniMember.getName());
        System.out.println();
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println();
        System.out.println(student.getName());
        System.out.println(student.getSubject());
        System.out.println();
        System.out.println(professor.getName());
        System.out.println(professor.getSalary());
        System.out.println();
        System.out.println(phd.getName());
        System.out.println(phd.getSalary());
        System.out.println();
        System.out.println(tutor.getName());
        System.out.println(tutor.getSubject());
        System.out.println(tutor.getSalary());
    }
}
