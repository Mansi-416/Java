import java.util.Scanner;
class car{
    String name = "Hello";

    static void Sum() {
        car a=new car();
        System.out.println(a.name);
    }
}
public class nov11 {
    //int a=5;            //instant variable/non-static variable-declared outside method and inside class
    //static int a=5;      //static variable
    /*void Sum() {
        //static int Sum(int a){
        System.out.println("hello");
    }*/

    public static void main(String args[]) {
        //int a=5;      //local variable - cannot be used outside method
        //nov11 obj = new nov11();
        //obj.Sum();//object creation
        //System.out.println(obj.a);   //for non-static/instant variable & static both
        //System.out.println(a);        //for static variable only
        car obj =new car();
        obj.Sum();
    }
}

