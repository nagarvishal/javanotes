public class Hello
{
    public static void main(String[] args){
        System.out.println("vishal nagar");
    }
}



































// public class Hello
// {
//     public String countAndSay(int n)
//     {
//         String s1 = "1";
//         String s2;
//         int i=1,j;
//         while(i < n){
//             s2 = "";
//             j=0;
//             s2 = "";
//             while(j<s1.length()){
//                char c = s1.charAt(j);
//                int k=j+1;
//                int count=1;
//                while(k < s1.length()){
//                     if(s1.charAt(k) == c){
//                         count=count+1;
//                     }
//                     else break;
//                }
//                j = k;
//                s2 = s2 + String.valueOf(count);
//                s2 = s2 + c;
//             }
//             s1 = s2;
//         }

//         return s1;

//     }
//     public static void main(String args[])
//     {

//     }
// }

/*************************************** Command Line Arguments ***************************************/
// public class Hello
// {
//     public static void main(String args[]){
//         System.out.println(args);
//         System.out.println(args[0]);
//         System.out.println(args[1]);
//         System.out.println(args[2]);
//         System.out.println(args[3]);
//     }
//     for(int i=0; i<args.length; i++){
//         System.out.println(args[i]);
//     }


// }

/**************************************************** Raper Classes **************************************************/

/** Primitive Type                 Raper Classes */
/** boolean                        Boolean       */
/** byte                           Byte */
/** char                           Char */
/** short                          Short */
/** int                            Integer */
/** long                           Long */
/** float                          Float */
/** double                         Double */

/** Usefull Methods of Rapper Classess */
/** valueOf()  -> Static Method   -> Return Object Reference of relative wrapper class
 *  parseXxx() -> Static Method   -> Xxx can replace by any primitive type  ->  it return Xxx type value
 *  xxxValue() -> Instance Method -> Instance Method of Rapper Class -> xxx can replace by any premitive type -> Return Correseponding premitive type
 */

//  public class Hello
//  {
//     public static void main(String[] args){
//         Integer i = Integer.valueOf("12");
//         System.out.println(i);
//         Double d = Double.valueOf("45.34");
//         System.out.println(d);

//         Integer bi = Integer.valueOf("1010101",2);
//         System.out.println(bi);

//         int x = Integer.parseInt("123");
//         System.out.println(x);
//         int y = Integer.parseInt("34");
//         System.out.println(y);

//         double d1 = Double.parseDouble("343.4343");
//         System.out.println(d1);

//         int temp = i.intValue();
//         double temp_1 = d.doubleValue();
//         System.out.println(temp);
//         System.out.println(temp_1);
//     }
//  }






/********************************************** Static Member Variable ***********************************************/

// class Example
// {
//     int x; /** This Variable Called Instance Variable */
//     static int y; /** Static Member Varaible */

//     public void fun1(){ /** Instance Member Function */
//         // static int x; /** This is Invalid */
//     }

//     public static void func2(){
//         y = 4;
//      } /** Static Member Function */

//     static class Test
//     {
//         public static String country = "India";
//     }
// }

// public class Hello
// {
//     public static void main(String[] args){
//         Example ex1 = new Example();
//         Example ex2 = new Example();
//         Example.y = 34;
//         System.out.println(Example.y);
//         Example.func2();
//         System.out.println(Example.y);
//         System.out.println(Example.Test.country);

//     }
// }



/************************************************ Classes and Object *************************************************/
// class Box {
//     private int length, breadth, height;
//     public void setDimentions(int l, int b, int h){
//         length = l;
//         breadth = b;
//         height = h;
//     }
    
//     public void showDimentions(){
//         System.out.println("Length => " + length);
//         System.out.println("Width => "+breadth);
//         System.out.println("Height => "+height);
//     }
// }

// class Example
// {
//     public static void main(String[] args)
//     {
//         Box box_1 = new Box();
//         box_1.setDimentions(5,6,7);
//         box_1.showDimentions();

//         box_1 = new Box();
//         box_1.showDimentions();

//     }
// }
