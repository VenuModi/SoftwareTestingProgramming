public abstract class Character {

    protected String name;
    protected int health;


    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){

        if (damage > 0){
            health -= damage;
        }
        if (health < 0 ){
            health = 0;
        }
    }

    public boolean isAlive(){
        return health > 0;
    }

    public abstract void attack(Character target);

    public abstract void showPicture();
}
