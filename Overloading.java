/** Function Overloading in Java */
/** If two methods of class (whether both declaire in same class, or both inherited by a class, one declared and one inherited ) have the same name but signature that are not same,
 * then the method name is said to be overloaded.
 * Method Overloading is way to implement polymorphisis.
 */

 /** Method Overriding in Java - 
  *  Method Overriding is defining a method in subclass with the same signature with specific implementation in respect to the subclass.
  */


 class Overloading_1
 {
    // public void f1(int x){
    //     System.out.println("Overloading_1 "+x+"is printing");
    // }
    // public void f1(int x,int y){
    //     System.out.println("Overloading_2"+x+y+"is printing");
    // }

    public void f1(int x){
        System.out.println("Overriding_1"+x+"is printing");
    }
 }
 class Overloading_2 extends Overloading_1
 {
    // public void f1(int x,int y){
    //     System.out.println("Overloading_2"+x+y+"is printing");
    // }

    // public void f1(int x){
    //     System.out.println("Overloading_1 "+x+"is printing");
    // }
    // public void f1(int x,int y){
    //     System.out.println("Overloading_2"+x+y+"is printing");
    // }

    public void f1(int x){ /** this is called method overriding */
        System.out.println("Overriding_2"+x+"is printing");
    }
 }
 
 public class Overloading
 {
    public static void main(String args[]){
        Overloading_2 obj = new Overloading_2();
        obj.f1(5);
        // obj.f1(4,5);


    }

 }



