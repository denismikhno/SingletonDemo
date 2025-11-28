package singletonsimple.manager;

import singletonsimple.model.Cat;
import singletonsimple.model.Dog;
import singletonsimple.model.Person;

public class PersonManager {
    public static final PersonManager INSTANCE = new PersonManager();

    private PersonManager() {}

    public void start() {
        Person person1 = new Person("Иван");
        System.out.printf("Встречайте! Наш владелец питомцев - %s.\n", person1.getName());
        Cat cat = new Cat("Том", "кот");
        Dog dog = new Dog("Рекс", "собака");
        person1.getPets().add(cat);
        person1.getPets().add(dog);
        System.out.println(person1);
    }
}
