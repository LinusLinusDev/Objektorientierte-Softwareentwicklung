package Classes;

import Interfaces.IStudent;

public class PhD implements IStudent {
    private String name;
    private String subject;

    public PhD(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return "M.Sc. " + this.name;
    }

    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public String toString() {
        return "PhD{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
