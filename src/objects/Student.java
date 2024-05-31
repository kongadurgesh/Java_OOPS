package objects;

/*
 * Question 13: Collections and Iterators
Create a class Student with fields for id, name, and grade.
Create a List of Student objects.
Iterate over the list using an iterator and print the details of each student.
 */
public class Student {
    private Integer id;
    private String name;
    private Character grade;

    public Student(Integer id, String name, Character grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
    }

}
