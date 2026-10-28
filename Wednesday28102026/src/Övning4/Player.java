package Övning4;

public class Player {

    private String name;
    private int health;
    private int coins;


    public Player(String name, int health, int coins){

        this.name = name;
        this.health = health;
        this.coins = coins;
    }

    //Return true or false based on affordability
    public boolean canBuyPotion(int price){
        return coins >= price;

    }

    public void buyPotion(int price){
        if (canBuyPotion(price)){
            coins -= price;
            System.out.println("Potion purchased!");
        }else {
            System.out.println("You dont have enough coins!");
        }
    }

    public void heal(int amount){
        health = Math.min(health + amount, 100);//Compare both and return smaller value
    }

    public void printStatus(){
        System.out.println("player: " + name);
        System.out.println("Health: " + health);
        System.out.println("Coins: " + coins);
    }

}
