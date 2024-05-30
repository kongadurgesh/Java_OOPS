import objects.Account;
import objects.Bike;
import objects.Car;
import objects.Cat;
import objects.Circle;
import objects.Dog;
import objects.Employee;
import objects.Engine;
import objects.Library;
import objects.MathOperations;
import objects.Person;
import objects.Rectangle;
import objects.Shape;
import objects.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        q1Basic();
        q2Encapsulation();
        q3Inheritance();
        q4Polymorphism();
        q5AbstractClassAndMethods();
        q6Interfaces();
        q7ConstructorOverLoading();
        q8Composition();
        q9InnerClasses();
        q10Exceptions();
    }

    private static void q10Exceptions() {
        Account account = new Account();
        account.deposit(123);
        account.withdraw(345);
        account.deposit(-1);
    }

    private static void q9InnerClasses() {
        Library library = new Library();
        library.addBook("Home", "Oliver Twist");
        library.addBook("Algorithms", "Naraimha karumanchi");
        System.out.println(library.getBooks());
    }

    private static void q8Composition() {
        Car car = new Car("Hundai", "i10", 2023, new Engine(100));
        car.getCarDetails();
    }

    private static void q7ConstructorOverLoading() {
        Employee employee = new Employee();
        System.out.println(employee.toString());
        Employee employee2 = new Employee("Durgesh");
        System.out.println(employee2.toString());
        Employee employee3 = new Employee("John", (double) 2345);
        System.out.println(employee3.toString());
        System.out.println(new Employee("Samsung", "Galaxy", (double) 123).toString());
    }

    private static void q6Interfaces() {
        Vehicle vehicle1 = new Bike();
        Vehicle vehicle2 = new Car("Tata", "Nexon", 2024);
        vehicle1.start();
        vehicle2.start();

        vehicle1.stop();
        vehicle2.stop();
    }

    private static void q5AbstractClassAndMethods() {
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(10, 5);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
    }

    private static void q4Polymorphism() {
        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.add(1, 2));
        System.out.println(mathOperations.add(5, 6, 7));
    }

    /*
     * Demonstrate polymorphism by creating objects of Dog and Cat classes and
     * calling the makeSound method on each.
     */
    private static void q3Inheritance() {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

    }

    /*
     * In the main method, create an object of Person, set values for the fields
     * using the setter methods, and print the values using the getter methods.
     */
    private static void q2Encapsulation() {
        Person person = new Person();
        person.setFirstName("Durgesh");
        person.setLastName("Konga");
        person.setAge(25);

        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
    }

    // Instantiate an object of the Car class.
    // Call the method to display the car details.
    private static void q1Basic() {
        Car car = new Car("Honda", "City", 2024);
        System.out.println(car.toString());
    }
}
