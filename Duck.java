// duck.java
// Contains the Duck class and different duck types

// Abstract Duck Class
abstract class Duck {
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;

    public Duck(FlyBehavior flyBehavior, SwimBehavior swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performSwim() {
        swimBehavior.swim();
    }

    abstract void display();
}

// Concrete Duck Types
class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Fly(), new Swim());
    }

    void display() {
        System.out.println("I am a Mallard Duck.");
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new Fly(), new Swim());
    }

    void display() {
        System.out.println("I am a Red Head Duck.");
    }
}

class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NotFly(), new Float());
    }

    void display() {
        System.out.println("I am a Rubber Duck.");
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new NotFly(), new Drown());
    }

    void display() {
        System.out.println("I am a Wooden Duck.");
    }
}
