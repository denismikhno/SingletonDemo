package singletonsimple.model;

public class Dog implements IPet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("гав-гав");
    }
}
