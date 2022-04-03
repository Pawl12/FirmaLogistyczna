package pl.bonus.firmaprzewozowa;

public class TruckCar extends Vehicle {

    final boolean WITH_TRAILER = true;
    final int NUMBER_OF_WHEELS = 8;


    public TruckCar(String model, String mark, double weight, boolean WITH_TRAILER, int NUMBER_OF_WHEELS, double fuel,double wheelAir, int id) {
        super(model, mark, NUMBER_OF_WHEELS, weight, WITH_TRAILER, fuel, nextID, wheelAir);

    }


    @Override
    public String toString() {
        return "TruckCar{" +
                "WITH_TRAILER=" + WITH_TRAILER +
                ", NUMBER_OF_WHEELS=" + NUMBER_OF_WHEELS +
                ", model='" + model + '\'' +
                ", MARK='" + MARK + '\'' +
                ", weight=" + weight +
                ", withTrailer=" + withTrailer +
                ", fuel=" + fuel +
                ", id=" + id +
                ", wheelAir=" + wheelAir +
                '}';
    }
}
