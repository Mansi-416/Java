//1.
/*abstract class shape{
    abstract void area();
}
class circle extends shape{
    int r;
    circle(int r){
        this.r=r;
    }
    void area(){
        double res=3.14*r*r;
        System.out.println("Area of circle is "+res);
    }
}
class rectangle extends shape{
    int l;
    int b;
    rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void area(){
        double res=l*b;
        System.out.println("Area of rectangle is "+res);
    }
}
public class abstractquestions{
    public static void main(String[] args) {
        circle c1=new circle(5);
        rectangle r1=new rectangle(10,20);
        c1.area();
        r1.area();
    }
}*/


//2.
abstract class animal{
    abstract void Sound();
}
class dog  extends animal{
    void Sound(){
        System.out.println("Bark!!!!");
    }
}
class Cat2 extends animal{
    void Sound(){
        System.out.println("Meow..");
    }
}
public class abstractquestions{
    public static void main(String[] args) {
        dog d1=new dog();
        Cat2 c1=new Cat2();
        d1.Sound();
        c1.Sound();
    }
}