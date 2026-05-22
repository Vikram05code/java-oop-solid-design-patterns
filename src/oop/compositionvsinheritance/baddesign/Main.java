package oop.compositionvsinheritance.baddesign;

public class Main {
    public static void main(String[] args){
        Bird sparrow = new Sparrow();
        sparrow.fly();
        sparrow.makeSound();
        sparrow.eat();
        sparrow.sleep();
        Bird penguin = new Penguin();
        penguin.makeSound();
        penguin.eat();
        penguin.sleep();
        penguin.fly();
    }

}
