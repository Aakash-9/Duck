public class Behavior {
    // behavior.java
// Contains all interfaces and behavior implementations

// FlyBehavior Interface
interface FlyBehavior {
    void fly();
}

// SwimBehavior Interface
interface SwimBehavior {
    void swim();
}

// Concrete Fly Behaviors
class Fly implements FlyBehavior {
    public void fly() {
        System.out.println("This duck can fly.");
    }
}

class NotFly implements FlyBehavior {
    public void fly() {
        System.out.println("This duck cannot fly.");
    }
}

// Concrete Swim Behaviors
class Swim implements SwimBehavior {
    public void swim() {
        System.out.println("This duck swims in water.");
    }
}

class Float implements SwimBehavior {
    public void swim() {
        System.out.println("This duck floats on water.");
    }
}

class Drown implements SwimBehavior {
    public void swim() {
        System.out.println("This duck drowns in water.");
    }
}

}
