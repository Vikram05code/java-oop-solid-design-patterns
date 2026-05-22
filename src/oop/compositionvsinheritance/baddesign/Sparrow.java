package oop.compositionvsinheritance.baddesign;

public class Sparrow extends Bird {

    @Override
    public void fly(){
        System.out.println("The Sparrow is flying");
    }

    @Override
    public void eat(){
        System.out.println("The Sparrow is eating");
    }

    public void sleep(){
        System.out.println("The Sparrow is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("The Sparrow is making a sound");
    }
}
