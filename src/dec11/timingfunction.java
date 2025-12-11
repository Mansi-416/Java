package dec11;
import java.util.*;
class MYthread extends Thread{
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        for(int i=1;i<5;i++){
            //System.out.println(i + "t1");
            System.out.println("downloading file..."+ (i*20)+ "%");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class timingfunction{
    public static void main(String[] args){
        MYthread t1=new MYthread();
        t1.start();
//            try {
//                t1.join();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
        for(int i=1;i<5;i++) {
            System.out.println("timer " + i);
//        for(int i=0;i<5;i++) {
//            System.out.println(i + "main");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
       }
    }
