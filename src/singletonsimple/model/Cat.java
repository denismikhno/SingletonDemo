package singletonsimple.model;

public class Cat implements IPet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("мяу-мяу");
    }
}
