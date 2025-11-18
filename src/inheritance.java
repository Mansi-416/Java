//Single level
/*class Employee{
  void work(){

      System.out.println("Employee is working");
  }
}
class Manager extends Employee{
  void attendMeeting(){

      System.out.println("Manager is attending the meeting");
  }
}
public class inheritance{
  public static void main(String[] args) {
    Manager m = new Manager();
    m.work();
    m.attendMeeting();}
}*/


//Multilevel inheritance
/*class Person{
    void displayName(){
        System.out.println("Name:Mansi");
    }
}
class Student extends Person{
    void displayClass(){
        System.out.println("Class:W1");
    }
}
class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("Students are disciplined");
    }
}
public class inheritance{
    public static void main(String[] args) {
        Monitor m = new Monitor();
        m.displayName();
        m.displayClass();
        m.checkDiscipline();
    }
}*/


//Single-level inheritance
/*class Shape{
    void draw(){
        System.out.println("Draw the shape");
    }
}
class Circle extends Shape{
    void calculateArea(int r){
        System.out.println("Area of circle:"+3.14*r*r);
    }
}
public class inheritance{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
        c1.calculateArea(4);

    }
}*/


//Multi-level inheritance
/*class Device{
    void powerOn(){
        System.out.println("Power On");
    }
}
class laptop extends Device{
    void boot(){
        System.out.println("Laptop is booting");
    }
}
class GamingLaptop extends laptop{
    void startGame(){
        System.out.println("start gaming on laptop");
    }
}
public class inheritance{
    public static void main(String[] args) {
        GamingLaptop g=new GamingLaptop();
        g.powerOn();
        g.boot();
        g.startGame();
    }
}*/


//Single-level inheritance
class Book{
    void read(){
        System.out.print("read the book");
    }
}
class Novel extends Book{
    void storyLine(){
        System.out.print("\nNovel has a good story line");
    }
}
public class inheritance{
    public static void main(String[] args){
        Novel n=new Novel();
        n.read();
        n.storyLine();
    }
}