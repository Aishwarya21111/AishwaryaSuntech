package Suntech.CollectionFramework;
import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque <Integer> aq = new ArrayDeque<>();
        aq.offer(20);
        aq.offerLast(30);
        aq.offerFirst(10);
        System.out.println(aq);
        System.out.println(aq.pollFirst());
        System.out.println(aq.peekFirst());
        
    }
}
