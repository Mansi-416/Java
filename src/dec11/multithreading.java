//join method blocks the other thread
package dec11;
import java.util.*;
class MythreadDemo extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i + "t1");
            //System.out.println(i + "t2");
        }
    }
}
class multithreading{
    public static void main(String[] args){
        MythreadDemo t1=new MythreadDemo();
        //MythreadDemo t2=new MythreadDemo();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        //t2.start();
        for(int i=0;i<5;i++) {
            System.out.println(i + "main");
            //System.out.println(Thread.currentThread().getName());
        }
//        try{          //to print the main part 1st
//            t1.join();
//        }catch(Exception e){
//            System.out.println(e);
//        }
    }
}