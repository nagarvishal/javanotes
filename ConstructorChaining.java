/** Constructor Chaining -  */
/** Constructor can call other constructor of the same class or superclass */
/** Constructor call from a constructor must be a first step. ( Call should appear in first line ) */
/** Such Series of invocation of constructor is knows as Constructor Chaining */

class A
{
    public A(){
        System.out.println("Constructor A is Running");
    }
}
class B extends A
{
    public B(){
        this(4);
        System.out.println("Constructor B is Running");
    }
    public B(int k){
        super();
        System.out.println("Constructor BK is Running"+k);
    }
}

public class ConstructorChaining
{
    public static void main(String args[]){
        B b1 = new B();

    }
}