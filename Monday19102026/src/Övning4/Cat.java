package Övning4;

public class Cat extends Animal implements Playable{

    @Override
    public void makeSound() {
        System.out.println("My cat Mimmi says MEOW MEOW");
    }

    @Override
    public void play() {
        System.out.println("Mimmi's favourite playtime is scratching her sofa");
    }
}
