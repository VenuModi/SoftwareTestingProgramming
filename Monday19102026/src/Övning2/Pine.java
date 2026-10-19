package Övning2;

public class Pine extends Tree{

    public Pine(double height){
        super(height);
    }

    @Override
    public void describe() {
        System.out.println("The Pine tree is " + height + " meters tall.");
    }
}
