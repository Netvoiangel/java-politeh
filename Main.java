interface Flyable {
    void fly();
}

class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Общий метод для всех птиц
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Eagle extends Bird implements Flyable {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying high in the sky.");
    }
}

class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    // Пингвины не летают, но они могут плавать
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle("Eagle");
        Bird penguin = new Penguin("Penguin");

        if (eagle instanceof Flyable) {
            ((Flyable) eagle).fly();
        }

        if (penguin instanceof Penguin) {
            ((Penguin) penguin).swim();
        }

        eagle.eat();
        penguin.eat();
    }
}
