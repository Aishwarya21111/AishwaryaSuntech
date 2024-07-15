package Suntech.Java8Features;

import java.util.Arrays;
import java.util.*;

public class Methodref {
    public static void main(String[] args) {
        Methodref ref = new Methodref();
        List <String> ls = Arrays.asList("Sakshi","Daksh","Yash","Shiv","Sujal");
        ls.forEach(ref::print);

    }
    public void print(String s){
        System.out.println(s);
    }
}
