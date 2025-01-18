package Inheritance;

/** In the Java Programming Langulage, each class allowed to have one direct super class, and each super class has the potential for an unlimited number of subclass */
/** Private Member of super class is not accessble by the child/subclass can only be indirectly be access */
/** Member that have default accessibility in the super class , are also not accessible by the subclass, in other packges */



public class Example {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setRollno(100);
        s1.setName("Rahul");
        s1.setAge(18);
        System.out.println(s1.getAge());
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}

