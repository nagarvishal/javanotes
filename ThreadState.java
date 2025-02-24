/** A Java thread is always in one of several states which could be running sleeping , dead etc. */

/**
 * States : 
 * New thread
 * Runnable
 * Not Runnable
 * Dead
 */

 /**
  * A Thread become not Runnable when one of the following four events occurs:
  * When sleep() method is invoked and it sleeps for a specified amount of time.
  * when suspend() method is invoked.
  * When the wait() method is invoked and the thread wait() method is invoked of a free resource or waits for the completion of another thread or wait to acuqire a loc of an object.
  * The Has Been put in sleep , then the specified number of millisecond must elaps (or it must be interruped).
  * if a thred has been suspended , then its resume() mehtod must be invoked.
  * if a thread is waiting on a condition variable , whatever object owns the variable must reliquiesh it by calling either notify() or notifyAll()
  * If a thread blocked by I/O then the I/O must be compelete.
  */
  /**
   * 
   */

   /**
    * room paint
    * root area
    * color/texture
    * price
    * 
    */
public class ThreadState {

}
