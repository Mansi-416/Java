package dec8;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class listIterator{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator<Integer> it=list.listIterator();
        /*while(it.hasNext()){
            Integer x=it.next();
            System.out.println(x);
        }
        while(it.hasPrevious()){
            Integer y=it.previous();
            System.out.println();
            System.out.print(y);
        }*/

        /*while(it.hasNext()){
            Integer x=it.next();
            if(x==7){
                //it.add(10);  //it adds the no.after the given no.
                it.set(10);    //it replaces the number
            }
        }*/


        //replace odd no. with -1
        while(it.hasNext()){
            Integer x=it.next();
            if(x%2!=0){
                it.set(-1);
            }
        }
        System.out.println(list);
    }
}