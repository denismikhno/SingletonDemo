package singletonsimple;

import singletonsimple.manager.PersonManager;

public class Main {
    public static void main(String[] args) {
        PersonManager.INSTANCE.start();
    }
}
