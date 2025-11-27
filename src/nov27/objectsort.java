//rollno wise sorting
package nov27;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//if negative value the object is sorted else not
class Student implements Comparable<Student>{
    String name;
    int RollNo;
    public Student(String name, int RollNo){
        this.name = name;
        this.RollNo = RollNo;
    }
    public int compareTo(Student s1){
        return this.RollNo - s1.RollNo;
    }
    public String toString(){
        return this.name + " " + this.RollNo;
    }
}
class objectsort{
    public static void main(String args[]){
       ArrayList<Student> list = new ArrayList<>();
       list.add(new Student("Mansi",2));
       list.add(new Student("Chhavi",1));
       Collections.sort(list);
        System.out.println(list);
    }
}