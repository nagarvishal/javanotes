
import java.util.Scanner;

/** Array -  */
public class Array
{
    public static void func(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]+5;
        }
        return;
    }
    public static void main(String args[]){
        // int arr[5]; //Error -
        // int arr[]  = new int[]; //Error - size should mention

        // int arr[] = new int[5];
        // int[] arrr = new int[5];

        /** int arr[] = new int[]{2,4,5,6,7,8};
         *  int arr[] = new int[2]{2,4,5,6,7}; // this will give an error
         *  int arr[] = new int[5]{5,6,7,8,9}; // this will give an error
         *  can not mention size and value together
         * */

        // int arr[] = {4,5,6,7,8,9,10};
        // System.out.println(arr[0]);

        /** Array is not blank */
        // int[] arr = new int[3];
        // System.out.println("arr[0] => "+arr[0]);
        // System.out.println("arr[0] => "+arr[1]);
        // System.out.println("arr[0] => "+arr[2]);

        // int arr[];
        // arr = new int[3];
        // arr[0] = 1;
        // arr[1] = 12;
        // arr[2] = 34;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);


        /** Task - Create A array of length 5 of int type. Take input from user and print */
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        Array.func(arr);
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

    }
}