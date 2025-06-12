package in.kgcoding.polymorphism.overriding.test;

import in.kgcoding.polymorphism.overriding.child.Cat;
import in.kgcoding.polymorphism.overriding.child.Dog;
import in.kgcoding.polymorphism.overriding.child.Duck;
import in.kgcoding.polymorphism.overriding.parent.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        // Calling methods on Cat object
        System.out.println("Cat:");
        cat.sound();
        cat.eat();
        cat.sleep();
        System.out.println();
        // Calling methods on Dog object
        System.out.println("Dog:");
        dog.sound();
        dog.eat();
        dog.sleep();
        System.out.println();
        // Calling methods on Duck object
        System.out.println("Duck:");
        duck.sound();
        duck.eat();
        duck.sleep();
        System.out.println();
        // Demonstrating polymorphism
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Duck();
        System.out.println("Polymorphism in action:");
        animal1.sound(); // Calls Cat's sound method
        animal1.eat();   // Calls Cat's eat method
        animal1.sleep(); // Calls Cat's sleep method
        System.out.println();
        animal2.sound(); // Calls Dog's sound method
        animal2.eat();   // Calls Dog's eat method
        animal2.sleep(); // Calls Dog's sleep method
        System.out.println();
        animal3.sound(); // Calls Duck's sound method
        animal3.eat();   // Calls Duck's eat method
        animal3.sleep(); // Calls Duck's sleep method
        System.out.println();
    }
}
