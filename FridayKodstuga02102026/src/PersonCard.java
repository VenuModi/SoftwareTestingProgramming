/*Övning: 2 - Bygg ett presonkort
* Syfte: Träna deklarering, tilldelning, datatyper och tydliga variablenamn.
*
* Skapa filen PersonCard.Java. Använd samma grundstruktur som i Övning 1, men döp klassen till PersonCard. Lägg all kod i denna övning inuiti main-metoden.
* */

public class PersonCard {
    public static void main(String[] args) {

        /*Del 1 - Skapa variabler som beskriver en påhittad person:*/
        String firstName = "Lisa";
        String lastName = "Andersson";
        int age = 28;
        double height = 1.772;
        char grade = 'B';
        boolean likesJava = true;

        System.out.println("Name: " + firstName + " " + lastName
        +"\nÅlder: " + age
        + "\nLängd: " + height
        + "\nBetyg: " + grade
        + "\nGillar Java: " + likesJava);

        /*Del 2 - Beräkna nästa års ålder*/
        int ageNextYear = age + 1;
        System.out.println("Nästa år Lisa är " + ageNextYear + " " + "år.") ;

        /*Del 3 - Förbättra variablenamnen*/
        //String n = "Volvo";
        //int x= 2022;
        //double y = 185000;
        //boolean b = true;
        /*This part of the code is difficult for any developer to undersatnd.Now One can name the variables in a way that people seeing the code can uderstand.*/

        /*Byt namn på variablerna så att någon annan programmerare förstår dem utan förklaring. Ett möjligt resultat:*/
        String carBrand = "Volvo";
        int modelYear = 2022;
        double price= 185000;
        boolean isElectric = true;

        System.out.println("Brand: " + carBrand
        + "\nModel: " + modelYear
        + "\nPrice: " + price
        + "\nElectric: " + isElectric);
    }
}
