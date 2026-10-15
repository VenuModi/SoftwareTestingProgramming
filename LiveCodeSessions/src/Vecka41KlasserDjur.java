public class Vecka41KlasserDjur {

    // Alla djur har ett ljud.
    // "Ljud" är en field / instansvariabel.
    // Varje objekt som skapas får sin egen uppsättning av dessa variabler.
    String ljud;


    // Konstruktorn körs när ett nytt Djur-objekt skapas.
    // Den tar emot ett ljud som parameter.
    Vecka41KlasserDjur(String ljud) {

        // Objektets egen variabel "ljud" får värdet som skickades in till konstruktorn.
        this.ljud = ljud;
    }



    // En METOD (funktion) beskriver något som objektet kan göra.
    void gorLjud() {
        System.out.println(ljud);
    }
}
