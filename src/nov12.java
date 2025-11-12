
class Car{
    int a;
    String name;
    //Car()          //Default Constructor
     Car(int a,String name){     //Parameterized Constructor
         this.a=a;     //this- points to instant variable
         this.name=name;
        System.out.println("Name:"+" "+name);
        System.out.println("a:"+" "+a);
    }
}
public class nov12
{
	public static void main(String[] args)
	{
        //Car c=new Car();
        Car c=new Car(5,"Mansi");
        Car c1=new Car(10,"xyz");
       /* System.out.println(c.a);
        System.out.println(c.name);
        System.out.println(c1.a);
        System.out.println(c1.name);*/
    }
}