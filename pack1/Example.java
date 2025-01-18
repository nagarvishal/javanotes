package pack1;

import pack2.Student;

class Exm extends Student
{
    public void printProtected(){
        this.b = 34;
        this.c = 31;
        this.func3();
    }
}

public class Example{
    public static void main(String args[]){
       Exm e1 = new Exm();
       e1.printProtected();
    }
}
