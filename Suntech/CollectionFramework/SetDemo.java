package Suntech.CollectionFramework;
import java.util.*;;
public class SetDemo {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        Set <Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set1.add(29);
        set1.add(1);
        set1.add(40);
        set2.add(2);
        set2.add(11);
        set2.add(45);
        set2.add(66);

        set.remove(10);

        System.out.println(set); 
        System.out.println(set1);
        System.out.println(set2);
        
    }
}
