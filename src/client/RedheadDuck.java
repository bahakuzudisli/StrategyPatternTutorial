package client;

import fly.FlyWithWings;
import quack.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Looks like Redhead Duck!");
    }
}
