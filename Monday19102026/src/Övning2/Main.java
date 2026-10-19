package Övning2;

import javax.swing.plaf.metal.OceanTheme;

public class Main {

    public static void main(String[] args) {


        Oak oak = new Oak(25.9);
        Pine pine = new Pine(17.6);

        oak.describe();
        pine.describe();
    }
}
