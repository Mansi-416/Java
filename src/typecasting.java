public class typecasting {
    public static void main(String[] args) {
        //byte a=5;
        //short b=a;             //automatic typecasting/int c=b;
        //short a=13;
        //byte b = (byte) a;
        //System.out.println(b);  //in forceful typecasting there are chances of data lost

        //to create a string
        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }


        //to reverse a string
        String str1 = "hello";
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.println(str1.charAt(i));
        }

        //Palindrome string
        String str2 = new String("hello");
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}

