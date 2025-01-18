/** this keyword */
/** The this is object reference is a local variable in instance member function/methods reffering the caller object */
/** this keyword is used as a reference to the current object which is an instance of current class */
/** If a method need to pass current object to another method, it can do using the this reference */
/** Note - this reference cann't use in static context , as static code can't executed in the  context of any object  */


class box 
{
    private int l,b,h;
    public void setDimension(int l,int b,int h){ // instance member function
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public void showDimension(){
        System.out.println(this.l);
        System.out.println(this.b);
        System.out.println(this.h);

    }
    public void sendbox(){
        // GiftTaker g1 = new GiftTaker();
        // g1.acceptGift(this)
    }
}

public class This
{
    public static void main(String args[]){ //static member function
        box b1 = new box();
        b1.setDimension(3,4,5);
        b1.showDimension();
        b1.sendbox();
        
    }
}