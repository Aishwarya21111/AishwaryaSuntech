 package Suntech.Java8Features.comparator;
 import java.util.*;

public class Comparators {
    public static void main(String[] args) {
        
    
    List <Integer> l = new ArrayList<>();
  
   l.add(23);
   l.add(11);
   l.add(41);
   l.add(1);
   l.add(4);
   Collections.sort(l,(a,b)->b-a);
   System.out.println(l);



    }
    
}