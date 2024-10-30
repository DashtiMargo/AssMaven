package car;

public class Polymorphism  {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        PedigreeCat pedigreeCat = new PedigreeCat();

        animal.eat();
        animal.sleap();

        cat.sleap();
        cat.eat();

        pedigreeCat.eat();
        pedigreeCat.sleap();
        pedigreeCat.purrs();

        /*
                       Класс реализует интерфейс - implements
                       Класс наследует класс - extends
                       Интерфейс наследует интерфейс - extends
         */
     }
    }
