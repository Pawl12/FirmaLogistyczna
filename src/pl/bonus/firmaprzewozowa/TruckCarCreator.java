package pl.bonus.firmaprzewozowa;

import java.util.ArrayList;
import java.util.List;

public class TruckCarCreator {


        public List<TruckCar> newTrucksCreator(int amount)
        {
        List<TruckCar> truckCarList = new ArrayList<>();
        for(int i = 0; i <= amount; i++)
        {
            TruckCar car = new TruckCar("Big-Man",null, 1500, true, 4, 101,3,1);
            car.setId();
            car.setFuel(99);
            car.setWheelAir(3);
            truckCarList.add(car);

        }
            return truckCarList;
        }


}
