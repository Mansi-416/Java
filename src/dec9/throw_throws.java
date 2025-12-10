package dec9;
class throw_throws {
    public static void main(String[] args) {
        /*try {
            voteAge(15);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            voteAge(19);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        static void voteAge ( int age){
            System.out.println("check for vote");
            if (age < 18) {
                throw new IllegalArgumentException("you can't vote");
            }*/


        try{
            riskyMethod();
        }
        catch(Exception e){
            System.out.println("main handels this");
        }
        System.out.println("Program Continue...");
        }
        static void riskyMethod() throws ArithmeticException{
            System.out.println("riskyMethod start");
            int result=10/0;
            System.out.println("Result:"+result);
            System.out.println("riskyMethod end");
        }
    }