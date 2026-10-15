public class Vecka41KlasserMain {
    public static void main(String[] args) {

        // Två OBJEKT skapade från samma klass.
        // Djur = referenstypen
        // hund = variabelnamnet
        // new Djur("Voff") = skapar ett nytt Djur-objekt
        // "Voff" = argumentet som skickas till konstruktorn
        // Referensen till det nya objektet sparas i variabeln hund.
        Vecka41KlasserDjur hund = new Vecka41KlasserDjur("Voff");
        Vecka41KlasserDjur katt = new Vecka41KlasserDjur("Mjau");


        // Samma metod, men olika resultat eftersom objekten har olika state.
        hund.gorLjud();
        katt.gorLjud();
    }

}
