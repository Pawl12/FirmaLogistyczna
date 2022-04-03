package pl.bonus.firmaprzewozowa;

import java.util.ArrayList;
import java.util.List;

public class PassengerCarCreator {

    public List<PassengerCar> newPassengerCarsCreator(int amount)
    {
        List<PassengerCar> passengerCarsList = new ArrayList<>();
        for(int i = 0; i <= amount; i++)
        {
            PassengerCar car = new PassengerCar("Volvo 220d",null, 4, 1000, false,0, 10, 3);
            car.setId();
            car.setFuel(99);
            car.setWheelAir(2.2);
            passengerCarsList.add(car);

        }
        return passengerCarsList;
    }
}
