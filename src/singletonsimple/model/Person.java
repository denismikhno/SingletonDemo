package singletonsimple.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private final List<IPet> pets = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<IPet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return String.format("%s владеет такими домашними животными %s.", name, pets);
    }
}
