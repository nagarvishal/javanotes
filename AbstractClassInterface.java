/** Difference Between Interface and Abstract Class */

/** 
 * 1. Abstract Class can have any access modifires for members.Interface can have only public members.
 * 2. Abstract Class May or May Not contain abstract methods. Interface can not have defined methods. interface can have only public abstract methods.
 * 3. Abstract Class can have static or non static variables. Interface can have only static member variable.
 * 4. Abstract Class can have final or non final member variables. but Interace can have only final member variables.
 * 5. Interface do not constructor unlike Abstract Class
  */

 interface Calculation
 {
    double pi = 3.14;
    int add(int a,int b);
    int sub(int a,int b);
 }

 abstract class Person
 {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
 }

 public class AbstractClassInterface
 {
    public static void main(String args[]){

    }
 }