class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("roti");
    }
}
class methodoverriding{
    public static void main(String[] args) {
        Animal s1=new Dog ();
        s1.eat();
    }
}