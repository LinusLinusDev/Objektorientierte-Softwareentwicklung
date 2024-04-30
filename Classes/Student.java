package Classes;

import Interfaces.IStudent;

public class Student extends UniMember implements IStudent {
    private final String subject;

    public Student(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public String getSubject() {
        return this.subject;
    }
}
