package ex1;

import ex1.Duck;
import ex1.FlyWithWings;
import ex1.Quack;

class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a MallardDuck!");
    }
}