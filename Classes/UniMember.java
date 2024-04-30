package Classes;

import Interfaces.IUniMember;

public class UniMember implements IUniMember {
    private final String name;

    public UniMember(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
