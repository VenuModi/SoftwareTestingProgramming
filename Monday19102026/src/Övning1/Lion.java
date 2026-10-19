package Övning1;

public class Lion extends Animal{

    public Lion(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(name + " says Ghrrrr!");
    }
}
