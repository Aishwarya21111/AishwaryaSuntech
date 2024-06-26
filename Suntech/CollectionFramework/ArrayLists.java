package Suntech.CollectionFramework;
import java.util.*;
import java.util.stream.Collector;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> List1 = new ArrayList<Integer>();
        ArrayList <Integer> List2 = new ArrayList<>();
        ArrayList<Boolean> List3 = new ArrayList<>();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List2.add(3);
        List2.add(5);
        List2.add(4);
        System.out.println(List1);
        int element = List1.get(2);
        System.out.println(element);
        List1.add(1,6);
        System.out.println(List1);
        List1.add(2,4);
        System.out.println(List1);
        List1.add(0,9);
        System.out.println(List1);
        List1.remove(2);
        System.out.println(List1);
        System.out.println(List1.size());
        for(int i =1 ;i<List1.size();i++){
            System.out.println(List1.get(i));
        }
        Collections.sort(List1);
        System.out.println(List1);
        List1.addAll(List2);
        System.out.println(List1);

    }
    
}
