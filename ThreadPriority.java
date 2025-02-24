/** Thread Priority is inherited - 
 *  A Java thread inherits its priority from the thread that created it
 *  You can modify a thread's priority at any time after its creation using the setPriority() method and retrive the thred priority value using getPriority() method.
 * MIN_PRIORITY(0) - LOWEST PRIORITY
 * NORM_PRIORITY(5) - DEFAUTL PRIORITY
 * MAX_PRIORITY(10) - HIGHEST PRIORITY
 * 0 <= PRIORITY <= 10
 */

 class A implements Runnable
 {
    @Override
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Class A Runnable Function is executing");
        }
    }
 }

 class B implements Runnable
 {
    @Override
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Class B Runnable Function is executing");
        }
    }
 }

 class C implements Runnable
 {
    @Override
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Class C Runnable Function is executing");
        }
    }
 }



 
public class ThreadPriority {
    public static void main(String args[]){
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        Thread t3 = new Thread(new C());

        System.out.println("Class A Thread Priority = "+t1.getPriority());
        System.out.println("Class B Thread Priority =  "+t2.getPriority());
        System.out.println("Class C Thread Priority = "+t3.getPriority());

        t1.setPriority(10);
        t2.setPriority(10);
        t3.setPriority(1);

        System.out.println("Class A Thread Priority = "+t1.getPriority());
        System.out.println("Class B Thread Priority =  "+t2.getPriority());
        System.out.println("Class C Thread Priority = "+t3.getPriority());


        t1.start();
        t2.start();
        t3.start();
        return;
    }
}
