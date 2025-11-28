package singletonsimple.model;

public class Cat implements IPet {
    private final String name;
    private final String pet;

    public Cat(String name, String pet) {
        this.name = name;
        this.pet = pet;
    }

    @Override
    public void sound() {
        System.out.println("мяу-мяу");
    }

    @Override
    public String toString() {
        return pet + " " + name;
    }
}
