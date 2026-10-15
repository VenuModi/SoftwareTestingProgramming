/*Constructors
* 2. Student class
* Create a Student class with the following properties:
* name(String), age(int), and grade(double).
* Implement a parameterized constructor that initializes all the properties.
* Create an instance of the Student class with sample values and print the details.
*/

public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade){
        this.name= name;
        this.age = age;
        this.grade = grade;
    }
}
