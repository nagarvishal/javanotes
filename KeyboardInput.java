
import java.util.Scanner;

/** Usefull Methods -  */
/** next(), nextLine(), nextBoolean(), nextByte(), nextDouble(), nextFloat(), nextInt(), nextLong(), nextShort() */

/** Scanner Class :- */
/** A Scanner breaks its input into tokens using delimeter pattern, which by default matches whitespace. */
/** The Resulting Tokens may then be converted into values of different types using the varios next methods.*/

public class KeyboardInput
{
    public static void main(String args[]){
        System.out.println("Enter your name and age");
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        String name = sc.nextLine();
        int age = sc.nextInt();
        boolean b1 = sc.nextBoolean();

        System.out.println("name = "+name+"age = "+age);
        System.out.println("b1 = "+b1);
    }
}
