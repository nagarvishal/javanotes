package Nestedclasses;

/** Difference between static inner class and normal inner class */
/**
 * Static Inner class instane can be created outside the outer class with the following syntax 
 * Outer.Inner obj = new Outer.Inner();
 * No Need to create Instance Of Outer class.
 * 
 */

/**
 *  Inner classes can be private - 
 *  Wen know a class cannot be assoicated with the access modifier private , but if we have the class as a member of other clas , then the inner class can be made private.
 *  Inner class can be private, protected , public or default.
 */

 class Outer
 {
    static int y = 20;
    int x = 10;
     protected static class Inner
     {
         void if1(){
             System.out.println("if1()"+y);
         }
     }

     protected class Inner1
     {
        void if2(){
            System.out.println("if2()"+x+" "+y);
        }
     }
     
 }
 
 
 public class Nestedclass {
     public static void main(String args[]){
         Outer.Inner i1 = new Outer.Inner();
         i1.if1();

         Outer o1 = new Outer();
         Outer.Inner1 i2 = o1.new Inner1();
         Outer.Inner1 i3 = o1.new Inner1();
         i2.if2();
         i3.if2();
         return;
     }
 }
 
