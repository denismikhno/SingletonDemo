package singletonsimple.model;

public class Dog implements IPet {
    private final String name;
    private final String pet;

    public Dog(String name, String pet) {
        this.name = name;
        this.pet = pet;
    }

    @Override
    public void sound() {
        System.out.println("гав-гав");
    }

    @Override
    public String toString() {
        return pet + " " + name;
    }
}
