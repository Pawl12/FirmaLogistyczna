package pl.bonus.klient;

import java.util.Objects;

public class Customer {

    private String name;
    private String adress;

    public Customer(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getName(), customer.getName()) && Objects.equals(getAdress(), customer.getAdress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAdress());
    }
}
