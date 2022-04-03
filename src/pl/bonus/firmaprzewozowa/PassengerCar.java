package pl.bonus.firmaprzewozowa;

public class PassengerCar extends Vehicle{

    final boolean WITH_TRAILER = false;
    final int NUMBER_OF_WHEELS = 4;


    public PassengerCar(String model, String mark, int NUMBER_OF_WHEELS, double weight, boolean WITH_TRAILER, double fuel, int ID, double wheelAir) {
        super(model, mark, NUMBER_OF_WHEELS, weight, WITH_TRAILER, fuel,nextID, wheelAir);
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
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
