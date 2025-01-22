/** Abstract Method :- */
/** An Abstract Class can include methods that contain no implementation.These Are Called Abstract Method.  */
/** The Abstract Method declaration must than end with a semicolon rather then a block */

/** If a class have any abstract method whether declared or inherit, the entire class must be declare abstract */

// abstract class Person
// {
//     abstract void show();
// }

// abstract class Student extends  Person
// {

// }

abstract class Person
{
    abstract void show();
}

class Student extends  Person
{
    void show(){
        
    }
}



public class AbstractMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();

    }
}
