package dec8;
import java.util.*;

public class ques {
    public static void main(String[] args) {
        /*ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int mid= list.size()/2;
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext() && it.nextIndex()<=mid){
            Integer x=it.next();
            System.out.println(x);
        }
        System.out.println();
        while(it.hasPrevious()){
            Integer y=it.previous();
            System.out.println(y);
        }*/


        //replace the negative values with positive
        /*ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        list.add(4);
        list.add(-7);
        list.add(2);
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            Integer x=it.next();
            if(x<0){
                it.set(x*(-1));
            }
        }
        System.out.println(list);*/


        //move forward until the target and move backward and remove all the elements less than target
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(10);
        int t = 14;
        ListIterator<Integer> it = list.listIterator();
            while (it.hasNext()) {
                Integer x=it.next();
                if(x==t){
                    break;
            }
                System.out.println(x);
        }
        while(it.hasPrevious()){
            Integer y=it.previous();
            if(y<t){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
