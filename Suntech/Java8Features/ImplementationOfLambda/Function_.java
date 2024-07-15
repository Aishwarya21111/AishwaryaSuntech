package Suntech.Java8Features.ImplementationOfLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_ {public static void main(String[] args) {
    Function <String , Integer> function = x-> x.length();
    System.out.println(function.apply("hello"));
    Function <String , String> function2 = x-> x.substring(0, 3) ;
    System.out.println(function2.apply("hello"));
    Function<List<Student2>, List<Student2>> studentVipPrefix = li -> {
        List<Student2> result = new ArrayList<>();
        for (Student2 s : li) {
            if (function2.apply(s.getName()).equalsIgnoreCase("Vip")) {
                result.add(s);
            }
        }
        return result;
    };
  Student2 s1 = new Student2(2,"aish");
  Student2 s2 = new Student2(3, "Vipul");
  Student2 s3 = new Student2(4, "Viral");
  Student2 s4 = new Student2(5, "Vipinl");
  Student2 s5 = new Student2(6, "Viplav");
  List<Student2> StudentsList= Arrays.asList(s1,s2,s3,s4,s5);
  studentVipPrefix.apply(StudentsList);
  System.out.println(StudentsList);


  
}
    
}
class Student2 {
    int id;
    String name;

    // Constructor to initialize id and name
    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student2 [id=" + id + ", name=" + name + ", toString()=" + super.toString() + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
