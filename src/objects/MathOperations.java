package objects;

/*
 * Question 4: Polymorphism (Method Overloading)
Create a class named MathOperations.
Add methods to perform addition for two integers, two double values, and concatenation for two strings.
Implement method overloading to achieve this.
 */
public class MathOperations {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer add(Integer a, Integer b, Integer c) {
        return a + b + c;
    }
}
