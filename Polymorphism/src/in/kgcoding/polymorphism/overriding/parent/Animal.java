package in.kgcoding.polymorphism.overriding.parent;

public class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal eats food");
    }

    public void sleep() {
        System.out.println("Animal sleeps");
    }

    // This method is not overridden in the child class
    public final void walk() {
        System.out.println("Animal walks");
    }
}
