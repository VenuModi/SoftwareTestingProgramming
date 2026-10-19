package Övning4;

public class Dog extends Animal implements Playable{

    @Override
    public void makeSound() {
        System.out.println("My dog Gucchi says WOOF WOOF!");
    }

    @Override
    public void play() {
        System.out.println("Gucchi is fetching the ball.");
    }
}
