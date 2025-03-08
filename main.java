public class main {
    // main.java
// Main class to demonstrate behavior

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performSwim();
        System.out.println();

        Duck redHead = new RedHeadDuck();
        redHead.display();
        redHead.performFly();
        redHead.performSwim();
        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performSwim();
        System.out.println();

        Duck wooden = new WoodenDuck();
        wooden.display();
        wooden.performFly();
        wooden.performSwim();
    }
}

}
