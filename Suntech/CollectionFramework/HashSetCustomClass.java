package Suntech.CollectionFramework;
import java.util.*;
 class Student{
    int roll_no;
    String name;
    public Student(int roll_no,String name){
        this.roll_no =roll_no;
        this.name =name;


    }
    //write equals and hash code method to differentiate
    public String toString(){
        return "Student{ " +"roll_no "+roll_no +" Name "+ name +'\'' +"}";
    }
 }
public class HashSetCustomClass {
    public static void main(String[] args) {
        Set <Student> st = new HashSet<>();
        st.add(new Student(12,"aishwarya" ));
        st.add(new Student(12, "ravi"));
        System.out.println(st);

        
    }
}
