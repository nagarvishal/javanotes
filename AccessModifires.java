/** Java Access Modifires */
/** Java Support Four Categories of Access Modifires */
/* private */
/* protected */
/* public */
/* default */

/** Remember :- */
/* There can be one public class in a single java file */
/* The name of the java file must be the same of name of public class */
/* Only public class can be accessable from outside the package */



/** Access Modifires can be use for class , Member varaiblees, and Member Functions */

/* With Class */
/* For Outer Class :- There can be only two possibilities Either class is public or just a class which mean it is of default type */
/* For Inner Class :- For Inner Class any of among four access modifires can be use */

/* public classes can be access from one package to another packages. */
/*  */


/** Access Modifires for Member Varaibles/Member Function */
/* When a Member of class are private they can't not access from outside the class body. They are meant to be access from the same class in which they are declaired */
/* When Members are protected, They can be accessed from any class of the same package and child class from other package */
/* When Member are public, They can be accessed from anywhere */
/* When Member are default, They are Accessbale any of the class of same package */





class General { /* Outer Class */
    private int x;
    public int y;
    protected int z;
    int a;
    void func4(){
        System.out.println(x);
        System.out.println("default function is running");
    }
    private void func3(){
        System.out.println(y);
        System.out.println("protected function is running");
    }
    protected void func2(){
        System.out.println(z);
        System.out.println("protected function is running");
    }
    public void func1(){
        this.func3();
        System.out.println(a);
        System.out.println("public function running");
    }
    class dummy{ /* Inner class */

    }
}

public class AccessModifires
{
    public static void main(String args[]){
        General g1 = new General();
        g1.z = 34;
        g1.y = 56;
        g1.a = 23;
        g1.func1();
        g1.func2();
        g1.func4();


    }

}
