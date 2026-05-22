package oop.compositionvsinheritance.baddesign;

public class Penguin extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }

    @Override
    public void makeSound() {
        System.out.println("The penguin is making a sound");
    }

    @Override
    public void eat(){
        System.out.println("The penguin is eating");
    }

    @Override
    public void sleep(){
        System.out.println("The penguin is sleeping");
    }
}
