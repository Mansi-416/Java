//1.Create an abstract class 'shape' with an abstract method 'area()'.Implement two subclasses
abstract class shape{
    abstract void area();
}
class circle extends shape{
    int r;
    public circle(int r){
        this.r=r;
    }
    void area(){
        double result=3.14*r*r;
        System.out.println("The area of the circle is "+result);
    }
}
class rectangle extends shape{
    int l;
    int b;
    public rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void area(){
        int result=l*b;
        System.out.println("The area of the rectangle is "+l);
    }
}
public class abstractques{
    public static void main(String[] args) {
        circle c = new circle(4);
        rectangle r = new rectangle(3,5);
        c.area();
        r.area();
    }
}


//2.
/*abstract class Animal2{
    abstract void sound();
}
class Dog1{
    void sound(){
        System.out.println("bark");
    }
}
class Cat2{
    void sound(){
        System.out.println("meow");
    }
}
public class abstractques {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        Cat2 c2 = new Cat2();
        c2.sound();
        d1.sound();
    }
}*/
