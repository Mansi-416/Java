abstract class Animal1{
abstract void eat();
}
class Cat1 extends Animal1{
    void eat(){
        System.out.println("kitkat");
    }
}
class abstraction{
     public static void main(String[] args){
         Cat1 c=new Cat1();
         c.eat();
     }
}

