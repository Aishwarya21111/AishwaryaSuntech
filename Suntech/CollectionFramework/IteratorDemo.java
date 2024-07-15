package Suntech.CollectionFramework;
import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        List <String> List1 = new ArrayList<>();
        List1.add("mango");
        List1.add("Orange");
        List1.add("Apple");
        List1.add("banana");

        Iterator <String> I = List1.iterator();
        while (I.hasNext()) {
            System.out.println("iterator "+I.next());
            
        }
    }
}
