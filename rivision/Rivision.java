/******* Command Line Argumented */

// public class Rivision
// {
//     public static void main(String args[]){
//         for(int i=0;i<args.length;i++){
//             System.out.println(args[i]);
//         }
//     }
// }

/*********** Wrapper Classes In Java *********/
/** The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive. */

/*** Primitive Type                      Wrapper class */
/**  boolean                             Boolean */
/**  char                                Character */
/**  byte                                byte */
/**  short                               Short */
/**  int                                 Integer */
/**  long                                Long */
/**  float                               Float */
/**  double                              Double */

/** Autoboxing */

/*** Usefull Methods of wrapper classes */
/** valueOf()  -> static method -> Return Object Referenced of relative wrapper class */
/** parseXxx() -> static method -> Xxx can be replace by any premitive type -> it return xxx type value */
/** xxxValue() -> Instance Method of wrapper Class ->  Return Corresponding primitive type value*/

// public class Rivision
// {
//     public static void main(String args[]){
//         Integer i = Integer.valueOf(1);
//         Integer j = Integer.valueOf("34");
//         System.out.println(i);
//         System.out.println(j);

//         Double d = Double.valueOf(3.4);
//         Double d_1 = Double.valueOf("3.4");
//         System.out.println(d);
//         System.out.println(d_1);

//         Float f = Float.valueOf(4.5f);
//         Float f_1 = Float.valueOf("4.5");
//         System.out.println(f);
//         System.out.println(f_1);

//         int p_i = Integer.parseInt("123");
//         System.out.println(p_i);

//         float p_f = Float.parseFloat("3.45");
//         System.out.println(p_f);

//         double p_d = Double.parseDouble("3.43434");
//         System.out.println(p_d);

//         int i_i = i.intValue();
//         System.out.println(i_i);

//         double d_i = d.doubleValue();
//         System.out.println(d_i);


//     }

// }





/******** Static Member Of Java *******/

// class Example
// {
//     /** Static Member varaible */
//     public static int a;
//     public static String s1;

//     /** Static Member Function */
//     static void func1(){
//         System.out.println("vishal nagar is working");
//         System.out.println(a);
//         System.out.println(s1);
//     }
    /** Static Member Class */
// d

// public class Rivision
// {
//     public static void main(String args[]){
//         Example.a = 34;
//         Example.s1 = "vishal nagar";
//         Example.func1();
//     }
// }



/** Classes in Java */
/** Syntax of classes in java */
// access_modifier class <class_name>
// {
//     data member;
//     method;
//     constructor;
//     nested class;
//     interface;
// }

/**Components of Java Classes
In general, class declarations can include these components, in order:

Modifiers: A class can be public or has default access (Refer this for details).
Class keyword: Class keyword is used to create a class.
Class name: The name should begin with an initial letter (capitalized by convention).
Superclass (if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
Body: The class body is surrounded by braces, { }. */

// class Student
// {
//     static int count;
//     int id;
//     String name;
//     public static void printcount(){
//         System.out.println(count);
//     }
//     public static void incrasecount(){
//         count = count + 1;
//     }

//     public boolean addStudent(int id,String name){
//         this.id = id;
//         this.name = name;
//         Student.incrasecount();
//         return true;
//     }
//     public void printStudent(){
//         System.out.println(this.id);
//         System.out.println(this.name);
//     }
//     public static void main(String args[]){

//     }
// }

// public class Rivision{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         Student s2 = new Student();
//         s1.addStudent(1,"vishal nagar");
//         s2.addStudent(2, "keshave nagar");
//         Student.printcount();
//         s1.printStudent();
//         s2.printStudent();
//     }
// }


/*** Type Conversion In Java */
/**
 * Datatypes                Bits Required in Memory
 * boolean                  1(bit)
 * byte                     8
 * char                     16
 * short                    16
 * int                      32
 * long                     64
 * float                    32
 * double                   64
 * 
 * Types can automatically change from upper to lower like int can change in doube/float
 * 
 */

// public class Rivision
// {
//     public static void main(String args[])
//     {
//         // boolean a = true;
//         // int b = ;
//         // System.out.println(b);

//         int a = 56;
//         float c = a;
//         System.out.println(a);
//         System.out.println(c);

//         int k = (int)c;
//         System.out.println(k);

//         String str1 = "343";
//         int p = (int)str1;


//     }
// }




/**** Data Types in Java */
// public class Rivision
// {
//     public static void main(String args[]){
//         /* Premitive Type -> boolean, char, byte, short, int, long, float, double */
//         /* Not Premitive  -> String, Array */
//         short s = 10000; short r = -5000;
//         System.out.println(s);
//         System.out.println(r);
//     }
// }

/**** Print Hello Wrold In Java */
// public class Rivision
// {
//     public static void main(String args[]){
//         System.out.println("Hello Wrold");
//     }
// }