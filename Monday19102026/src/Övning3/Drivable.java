package Övning3;
/*Övning 3 - Fordon med superkrafter
* Olika typer av fordon kan ha samma förmåga.
* - Skapa ett interface Drivable med metoden drive().
* - Skapa klasserna Car och Bicycle som implementerar Drivable.
* - Skriv olika utskrifter i respektive drive()-metod.
* - Skapa båda objekten i main och anropa drive().
* - Skapa en metod startTrip(Drivable vehicle) som anropar vehicle.drive(). Testa med både Car och Bicycle.
* Extra utmaning: Skapa ytterligare en klass Scooter som också implementerar Drivable..
*/
public interface Drivable {

    void drive();
}
