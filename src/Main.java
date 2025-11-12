import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        //System.out.println("Setup Successsful");
        /*byte a=15;
        short b=10;
        int c=200;
        float d=1.25f;
        char e='A';
        long f=1234567890;
        boolean g=true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);*/


        //Odd Even
        /*int a=29;
        if(a%2==0){
            System.out.println("Even number");
        }
        else
            System.out.println("Odd number");*/


        //Grading System
        /*int m=68;
        if(m>=90){
            System.out.println("Grade=A");
        }
        else if(m>=80){
            System.out.println("Grade=B");
        }
        else if(m>=70){
            System.out.println("Grade=C");
        }
        else if(m>=60){
            System.out.println("Grade=D");
        }
        else if(m>=50){
            System.out.println("Grade=E");
        }
        else
            System.out.println("Grade=F");*/


        /*int n=5;
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        for(int j=n;j>=1;j--){
            System.out.println(j);
        }*/


        //Sum of digits
        /*int k = 134, sum = 0;
        while (k > 0) {
            int lastdigit = k % 10;
            sum = sum + lastdigit;
            k = k / 10;
        }
        System.out.println(sum);*/
        /*for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
         */
        Scanner sc=new Scanner(System.in);
        System.out.print( "enter integer:");
        int a=sc.nextInt();
        System.out.print("enter double:");
        double b=sc.nextDouble();
        System.out.print("enter single word:");
        String c=sc.next();
        sc.nextLine();
        System.out.print( "enter full line:");
        String d=sc.nextLine();
        System.out.println("Integer:"+a);
        System.out.println("Double:"+b);
        System.out.println("Word:"+c);
        System.out.println("Full word:"+d);
        }
    }

