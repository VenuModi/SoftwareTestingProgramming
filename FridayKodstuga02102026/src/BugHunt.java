/*Övning 5 - Bug Hunt
* Syfte: Träna felsökning genom att läsa kompileringsfel och rätta ett problem i taget.
*
* Skapa filen BugHunt.Java och klistra in koden nedan. koden är medvetet trasig och ska inte kompilera från början. Rätta ett fel i taget och kör javac BugHunt.java efter varje ändring.
*
* när du är klar ska programmet kompilera och bland annat skriva ut Fruit: 7, Name: Ada och true. Det finns allså både kompileringsfel och logiskt / utskriftsfel.
* */

public class BugHunt {
    public static void main(String[] args) {
        String name = "Ada";
        //int age = "25"; //(variable int given the value string)
        //double height =  1,72; //(Double value delcare with , instead of .)
        //char grade = "A"; //(Char value given as string)
        //boolean likeJava = "true"; //(boolean value declared as string)
        int age = 25;
        double height = 1.72;
        char grade = 'A';
        boolean likesJava = true;


        int apples = 5;
        int bananas = 2;

        //System.out.println("Fruit: " + apples + bananas);(This give the output as 52)
        System.out.println("Fruit: " + (apples + bananas)); // correct way of getting the desired output
        System.out.println("Name: " + name);
        System.out.println(age == 25); //Prints true as == is a boolean operator
    }
}
