package Suntech.Java8Features;

import java.util.function.Supplier;

public class Supplier8 {
    public static void main(String[] args) {
        Supplier <Integer> supp = () -> 1;
        System.out.println(supp.get());
    }
    
}
