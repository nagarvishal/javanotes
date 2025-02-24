/** Implementation of thread using by extends threaded class */


class A extends Thread
{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+" Thread A");
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++){
            System.out.println(i+" Thread B");
        }
    }
}

public class Threaded1 {
    public static void main(String args[]){
        A o1 = new A();
        B o2 = new B();
        o1.start();
        o2.start();
        
    }
}
