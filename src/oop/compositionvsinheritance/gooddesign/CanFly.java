package oop.compositionvsinheritance.gooddesign;

public class CanFly implements FlyBehaviour{

    @Override
    public void fly(String birdName) {
        System.out.println(birdName+ " is flying");
    }
}
