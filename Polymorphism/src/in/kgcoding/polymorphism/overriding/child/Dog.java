package in.kgcoding.polymorphism.overriding.child;

import in.kgcoding.polymorphism.overriding.parent.Animal;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark Bark");
    }

    @Override
    public void eat() {
        super.eat ();
        System.out.println("Dog eats meat and dog food");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in its kennel or on the floor");
    }
}
