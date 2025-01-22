/** Interface -  */
/** Interface just specify the method declairation (implicitly public and abstract) and can only contain fields ( which are implicitly public,static,final )*/
/** An Interface like that of an Abstract Class can not be instantiated */
/** Interface do not have constructor */

/** If a class that implements an Interface does not defined all the methods of interface, then is must be declared abstract and the method defination should be provided by the subclass 
 * that extends the abstract class
 */

 /** You can not create object of any interface but creation of object reference is possible */
 /** Object reference of interface can refer to any of its subclass type */



// interface InterfaceName {
//     int x = 10; // Must be public static final
//     void someFunction(); // Public and abstract by default
// }


// interface InterfaceName
// {
//     int x;
//     void someFunction();
// }

// public class Interface {
    
// }

// interface l1
// {
//     void someFunction();
// }

// class A implements  l1
// {
//     @SuppressWarnings("override")
//     public void someFunction(){
//         System.out.println("Class A someFunction is running");
//     }
// }


// interface I1
// {

// }
// interface I2
// {

// }
// interface I3 extends I1,I2
// {

// }

// interface  I4
// {

// }

// class A implements I3
// {

// }

// class B extends  A implements I3,I4
// {

// }

// interface I1
// {
//     void f1();
// }
// interface I2
// {
//     void f2();
// }

// class A implements I1,I2
// {
//     public void f1(){
//         System.out.println("Class A f1 is running");
//     }
//     public void f2(){
//         System.out.println("Class A f2 is running");
//     }
//     public void f3(){
//         System.out.println("Class A f3 is running");
//     }
// }

// Interface I1
interface I1 {
    void func1(int a);
}

// Interface I2
interface I2 {
    void func2(int p, int q);
}

// Interface I3 extends both I1 and I2
interface I3 extends I1, I2 {
    void func3(String p);
}

// Abstract class A implements I3
abstract class A implements I3 {
    // Correct implementation of func1
    public void func1(int a) {
        System.out.println("func1 implemented");
    }

    // Correct implementation of func2
    public void func2(int p, int q) {
        System.out.println("func2 implemented");
    }
}

class B extends  A
{
    public void func3(String p){
        System.out.println("func3 is running");
    }
}


public class Interface
{
    public static void main(String args[]){
        // A a1 = new A();
        // a1.someFunction();

        // A obj = new A();
        // obj.f1();

        // I1 obj = new A();
        // obj.f1();
        // obj.f2(); //Error -
        // obj.f3(); //Error - 

        B b1 = new B();
        b1.func1(3);
        b1.func2(3,4);
        b1.func3("vishal nagar");
    }
}