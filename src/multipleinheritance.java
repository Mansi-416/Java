/*class A{
    void eat(){
        System.out.println("pizza");
    }
}
class B{
    void eat(){
        System.out.println("burger");
    }
}
class C extends A,B{          // non-working becoz when we extend a and b together the compiler is confused

}
class multipleinheritance{
    public static void main(String[] args) {

    }
}*/




//To make multiple inheritance workable
//Interface-body is not declared;constructor cannot not created

interface A1{
    void login();    //by default local and is abstract
}
interface B1{
    void login();
}
class C implements A1,B1{
    public void login(){
        System.out.println("Hellooo");
    }
}
public class multipleinheritance {
    public static void main(String[] args) {
        C c=new C();
        c.login();
    }
}