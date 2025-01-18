/** Final Instance Variable - 
 * A Java Variable can be decared using the keyword final. Then the final keyword can be assigned only once
 * A Variable that is declared as final and not initialized is called a blank final variable.A blank final variable forces
 * either the constructor to initialize it or initialization block to do this job.
 * only one time can be initialized.
 */

 /** Final Static Varaible - 
  * Static Member Varaible when qualifies by final keyword, it will become blank until initialized
  * Final Static Varaible can be initialized during declaration or within static block. one time initialized happend.
  */

  /** Final Local Varaible - 
   * Local Variable that are final must be initialized before it use. But you should remember this rule is also application for non final local varaible alos.
   * Once they are initialized, can't not be altered.
   */

/** Final Class - 
 * Java classes decalired as final cannot be extended. Restricted Inheritance
 */

 /** Final Method - 
  * Methods declared as final cannot be overriden.
  */

  class Dummy
  {
    final public void sumFunction(){

    }
  }
  class MoreDummy extends Dummy
  {
    public void sumFunction(){

    }
  }


//  final class dummy { /** now we can't any sublcass of dummy */

//  }

public class Final {
    private final int x; /** this is called final instance member variable */
    // {
    //     x = 5;
    // }

    private final static int z; /** this is called final static varaible */
    static
    {
        z = 56;
    }
    Final(){
        this.x = 34;
    }

    public void func(){
        final int k;
        k = 30;


    }
    public static void main(String args[]){
        Final e1 = new Final();

    }   
}
