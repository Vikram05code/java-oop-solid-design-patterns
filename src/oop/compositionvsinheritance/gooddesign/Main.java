package oop.compositionvsinheritance.gooddesign;

public class Main {

    public static void main(String[] args){
        Bird sparrow = new Bird("Sparrow",new CanFly());
        sparrow.performFly();
        sparrow.eat();
        sparrow.sleep();
        Penguin penguin = new Penguin();
        penguin.performFly();
        penguin.eat();
        penguin.sleep();
        penguin.walk();
    }
}
