import client.*;

public class Main {
    public static void main(String[] args) {


        Duck mallardDuck = new RedheadDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.performSwim();
    }
}