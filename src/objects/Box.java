package objects;

/*
 * Question 11: Generics
Create a generic class Box that can hold objects of any type.
Provide methods to add an object to the box and retrieve it.
Demonstrate the use of the Box class with different types of objects (e.g., Integer, String, Car).

 */
public class Box<T> {
    T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

}
