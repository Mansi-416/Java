/*package dec10;
import java.io.File;
import java.io.FileWriter;

public class FileSystem{
    public static void main(String[] args){
        //writeData("hellooo old data");
        File file=new File("New.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created: "+file.getName());
                System.out.println("File created: "+file.getAbsolutePath());
            }
            else{
                System.out.println("File already existsss");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}*/

package dec10;
//import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileSystem {
    static void writeData(String data) {
        try {
            FileWriter writer = new FileWriter("New.txt",true);
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    static void fileRead(){
        try{
            FileReader reader=new FileReader("New.txt");
            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
        }catch(Exception e){
            System.out.print(e);
        }
    }
    /*static void fileDelete() {
        try {
            File file=new File("New.txt");
            if(file.delete()){
                System.out.println("file deleted");
            }
            else{
                System.out.println("file not deleted");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
    static void deleteData(){
        try {
            FileWriter writer = new FileWriter("New.txt");
            writer.write(" ");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        writeData("hello old data");
        fileRead();
        //fileDelete();
        deleteData();
    }
}