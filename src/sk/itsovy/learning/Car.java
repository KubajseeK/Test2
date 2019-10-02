package sk.itsovy.learning;

public class Car {
    private String model;
    private String brand;
    private int yearOfCreation;
    private int power;


    public Car() {
    }

    public Car(String model, String brand, int yearOfCreation, int power) {
        this.model = model;
        this.brand = brand;
        this.yearOfCreation = yearOfCreation;
        this.power = power;


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;


    }

    public double calculateHorsePowers() {
        double horse_power = 1.34102209;
        return power * horse_power;
    }


}
