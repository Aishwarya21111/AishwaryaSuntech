package Suntech.Java8Features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiAll {
    public static void main(String[] args) {
        //bipredicate
        BiPredicate <Integer , Integer> bp = (x,y) -> x % 2 ==0 && y%2==0;
        System.out.println(bp.test(4, 6));
        BiPredicate <String , Integer> bx = (str,y) -> str.length() == y;
        System.out.println(bx.test("aish", 4));

        //bifunction
        BiFunction <String,String,Integer> bf = (x,y) -> x.length()+y.length();
        System.out.println(bf.apply("hi","hello"));

        //Biconsumer
        BiConsumer <Integer,Integer> bc = (x,y) ->{
            System.out.println(x+y);

        };
        bc.accept(4, 5);

        //BiSupplier is not possible as we cannot return 2 values
        


    }
}
