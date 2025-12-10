//try and catch cannot be used together
//we cannot use if-else instead of try-catch
package dec9;
import java.util.Scanner;
public class trycatchfinally {
    public static void main(String[] args){
        System.out.println("hellloo");
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the number:");
            int a=sc.nextInt();
            System.out.println("Enter the number:");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("Result:"+c);
            /*int a=5;
            int b=0;
            int c=a/b;
            System.out.println(c);*/
            /*int arr[]={1,2,3};
            System.out.println(arr[3]);*/
            /*String str=null;
            System.out.println(str);*/
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            System.out.println("hameshaaa chalenge hummmmm");
        }
        System.out.println("byeee!!!!");
    }
}
