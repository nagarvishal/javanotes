
/**
 * Runable Interface
 * 
 * public interface Runnable {
 *      void run();
 * }
 * 
 * One Way to create thread in java is to implement the Runable interface and then instantate an object of the class.
 * We need to overide the run() method into our class which is only method that need to be implemented.
 */

class A implements Runnable
{
    A(){
        System.out.print("A Constructor is running");
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Thread A "+i);
        }
    }
}

class B implements Runnable
{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Thread B "+i);
        }
    }
}
public class Threaded {

    public static void main(String args[]){
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());

        t1.start();
        t2.start();

        System.out.println("vishal nagar");
        
    }
}
