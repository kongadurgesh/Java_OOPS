package objects;

/*
 * Question 7: Constructor Overloading
Create a class Employee with fields for name, position, and salary.
Provide multiple constructors to initialize these fields in different ways.
Demonstrate the use of each constructor in the main method.
 */
public class Employee {
    private String name;
    private String position;
    private Double salary;

    public Employee(String name, String position, Double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
    }

}
