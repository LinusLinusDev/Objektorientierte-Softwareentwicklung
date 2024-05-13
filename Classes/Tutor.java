package Classes;

import Interfaces.IEmployee;

public class Tutor extends Student implements IEmployee {
    private final float salary;

    public Tutor(String name, String subject, float salary) {
        super(name, subject);
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }
}
