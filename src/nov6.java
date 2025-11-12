import java.util.Arrays;

public class nov6{
	public static void main(String[] args){
        //String str="hello";
        //String str=new String("hello");
        /*System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));
        System.out.println(str.indexOf(str));*/

        //String str1="hello";
        /*String str1=new String("hello");
        System.out.println(str==str1);
        System.out.println(str.equals(str1));*/


        //2.Palindrome string
        /*String a="abc";
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        if(a.equals(b)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }*/

        //3.Split the string
        /*String str = "java  cpp  c  php  js";
        //String a[]=str.split(" ");
        String a[]=str.split("");
        for(String s:a){
            System.out.println(s);
        }
        //System.out.println(a[0]);*/


        //4.Vowel count
        String str = "java";
        int v=0;
        for(char ch:str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                v++;
            }
        }
        System.out.println(v);
    }
}