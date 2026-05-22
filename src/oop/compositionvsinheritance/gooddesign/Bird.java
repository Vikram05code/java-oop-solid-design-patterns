package oop.compositionvsinheritance.gooddesign;

public class Bird {
    private String name;
    private FlyBehaviour flyBehaviour;

    public Bird(String name, FlyBehaviour flyBehaviour) {
        this.name = name;
        this.flyBehaviour = flyBehaviour;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public void makeSound(){
        System.out.println(name+" is making a sound");
    }

    public void performFly(){
        flyBehaviour.fly(name);
    }

    public String getName() {
        return name;
    }

}
