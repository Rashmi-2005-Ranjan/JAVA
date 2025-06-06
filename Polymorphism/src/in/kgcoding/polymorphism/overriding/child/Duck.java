package in.kgcoding.polymorphism.overriding.child;

import in.kgcoding.polymorphism.overriding.parent.Animal;

public class Duck extends Animal {
    @Override
    public void sound() {
        System.out.println("Quack Quack");
    }

    @Override
    public void eat() {
        System.out.println("Duck eats insects and plants");
    }

    @Override
    public void sleep() {
        System.out.println("Duck sleeps in the water or on land");
    }
}
