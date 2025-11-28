package singletonsimple.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private final List<IPet> pets = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IPet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
