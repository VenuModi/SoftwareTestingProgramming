package Övning1;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(name + " says woof woof!");
    }
}
