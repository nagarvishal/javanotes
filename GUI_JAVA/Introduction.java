package GUI_JAVA;
import java.util.Scanner;
/** GUI : Graphical User interface
 * Graphical User Interface is a type of user interface that allows users to intreact with the screen using graphical components (Visual indicators) rather then tet commnads.
 */

 /**
  * There are two sets of java apis for graphical programming :
  * AWS (Abstract Windowsing Toolkit)
  * Swing
  */

/*
 *  Frame f = new Frame();
 *  Panel p1 = new Panel();
 *  Panel p2 = new Panel();
 *  p1.add(new Label());
 *  p2.add(new Label());
 *  f.add(p1);f.add(p2)
 */

class Example
{
    public void func(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is "+sum);
        return;
    }
}





public class Introduction {
    public static void main(String args[]){
        Example e = new Example();
        e.func();
        
    }
}


