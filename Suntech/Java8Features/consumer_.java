package Suntech.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer_ {
    public static void main(String[] args) {
        Consumer <String> c = (s) -> System.out.println(s);
        c.accept("Jai hind");
        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer i : li) {
                System.out.println(100 * i);
            }
        };
        Consumer<List<Integer>> listConsumer2 = li -> {
            for (Integer i : li) {
                System.out.println(100 * i);
            }
        };
        listConsumer.accept(Arrays.asList(1,2,3,4,5));
        listConsumer.andThen(listConsumer2).accept(Arrays.asList(1,2,3,4,5));


    }
}
