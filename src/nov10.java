public class nov10{
    public static void main(String[] args) {
        /*String str="hello";
        String str1="";
        for(char ch:str.toCharArray()){
            str1=str1+ch;
        }*/
        /*StringBuilder str=new StringBuilder("hello"); //string is mutable
        //1.APPEND
        str.append("byee");
        System.out.println("append():"+str);
        //2.Insert
        str.insert(1,"byee");
        System.out.println("insert():"+str);

        //3.Replace
        str.replace(1,4,"JAVA");
        System.out.println("replace():"+str);

        //4.Delete
        str.delete(1,4);
        System.out.println("delete():"+str);

        //5.DeleteCharAt
        str.deleteCharAt(3);
        System.out.println("deleteCharAt():"+str);

        //6.reverse
        str.reverse();
        System.out.println("reverse():"+str);

        //7.length
        str.length();
        System.out.println("length():"+str);

        //8.Capacity
        str.capacity();
        System.out.println("capacity():"+str);*/


        //"i love java"="i evol avaj";
        /*String str="i love java";
        String a[]=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String s:a){
            StringBuilder data=new StringBuilder(s);
            result.append(data.reverse()).append(" ");
        }
        System.out.println(result);*/

        //compress aabbc as a2b2c1
        String str="aabbc";
        StringBuilder result=new StringBuilder();
        int count=1;   //means there is atleasr 1 element
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println(result);
    }
}