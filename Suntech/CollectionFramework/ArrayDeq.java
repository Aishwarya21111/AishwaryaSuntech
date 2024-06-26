package Suntech.CollectionFramework;
import java.util.*;
public class ArrayDeq {
    public static void main(String[] args) {
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        stack.push(23);
        stack.push(30);
        stack.push(100);
        System.out.println(stack);
        System.out.println(stack.peek());

    }
    
}
