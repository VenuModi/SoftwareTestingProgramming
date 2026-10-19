package Övning4;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();


        dog.makeSound();
        cat.makeSound();

        showTalent(new Dog());
        showTalent(new Cat());
    }

    public static void showTalent(Playable participant){
        participant.play();
    }
}
