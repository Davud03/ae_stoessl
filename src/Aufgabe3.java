public class Aufgabe3 {

    public Aufgabe3 (int age, boolean driverLicense) {
        //boolean driverLicense = age>=18 ? true : false;

        if(driverLicense == true && age >= 18) System.out.println("Du darfst das Fahrzeug führen!");
        else System.out.println("Lass bloß die Finger davon du Sack!");
    }


}