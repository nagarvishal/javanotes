/**
 * Anonymous Class - 
 * Anonymous classes in java are more accurately knows as anonymous inner classes.
 * There's no such things as anonymous classes without the "inner".
 * They are defined inside another class.
 */
package AnonymousClass;

class Greeting
{
    public void sayHello(){
        System.out.println("Hello world");
    }
    public void hellworld(){}
}

class India
{
    Greeting g1 = new Greeting(){
        public void hellworld(){
            System.out.println("Print Hello Wrold");
        }
    };
}

public class Anonymousclass {
    public static void main(String args[]){
        India i = new India();
        i.g1.sayHello();
        i.g1.hellworld();
        
    } 
}


