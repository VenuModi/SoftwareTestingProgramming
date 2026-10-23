public abstract class Monster {


    //allows subclasses to directly access name & hp
    protected String name;
    protected int hp;

    public Monster (String name){
        this.name = name;
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void takeDamage(int damage){
        if (damage < 0){
            throw new IllegalArgumentException("Damage cannot be negative");
        }

        //if monster has 10 hp & receives 25 damage, it will be negative. game should stop when it is 0 & not negative.
        hp = Math.max(0, hp - damage);
    }

    public void resetHp(){
        hp = 100;
    }

    //Every monster has different attack.
    public abstract int attack();
}
