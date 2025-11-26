package nov26;
import java.util.HashMap;
class Demo {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        /*map.put(1,20);
        map.put(2,30);
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(3,6));   // output 6 kyunki key 3 ni hai
        System.out.println(map.containsKey(3));   //output false
        for(int x:map.keySet()){
            System.out.println(map.get(x));
        }*/


        //frequency count
       /* int arr[]={1,2,3,4,5,2,4,1,1};
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);*/


        //first non-repeating character
        String str = "abcbaba";
        //frequency count
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        //non-repeating character
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("Non-repeating character:"+ch);
                break;     //if we want to get multiple non-repeating characters just remove break
            }
        }
    }
}