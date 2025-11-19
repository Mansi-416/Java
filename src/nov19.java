public class nov19{
    public static void main(String[] args) {
        Animal s1=new Dog();    //uppercasting
        //s1.eat();
        Dog d1=(Dog)s1;      //downcasting
        d1.sleep();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("pizza");
    }
    void data(){
        System.out.println("hii");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("roti");
    }
    void sleep(){
        System.out.println("sleep");
    }
}
