/** Static Member Function :-  */
/** A class C inherit from its directly superclass all concret method m (both static and instance) of the super class */
/** No Method decalired in c has same signature */

/** Function Hinding :- */
/** is subclass has a method m with the same signature as of the method presenting in the super class, the method m is hide the method of the super class  */

/** Remember :- */
/** it is a compile time error if a static method is hiding an instance method */
/** is is compile time error if an instance method overrides a static method  */


/** Static Member Varaible -  */
/** Static Member varaible do not inharit */


class Parent
{

    public static int x = 4;
    public static void func(){
        System.out.println("Parent Static void func is running");
    }
    public static void func2(){
        System.out.println("Parent Static void func2 is running");
    }
}

class Child extends Parent
{
    public static int x;
    static
    {
        x = 10;
    }
    public static void func1(){
        System.out.println("Child Static function is running");
    }
    public static void func2(){
        System.out.println("Child Static void func2 is running");
    }
}

public class StaticMember {
    public static void main(String args[]){
        Child.func();
        Child.func2();
        
        System.out.println(Child.x);
        System.out.println(Parent.x);
    }
}
