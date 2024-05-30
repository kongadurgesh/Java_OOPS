package objects;

public class Circle extends Shape {

    private Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }

}
