package Suntech.Java8Features.comparator;

import java.util.Set;
import java.util.TreeSet;

public class SetComparator {
    public static void main(String[] args) {
        //without sorting
        Set <Integer> s = new TreeSet<>();
        s.add(12);
        s.add(1);
        s.add(21);
        s.add(34);
        s.add(4);
        System.out.println(s);

        //with comparator
        Set <Integer> ss = new TreeSet<>((a,b)->b-a);
        ss.add(12);
        ss.add(1);
        ss.add(21);
        ss.add(34);
        ss.add(4);
        System.out.println(ss);
       

    }
}
