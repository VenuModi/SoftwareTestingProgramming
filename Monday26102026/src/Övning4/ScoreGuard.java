package Övning4;
/*4. Skapa en metod som tar emot en poäng mellan 0 och 100:
* static void checkScore(int score)
* - Om score är mindre äm 0 eller större än 100 ska metoden själv kasta ett IllegalArgumentException.
* - Använd throw new IllegalArgumentException("...")
* - Om poängen är giltig ska metoden skriva att poängen godkändes.
* - Anropa metoden från main med både ett giltigt och ett ogiltigt värde.
* - Fånga det ogiltiga värdet med try/catch i main.*/

public class ScoreGuard {

    public static void main(String[] args) {

        try{
            checkScore(85);
            checkScore(120);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }




        }

        //Allow main to call the checkScore without creating an object
    static void checkScore(int score){
        if (score < 0 || score > 100){

           //Detect an invalid argument. Create an exception and throw it.
            throw new IllegalArgumentException("Score must be between 0 to 100!");
        }

        System.out.println("Score: " + score + " approved.");
    }
}

/*
* throw: Used when we want to throw an exception ourselves
* catch: Used when we want to handle an exception that has been thrown.*/
