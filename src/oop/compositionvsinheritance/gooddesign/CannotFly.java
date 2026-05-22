package oop.compositionvsinheritance.gooddesign;

public class CannotFly implements FlyBehaviour{
    @Override
    public void fly(String birdName) {
        System.out.println(birdName+ " cannot fly");
    }
}
