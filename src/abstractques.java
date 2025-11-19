//1.
abstract class shape{
    abstract void area();
}
class circle extends shape{
    void area(){
        System.out.println("Area:12.56 sq.m");
    }
}
class rectangle extends shape{
    void area(){
        System.out.println("area:14 sq.m");
    }
}
public class abstractques{
    public static void main(String[] args) {
        circle c = new circle();
        rectangle r = new rectangle();
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