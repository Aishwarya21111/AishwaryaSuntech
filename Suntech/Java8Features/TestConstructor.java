package Suntech.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestConstructor {
    public static void main(String[] args) {
        List <String> names= Arrays.asList("Alice","bob","Charlie");
        List<ConstructorRef> students = names.stream().map(ConstructorRef
        ::new).collect(Collectors.toList());
        System.out.println(students);


    }
    
}
