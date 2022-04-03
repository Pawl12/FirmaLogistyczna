package pl.bonus;

import pl.bonus.firmaprzewozowa.PassengerCarCreator;
import pl.bonus.firmaprzewozowa.TruckCarCreator;

public class Main {

    public static void main(String[] args) {

        TruckCarCreator volvo = new TruckCarCreator();
        PassengerCarCreator volvoSmall = new PassengerCarCreator();

        //Tworzenie samochodów firmy
        System.out.println(volvo.newTrucksCreator(10));
        System.out.println(volvoSmall.newPassengerCarsCreator(10));

    }
}
