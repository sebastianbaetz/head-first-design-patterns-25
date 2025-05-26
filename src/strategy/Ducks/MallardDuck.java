package strategy.Ducks;

import strategy.Flying.FlyWithWings;
import strategy.Quacking.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real mallard duck");
    }

}
