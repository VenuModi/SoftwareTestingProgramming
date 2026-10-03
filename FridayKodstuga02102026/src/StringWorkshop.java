/*Övning 4 - Stringverkstaden
* Syfte: Kombinera String, variabler, konkatenering och length().
*
* Skapa filen StringWorkshop.Java. Döp klassen till StringWrokshop och lägg koden nedan inuti main-methoden
* */
public class StringWorkshop {
    public static void main(String[] args) {
        String firstName = "Anna";
        String lastName = "Andersson";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());

        /*Bygg sedan utskrift som ser ut underfär så här:
        * Hej! Jag heter Anna Andersson.
        * Mitt namn innehåller 14 tecken.*/

        System.out.println("Hej! Jag heter " + fullName + "."
        + "\nMitt namn innehåller " + fullName.length() + " tecken.");

        /*Bonus
        * Använd variablerna för att skapa meningen:
        * Anna Andersson bor i Göteborg och utbilder sig till Mjukvarutestare.
        * */
        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        System.out.println(fullName + " bor i " + city + " och utbildar sig till " + profession + ".");
    }
}
