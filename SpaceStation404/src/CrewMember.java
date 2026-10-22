public abstract class CrewMember {

    protected String name;
    protected int energy;

    public CrewMember(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void loseEnergy(int amount){
        energy -= amount;

        if (energy < 0){
            energy = 0;
        }
    }

    public void recoverEnergy(int amount){
        energy += amount;

        if (energy > 100);
        energy = 100;

    }

    public abstract void performTask(){
    }
}
