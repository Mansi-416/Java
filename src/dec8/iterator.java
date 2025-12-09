//iterator works only on lists
package dec8;
import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            Integer x=it.next();
            System.out.println(it.next());
            if(it.next()==6){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
