
/** Constructor :- */
/* Constructor is Member function of class */
/* The Name of the constructor is same as the name of the class */
/* Constructor has no return type */

/* A Constructor is special method that is used to initialize a newly created object, and is called implicitly, after the memory allocated to object */
/* It is not mendatory for the coder to write the constructor */
/* When there is no Constructor defined in the class by the programmer, compiler implicityly provide the class */
/* Constructor can be perameterized */
/* Constructor can be Overloaded */


public class Constructor {

    private int l,b,h;
    // public Constructor(){ /** Constructor Created by the compiler, no argument empty body */

    // }
    public Constructor(){
        this.l = 10;
        this.b = 8;
        this.h = 4;
    }
    public Constructor(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public void showDim(){
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
    }

    public static void main(String args[]){
        Constructor s1 = new Constructor();
        s1.showDim();
        Constructor s2 = new Constructor(3,4,5);
        s2.showDim();
    }


}


