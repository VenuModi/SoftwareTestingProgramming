/*6. Bonus - Tamagotchi
* - Skapa klassen Pet med till exempel name, hunger och energy.
* - Lägg till metoderna eat() och play() som förändrar värdena.
* - Om hunger blir för hög ska djuret klaga.
* - Om energy blir för låg ska djuret vägra leka.
* - Extra: gör variablerna private.*/

public class Pet {
    private String name;
    private int hunger;
    private int energy;

    public Pet(String name){
        this.name = name;
        this.hunger = 50;
        this.energy = 50;
    }

    public void eat(){
        hunger = Math.max(0, hunger - 20);
        System.out.println(name + " is eating!");
    }

    public void play(){
        if(energy < 20){
            System.out.println(name + " is too tired to play!");
        }else {
            energy = Math.max(0, energy - 20);
            hunger = Math.min(100, hunger + 10);
            System.out.println(name + " is playing!");
        }
    }
    public void showStatus(){
        System.out.println("Name: " + name);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);

        if (hunger >70){
            System.out.println(name + " is very hungry!");
        }
    }
}
