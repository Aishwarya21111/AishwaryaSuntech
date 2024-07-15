package Suntech.Java8Features;

import java.util.function.Function;

public class Chaining {
    public static void main(String[] args) {
        Function <String ,String> f1 = s ->s.toUpperCase();
        Function <String ,String> f2 = s -> s.substring(0,3);
         System.out.println(f1.andThen(f2).apply("aishwarya"));
         System.out.println(f1.compose(f2).apply("Virat"));
         System.out.println(Function.identity().apply("India"));
      

    }
}
