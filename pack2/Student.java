package pack2;
public class Student {
    private int a;
    protected int b;
    public int c;
    int d;

    private void func1(){
        System.out.println("Private function iis running");
    }
    public void  func2(){
        System.out.println("Public functoin is running");
    }
    protected void  func3(){
        System.out.println("Protected function is running");
    }
    void func4(){
        System.out.println("Default functin is running");
    }
}
