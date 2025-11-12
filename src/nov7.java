import java.util.Arrays;

public class nov7{
    public static void main(String[] args) {

        //1.Duplicate String
        /*String str = "hello";
        String newstr="";
        for(char ch:str.toCharArray()){
            if(newstr.indexOf(ch)==-1) {
                newstr+=ch;
            }
        }
        System.out.println(newstr);*/


        //2.Frequency String
        /*int freq[]=new int[258];
        String str = "apple";
        for(char ch:str.toCharArray()){
            freq[ch]++;
        }
        for(int i=0;i<258;i++){
            if(freq[i]>0){
                System.out.println((char)i +"->"+freq[i]);
            }
        }*/


        //3.from a sentence print the larger word
        /*String str = "Java is programming language";
        String a[] = str.split(" ");
        String largest = "";
        for (String s : a) {
            if (s.length() > largest.length()) {
                largest=s;
            }
        }
        System.out.println(largest);*/



        //4.Count the words in sentence
        /*String str = "java is a programming language";
        String []ch=str.split(" ");
        int count=0;
        for(String s:ch){
            count++;
        }
        System.out.println(count);*/



        //5.Anagram String
        String str1="hello";
        String str2="lloeh";
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str3=new String(ch1);
        String str4=new String(ch2);
        if(str3.equals(str4)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}