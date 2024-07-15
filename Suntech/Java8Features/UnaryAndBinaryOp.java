package Suntech.Java8Features;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOp {
    public static void main(String[] args) {
        //unary op extends function
        UnaryOperator <Integer> u = x -> x*x;
        System.out.println(u.apply(4));
        //binary op extends Bifunction
        BinaryOperator <Integer> bo = (x,y) -> x*y;
        System.out.println(bo.apply(2,3));

    }
    
}
