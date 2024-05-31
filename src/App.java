import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import objects.Account;
import objects.Bike;
import objects.Box;
import objects.Car;
import objects.Cat;
import objects.Circle;
import objects.Counter;
import objects.DataBaseConnection;
import objects.Dog;
import objects.Employee;
import objects.Engine;
import objects.FileManager;
import objects.Library;
import objects.MathOperations;
import objects.Person;
import objects.Rectangle;
import objects.Shape;
import objects.Student;
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
        q11Generics();
        q12FileIO();
        q13Collections();
        q14Threads();
        q15Singleton();
    }

    private static void q15Singleton() {
        DataBaseConnection dataBaseConnection1 = DataBaseConnection.getDataBaseConnection();

        DataBaseConnection baseConnection = DataBaseConnection.getDataBaseConnection();

        System.out.println("dataBaseConnection1: " + dataBaseConnection1.hashCode());
        System.out.println("baseConnection: " + baseConnection.hashCode());

        System.out.println(dataBaseConnection1.hashCode() == baseConnection.hashCode());
    }

    private static void q14Threads() throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                counter.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                counter.increment();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.getCount());
    }

    private static void q13Collections() {
        Student student = new Student(123, "Durgesh", 'A');
        Student student2 = new Student(234, "Alice", 'B');

        List<Student> students = Arrays.asList(student, student2);

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    private static void q12FileIO() throws IOException {
        FileManager fileManager = new FileManager();
        List<String> names = Arrays.asList("Durgesh", "Konga");
        fileManager.writeData(names);

        fileManager.readData();
    }

    private static void q11Generics() {
        Box<Integer> integerBox = new Box<>();
        integerBox.setObject(123);
        System.out.println(integerBox.getObject());

        Box<Car> carBox = new Box<>();
        carBox.setObject(new Car("Honda", "City", 2021));
        System.out.println(carBox.getObject());
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
