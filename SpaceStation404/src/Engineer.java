public class Engineer extends CrewMember implements StationTask{

    public Engineer(String name, int energy){
        super(name, energy);
    }

    @Override
    public void performTask() {
        System.out.println(name + " is checking the space station machinery!");
    }

    public boolean repair (String section, int cost){

        if (energy < cost){
            System.out.println("Not enough energy to repair the " + section);
            return false;
        }
        loseEnergy(cost);

        System.out.println(name + " repaired " + section);
        System.out.println("Energy used: " + cost);
        System.out.println("Remaining energy: " + energy);

        return true;
    }

}
