package in.kgcoding.polymorphism.overriding.child;

import in.kgcoding.polymorphism.overriding.parent.Animal;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println ("Meow........");
    }

    @Override
    public void eat() {
        System.out.println ("Cat eats fish");
    }
    @Override
    public void sleep() {
        System.out.println ("Cat sleeps on the sofa");
    }
    // The walk method is not overridden, so it will use the parent class implementation
    /**
    public final void walk(){
        System.out.println ("Cat walks gracefully");
    }
     */
}
