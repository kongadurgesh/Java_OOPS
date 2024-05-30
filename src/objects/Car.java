package objects;

// Create a class named Car.
// Add fields for make, model, and year.
// Create a constructor to initialize these fields.
// Write a method to display the car details.
// Instantiate an object of the Car class.
// Call the method to display the car details.

public class Car implements Vehicle {
    private String make;
    private String model;
    private Integer year;
    private Engine engine;

    public Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String make, String model, Integer year, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public void getCarDetails() {
        System.out.println(toString());
        System.out.println("Engine details:");
        System.out.println(engine.toString());
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
    }

    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

}
