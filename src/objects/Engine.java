package objects;

/*
 * Question 8: Composition
Create a class Engine with a field for horsepower and a method to display its details.
 */
public class Engine {
    private Integer horsePower;

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine [horsePower=" + horsePower + "]";
    }

    public Engine(Integer horsePower) {
        this.horsePower = horsePower;
    }

}
