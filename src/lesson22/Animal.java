package lesson22;

public class Animal {
    int eyes;

    Animal() {
        System.out.println("i'm Animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail = 1;
    int raw = 4;

    Pet() {
        eyes = 2;
        System.out.println("I'm Pet");
    }


    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I'm a dog and my name " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("I'm a cat and my name " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test{
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");
        System.out.println("Dog raw = " + dog.raw);
        Cat cat = new Cat("Myrka");
        cat.sleep();
    }
}