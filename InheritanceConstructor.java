/** Constructor Inheritance -  */
/** Subclass Constructor invoke the construcotor of SuperClass */
/** Explicit Call to the super class constructor from subclass constructor can be made using super() */
/** You can write a subclass construcotor that invode the construcotr of superclass, Either implicityly or by using the keyword super */

class A
{
    public int a;
    public int c;
    // A(){
    //     System.out.println("Class A constructor is running");
    // }
    A(int a,int b){
        this.a = a;
        this.c = b;
        System.out.println("Class A Two Argument function is running");
    }
}

class B extends A
{
    public int b;
    B(int p,int q){
        super(3,4);
        System.out.println("Class B constructor is running");
    }
}
public class InheritanceConstructor {
    public static void main(String args[]){
        B b1 = new B(3,4);
        System.out.println(b1.a);
    }
}

