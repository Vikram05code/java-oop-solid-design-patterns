package oop.compositionvsinheritance.gooddesign;

public class Penguin extends Bird{
    public Penguin() {
        super("Penguin", new CannotFly());
    }

    public void walk(){
        System.out.println(getName()+" is walking");
    }

}
