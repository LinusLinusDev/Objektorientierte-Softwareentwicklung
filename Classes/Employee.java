package Classes;

import Interfaces.IEmployee;

public class Employee extends UniMember implements IEmployee {
    private final float salary;

    public Employee(String name, float salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }
}
