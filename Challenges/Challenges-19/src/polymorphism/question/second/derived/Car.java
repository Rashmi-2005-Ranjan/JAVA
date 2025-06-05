package polymorphism.question.second.derived;

import polymorphism.question.second.base.Vehicle;

public class Car extends Vehicle {
    @Override
    public void service() {
        super.service ();
        System.out.println("Service Is Provided By This Car");
    }
}
