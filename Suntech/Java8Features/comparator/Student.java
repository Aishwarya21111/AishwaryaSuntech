package Suntech.Java8Features.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    public Integer id;
    public String Name;
    public Student(Integer id , String Name){
        this.id = id;
        this.Name = Name;
    }
    public String toString(){
        return this.id +":"+this.Name;
    }
    public static void main(String[] args) {
        Student s1 = new Student(21, "raj");
        Student s2 = new Student(1, "Anuj");
        Student s3 = new Student(45, "Aishwarya");
        List <Student> l1 = new ArrayList<>();
        l1.add(s3);
        l1.add(s1);
        l1.add(s2);
        Collections.sort(l1,(a,b) -> b.id-a.id);
        System.out.println(l1);
        

    }
}
