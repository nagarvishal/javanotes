/** super keyword -  */
/** In Inheritance, subclass object when call an instance member function of subclass only, function contain implicit reference varaible 
 * this, super Both refering the current object(Object of subclass)
*/

/** They only diffrenece between this and super is -  */
/** this reference variable is of subclass type */
/** super reference varaible is of superclass type */


// Use of super Keyword - 
/** if your method overrides one of its superclass's methods, you can invode the super class version of the method through the use of keyword super.  */
/** it avoid the name conflict between member variable of subclass and superclass */


class A
{
    int x;
    public void func1(){
        System.out.println("A class function func1 is running");
    }
}

class B extends A
{
    int x;
    public void func1(){
        System.out.println("B class function func1 is running");
        // this.func1();
        super.func1();
        return;
    }
    public void func2(){
        int x;
        x = 20;
        this.x = 30;
        super.x = 40;
        System.out.println(x);System.out.println(this.x);System.out.println(super.x);
        
    }
}



public class Super {
    public static void main(String args[]){
        B obj = new B();
        obj.func1(); 
        obj.func2()  ;
    }
}
