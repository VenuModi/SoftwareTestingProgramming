public class OperatorLab {
    public static void main(String[] args) {

        /*Del 1 - Vad skrivs ut?*/
        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        /*Del 2 - Remainder(%)*/
        //int number = 17;
       //System.out.println(number % 2);

        /*Frågor:
        Vad blir resultater?
        *Vad händer om number ändras till 18?
        Vad kan  %2 användas till?*/

        int number = 18;
        System.out.println(number % 2);

        /*Del 3 - Booleanexperiment*/
        int age = 20;

        boolean test1 = age > 18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age!= 20;

        System.out.println(test1
        + "\n" + test2
        + "\n" + test3
        + "\n" + test4);

        /*Testa sedan logiska operatorer:*/
        boolean hasTicket = true;
        boolean isAdult = false;

        //boolean allowed = hasTicket && isAdult;
        boolean allowed = hasTicket||isAdult;
        System.out.println(allowed);
        /*Ändra väderna och prova även ||*/
    }
}
