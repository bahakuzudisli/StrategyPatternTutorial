package client;

import fly.FlyNoWay;
import quack.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Looks like Decoy Duck!");
    }
}
