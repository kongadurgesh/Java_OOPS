package objects;

public class Rectangle extends Shape {

    private Integer length;
    private Integer breadth;

    public Rectangle(Integer length, Integer breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Double calculateArea() {
        return Double.valueOf(length * breadth);
    }

}
