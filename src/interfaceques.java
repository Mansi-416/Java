/*Q1. Create two interfaces Walkable and Runnable.
Each should have a method: walk() and run() respectively.
Then, create a class Human that implements both interfaces and defines both methods.
Create a main method where an object of Human is created and both methods are called.*/
/*interface Walkable{
    void walk();
}
interface Runnable{
    void run();
}
class Human implements Walkable,Runnable{
    public void walk(){
        System.out.println("walk");
    }
    public void run(){
        System.out.println("run");
    }
}
class interfaceques{
    public static void main(String[] args) {
        Human h = new Human();
        h.walk();
        h.run();
    }
}*/


//Q2. Create two interfaces A and B. Both interfaces should have a method named display().
//Then, create a class Demo that implements both interfaces.
//Implement the display() method and call it in the main method using a Demo object.
/*interface A{
    void namedisplay();
}
interface B{
    void namedisplay();
}
class Demo implements A,B{
    public void namedisplay(){
        System.out.println("Mansi");
    }
}
public class interfaceques {
    public static void main(String[] args) {
        Demo c=new Demo();
        c.namedisplay();
    }
}*/



////Q3. Create an interface Animal with a method makeSound().
////Then, create a class Dog that implements Animal and overrides makeSound() to print "Bark".
////In the main method, use the interface reference to call the method from Dog.
///*interface animal{
//    void makesound();
//}
//class dog implements animal{
//    public void makesound(){
//        System.out.println("Bark");
//    }
//}
//public class interfaceques {
//    public static void main(String[] args) {
//        animal a=new dog();
//        a.makesound();
//    }
//}*/
//


//Q4. Create an interface Shape with a method area().
//Then, create a class Circle that implements Shape and calculates the area using radius = 5.
//Print the area in the main method.
/*interface Shape {
    void area();
}
class Circle implements Shape {
    int r;
    public Circle(int r) {
        this.r = r;
    }
    public void area(){
        double res=3.14*r*r;
        System.out.println("Area of circle:"+res);
    }
}
public class interfaceques {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        c.area();
    }
}*/


//Q5. Create an interface Vehicle with a default method start() that prints "Vehicle is starting...".
//Create a class Car that implements Vehicle.
//Call the default method from an object of Car in the main method.
interface Vehicle{
    default void start(){
        System.out.println("Vehicle is starting...");
    }
}
class Car implements Vehicle{
    public void pop(){
        System.out.println("Car is starting...");
    }
}
public class interfaceques{
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
    }
}
