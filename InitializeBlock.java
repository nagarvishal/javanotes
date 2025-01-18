/** An Instance Intializer or Initializer Block decalire in class executing when an instance of class is created*/
/** Return keyworkd can not written in initializer block */
/** Instance Initializer are permitted to reffer the corrent object via a keyword this, and to use keyword super */

/** Instance Initialization Block */
// public class InitializeBlock {
//     private int x;
//     {
//         System.out.println("Initilization Block : x = "+x);
//         x = 10;
//     }
//     public InitializeBlock(){
//         System.out.println("Constructor : x = "+x);
//     }
//     public static void main(String args[]){
//         InitializeBlock i1 = new InitializeBlock();
//         InitializeBlock i2 = new InitializeBlock();

//     }
// }




/** Static Initialization Block */
/* A Static Initializer declared in a class is executed when the class is initialize  */
/* Static Initializer may be use for intialize the class varaible of the class*/
/* return keyword can't not be used in static initializer */
/* this or super can't not be used in static block */


class Test
{
    public static int k;
    static
    {
        System.out.println("Static Initialization Block is Running :- "+k);
        k=10;
        System.out.println("Static Initialization Block is Running :- "+k);
    }
}
public class InitializeBlock
{ 
    public static void main(String args[]){
        System.out.println(Test.k);
        new Test();
        new Test();
        new Test();
    }
}



