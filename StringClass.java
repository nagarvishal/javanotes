



/** String Class -  */
/** A java.lang.String is predefined final class which implices no class can extend it */
/** Java String class is imutable. String in java once created and initialized then cannot be changed on the same reference. */
/** A simple String can be created using String Literal eclosed inside the double quotes as shown */

/** If Two or More String have same set of charactor in same sequence then they are share the same reference in memory */
/**            ____________________
 * str1  -->  |                    |
 * str2  -->  |"My name is vishal" |
 * str3  -->  |____________________|
 */
/** all the String reference variable refer the same String Object */


/** Contatenation Operator - The java.lang.String class is differ from other classes. one difference being that the String Object can be used with += and + operator for concatation.  */



public class StringClass
{
    public static void main(String args[]){
        // String s1 = "My Name is Bond";
        // System.out.println(s1);

        // String str1 = "My name is vishal";
        // String str2 = "My name is vishal";
        // String str3 = "My name" + " is vishal";

        // String str4 = "vishal";
        // String str5 = "My name is "+str4;
        // String str6 = "My name is vishal";
        // System.out.println(str1);


        /** Create String using new keyword */
        // String str7 = new String("My name is vishal");

        String s1 = "computer";
        String s2 = "computer";
        String s3 = new String("computer");
        System.out.println("Result 1 : "+(s1==s2));
        System.out.println("Result 2 : "+(s1.equals(s2)));
        System.out.println("Result 3 : "+(s1==s3));
        System.out.println("Result 4 : "+(s1.equals(s3)));


    }
}