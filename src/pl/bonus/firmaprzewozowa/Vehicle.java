package pl.bonus.firmaprzewozowa;

import java.util.Objects;

public abstract class Vehicle {

    protected String model;
    final String MARK = "Volvo";
    protected int numberOfWheels;
    protected double weight;
    protected boolean withTrailer;
    protected double fuel; // max 100
    protected int id;
    protected static int nextID = 1;
    protected double wheelAir;

    public Vehicle(String model, String MARK, int numberOfWheels, double weight, boolean withTrailer, double fuel, int id, double wheelAir) {
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
        this.withTrailer = withTrailer;
        this.fuel = fuel;
        this.id = 0;
        this.wheelAir = wheelAir;
    }

    protected void motorStart()
    {
        System.out.println("Turning on...");
    }

    protected void motorStop()
    {
        System.out.println("Turning off...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numberOfWheels == vehicle.numberOfWheels && Double.compare(vehicle.weight, weight) == 0 && withTrailer == vehicle.withTrailer && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, numberOfWheels, weight, withTrailer);
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return MARK;
    }


    public void setFuel(double fuel) {
        if (fuel < 0 || fuel > 100) {
            throw new IllegalArgumentException("Health must be between 0 and 100, inclusive");
        } else {
            this.fuel = fuel;
        }
    }

    public double getFuel(){
        return this.fuel;
    }

    public void setWheelAir(double wheelAir) {
        if (wheelAir < 2 || wheelAir > 3) {
            throw new IllegalArgumentException("Air in the wheels have to be between 2 and 3");
        } else {
            this.wheelAir = wheelAir;
        }
    }
    public double getWheelAir(){
        return this.wheelAir;
    }

    public void setId()
    {
        id = nextID;
        nextID++;
    }
    public int getId()
    {
        return id;
    }


    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isWithTrailer() {
        return withTrailer;
    }

    public void setWithTrailer(boolean withTrailer) {
        this.withTrailer = withTrailer;
    }
}
