



/** Abstract Class */
/** Abstract Class are Declaired with the abstract keyword */
/** An Abstract Class can't not instantiated */
/** Java Abstract Classes are used to declare common charactoriecs of subclass */
/** it can only be used as a superclass for the other classes that extends the abstract class */
/** Like any other class, an abstract class can contain fileds that describe the characteristics and methods that describe the actions
 * that a class can perform
 */

abstract class Person
{
    private String name;
    private int age;
    public void setName(String n){
        name = n;
        System.out.println(name);
    }
    public void setAge(int age){
        this.age = age;
        System.out.println(this.age);
    }
}

class Student extends  Person
{
    
}
public class AbstractClass {
    // Person p1 = new Person(); -> can't not created instance of abstract class
    public void main(String args[]){
        Student s1 = new Student();
        Person s2 = new Student();
        s1.setName("vishal nagar");
        s2.setAge(23);
    }
}
