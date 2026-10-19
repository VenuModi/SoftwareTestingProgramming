package Övning1;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(name + " saya Meow Meow!");
    }
}
