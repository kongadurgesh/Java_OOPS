package objects;

/*
 * Question 2: Encapsulation
Create a class named Person.
Add private fields for firstName, lastName, and age.
Provide public getter and setter methods for each field.
In the main method, create an object of Person, set values for the fields using the setter methods, and print the values using the getter methods.
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
