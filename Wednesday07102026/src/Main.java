public class Main {
    public static void main(String[] args) {

        //Övning 1 - Skapa en hund och en katt i Main och låt dem göra olika ljud.
        Djur hund = new Djur("Woof woof!!");
        Djur katt = new Djur("Meow Meow!");

        hund.gorLjud();
        katt.gorLjud();

        //Övning 2 - Skapa två olika karaktärer i Main
        Spelkaraktar monica= new Spelkaraktar("Monica", 22);
        Spelkaraktar joye = new Spelkaraktar("Joye", 30);

        monica.presentera();
        joye.presentera();


        //Övning 3 - Skapa en robot i Main. Testa vad som händer om du försöker ändra batteri direkt från Main.
        Robot vox = new Robot("Vox", 200);
        Robot aer = new Robot("Aer", 150);

        vox.visaStatus();
        aer.visaStatus();

        //Constructors Övning 1
        Book book = new Book();
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.year);

        //Constructors Övning 2
        Student student = new Student("Lisa", 24, 9.6);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Grade: " + student.grade);


        //Constructors Övning 3
        Car car1 = new Car("Toyota", "RAV4", 2019, "Grey");
        Car car2 = new Car("Volvo", "EX60", 2026, "Yellow");

        System.out.println("1."
                +"\nMake: " + car1.make
                +"\nModel: " + car1.model
                +"\nYear: " + car1.year
                +"\nColor: " + car1.color);

        System.out.println("2."
                +"\nMake: " + car2.make
                +"\nModel: " + car2.model
                +"\nYear: " + car2.year
                +"\nColor: " + car2.color);


        /*Creatjng & manipulating Objects in Java
        * Task - 3 Create a main()-method to create instances of your classes
        * Create a third Java file that serves as your main executor class.
        * 1. Create a new instance of your Container Class.
        * 2. Print the details of the two objects in your container.
        * 3. Change the values of one of the instances such that the two objects have unique instance variable values.
        * Print the details again.
        * 4. Create a third object of your initial class from task - 1, outside of your container (i.e.,directly in the
        * main()-method). Assign reasonable values to it.
        * 5. Create a fourth object of your initial class from task-1, outside of your container. Assign it with one of
        * the object inside the container object. (Object newObject = Object1;)
        */

        //Create the container
        TravelContainer container = new TravelContainer();

        //Print the first two travels
        System.out.println(container.travel1.destination);
        System.out.println(container.travel2.destination);

        // Change the second travel
        container.travel2.destination = "Norway";
        container.travel2.days = 4;
        container.travel2.priceInSek = 35000;

        //Print again
        System.out.println(container.travel1.destination);
        System.out.println(container.travel2.destination);

        // Create third travel object
        Travel travel3 = new Travel("India", 30, 80000);
//        travel3.destination = "India";
//        travel3.days = 30;
//        travel3.priceInSek = 80000;

        //Create fourth reference
        Travel travel4 = container.travel1;


        /*Task - 4 Understanding Refrences
        * 1. Print the reference values of all four variables (two instances from Task 2 & the new variable from Task 3)
        * to the terminal. This can be done by simply using print (variablename).
        * 2. Analyze the results: What do you observe? Why do the reference values behave the way they do?
        */
        System.out.println(container.travel1.destination);
        System.out.println(container.travel2.destination);
        System.out.println(travel3);
        System.out.println(travel4);

        /*Task -5 Modifying Variables and Observing changes
        * 1. Re-assign the vaules of the two variables in the Container with new values.
        * 2. Observe the values of the other two variables (the ones outside of the Container).
        * Explain the behaviour you see. How do changes to one object affect the others?
        */
        container.travel1.destination = "Germany";

        System.out.println(container.travel1.destination);
        System.out.println(travel4.destination);
        System.out.println(travel3.destination);

        //Task - 6 Constructors

        System.out.println(container.travel1.destination);
        System.out.println(container.travel2.destination);
        System.out.println(travel3.destination);
        System.out.println(travel4.destination);
    }
}
