package nov26;
import java.util.HashMap;
class Demo1{
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1, 2, 3, 5, 6};
        int target = 9;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
                int complement = target - arr[i];   //complement=8 find this element in array  //calculate the difference with each element of array one by one
                if (map.containsKey(complement)) {
                    System.out.println(map.get(complement)+","+i);
                    break;
                }
                map.put(arr[i], i);
        }
    }
}