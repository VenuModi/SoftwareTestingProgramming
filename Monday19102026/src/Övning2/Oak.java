package Övning2;

public class Oak extends Tree{

    public Oak(double height){
        super(height);
    }

    @Override
    public void describe() {
        System.out.println("The gaint Oak is " + height + " meters tall.");
    }
}
