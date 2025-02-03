/** What is an Exception - 
 * 
 * {
 *      // our code 
 *      // Exception comming
 * }
 * 
 * {
 *      // Out Handling Code
 *      
 * }
 * Four Options - 
 * - Default throw Default catch
 * - Defautl throw Our catch
 * - Our throw Default catch
 * - Our throw Our catch
 */

 /** Exception Handling - 
  * Java Exception Handling is used to handle error condition in program systematically by taking the necessary actions.
  * 
  * throw and catch - 
  * Java Exceptions are raised with throw keyword and handled with the catch block.
  */

  /**throwalble - 
   * The throwable class provided a String variable that can be set by the subclasses to provide the detail message that provide more information of the exception occured.
   * ALL classes of the throwable define a one perameter constructor that takes a string as the details message.
   * The class throwable provides getMessage() function to retrive an exception.
   * 
   */

  /**Unchecked Exception Handling In Java - 
   * The class Exception represents exceptions that a program faces due to abnormal or special condition during execution.
   * Exception can be two type - Checked (Compile Time Exceptions)/Unchecked (Run Time Exceptions).
   */

  /**Unchecked Exception - 
   * Unchecked Exception are RuntimeException and any of its subclasses.
   * ArrayIndexOutOfBound,
   * NullPointerException and so on are all subclasses of the java.lang.RuntimeException class, which is subclass of Exception class
   */
   
   /* Exception Handling Syntax - 
    * 
    * try
    * {
    *       <code>
    * } catch(<exception type> <parameter>){
    *     // 0 or more statements
    * }
    * finally {
    *     
    * }
    * after try block catch/finally one of both should be complsory
    * 
    * finally block <statement>
    */

    /** Explicit throw - 
     *  A Program Explicitly throw an exception using the throw statement besides the implicit exception throw.
     * 
     * Syntax - 
     * throw <throwableinstance>
     * The Exception Reference must be of type Throwable class or one of its subclass
     * A Details Message can be passed to the constructor when the exception object would be created.
     * 
     * Why should we throw an exception object :- 
     * 1. Because we want to set a different message.
     * 2. Because Java can't not recogonize exceptional situtation according business logic.
     */



    /** Compile Time Error in checked Exception -  */
    /** Checked Exception forces programmer to deal with the exception that may be thrown. */
    /** IOException, SQLException, IllegalThreadStateException etc are checked exceptions. 
     * Syntax - throws
     * A throws clouse can be used in method prototype - 
     * Method() throws <Exception-Type-1> <Exception-Type-2> <Exception-Type-3>
     * {
     * } or you can add try catch block for handing Checked Exception.
    */

import java.io.IOException;

/** "Checked" means they will be checked at compile time itself. */

public class Exception {
    public static void main(String args[]) throws IOException {
        // String s1=null;
        // System.out.println("first line");
        // // System.out.println("Result : "+3/0);
        // System.out.println("Result : "+s1.length());
        // System.out.println("last line");


        // try{
        //     // System.out.println(3/0);
        //     System.out.println("In Try");
        // }catch(NullPointerException e){
        //     System.out.println("Exception : "+e.getMessage());
        // }catch(ArithmeticException e){
        //     System.out.println("Arithmatic Exception : "+e.getMessage());
        // }finally{
        //     System.out.println("finally is running");
        // }
        // System.out.println("Hello World");

        /** Our throw default catch - 
         * 
         */

         /**
          int balance = 5000;
         int widrwalAmount = 6000;

         try{
            if(balance < widrwalAmount){
                throw new ArithmeticException("Widrawal Acound can'nt not be greter then Balance Amount/Insufficient Balance");
            }
            balance = balance - widrwalAmount;
            System.out.println("Transaction Successfully Done");
            System.out.println("Remaining Amount in you bank accound"+balance);
         }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("vishal nagar is properly now iam very happy ending");
         }finally{
            System.out.println("finally block is running");
         }
          */


          /** Checked Exception -  */
        //   throw new IOException("Myself vishal nagar");

        // throw new ArithmeticException("This is Airthmatic Exception");

        // throw new IOException("My self vishal nagr");

        try{
            throw new IOException("vishal nagar is working properly");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
