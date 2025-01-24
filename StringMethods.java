/********** String Methods -  */

/** toUpperCase(),toLowerCase() */


/**** indexOf() :- */
/**
 * indexOf(int ch);
 * indexOf(int ch, int fromIndex);
 * indexOf(String str);
 * indexOf(String str,int fromIndex);
 * lastIndexOf(int ch);
 * lastIndexOf(int ch,int fromIndex);
 * lastIndexOf(String str);
 * lastIndexOf(String str,int fromIndex);
 */

/**** Comparing String -  */
/**
 * equals(String s)
 * equalsIgnoreCase(String anotherString);
 * compareTo(String s);
 */


/**** Substring -  */
/**
 * substring(int beginIndex);
 * substring(int beginIndex,int endIndex);
 */

public class StringMethods
{
    public static void main(String args[]){

        /** Substring -  */
        String s1 = new String("vishal nagar is working fine");
        String s2 = s1.substring(4);
        String s3 = s1.substring(4,8);
        System.out.println(s2);
        System.out.println(s3);


        /** toUpperCase(),toLowerCase() */
        // String s1 = new String("Computer");
        // System.out.println(s1);
        // String s2 = s1.toUpperCase();
        // System.out.println(s2);
        // String s3 = s1.toLowerCase();
        // System.out.println(s3);


        /**
         * String s1 = new String("ComputerComputer");
         * int i = s1.indexOf('m');    System.out.println(i);
         * i = s1.indexOf('t');        System.out.println(i);
         * i = s1.indexOf('r');        System.out.println(i);
         * i = s1.indexOf('m',3);      System.out.println(i);
         * i = s1.indexOf("put");      System.out.println(i);
         * i = s1.indexOf("put",4);    System.out.println(i);
         * i = s1.lastIndexOf('e');    System.out.println(i);
         * i = s1.lastIndexOf("put");  System.out.println(i);
         * i = s1.lastIndexOf('e',3);  System.out.println(i);
         * i = s1.lastIndexOf("put",4); System.out.println(i);
         * i = s1.lastIndexOf("put",5); System.out.println(i);
         */

        /**
         * 
         * String s1 = new String("Computer");
         * String s2 = new String("computer");
         * if(s1.equals(s2)) System.out.println("Both the string are equals");
         * else System.out.println("Both the String are not equals");
         * if(s1.equalsIgnoreCase(s2)) System.out.println("Both the string are equals");
         * else System.out.println("Both the String are not equals");
         * int i = s1.compareTo(s2);
         * if(i==0) System.out.println("Both the string are equals");
         * else if(i>0) System.out.println("s1 is greather then s2");
         * else System.out.println("s2 is greather then s1");
         */



    }
}