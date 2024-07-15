package Suntech.Java8Features;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 

public class Stream2 {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,2,4,3,4,5,6,9);
        //filter
        List<Integer> FilteredList = list.stream().filter(x-> x%2 == 0).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(FilteredList);
        //Function
        List<Integer> MapedList = FilteredList.stream().map(x -> x/2).collect(Collectors.toList());
        System.out.println(MapedList);
        //distinct and sorted
        List<Integer> Distinctop = FilteredList
        .stream()
        .distinct()
        .sorted((a,b) -> b-a)
        .limit(2)
        .collect(Collectors.toList());
        System.out.println(Distinctop);

        List<Integer> tp = Stream.iterate(0, x->x+1)
        .limit(101)
        .skip(0)
        .filter(x -> x%2==0)
        .map(x->x/10)
        .peek(x -> System.out.println(x))
        //.max((a,b) -> a-b).get()
        .collect(Collectors.toList());
        
        System.out.println(tp);

        //parallelstream does same operations as main stream it just breaks the big list into chunks and the processes it 
        //thus multithreading
        //use only in the case where the list is very long

        List<Integer> asList = Arrays.asList(1,2,3,4,5);
        asList.parallelStream();

        



    }
}
