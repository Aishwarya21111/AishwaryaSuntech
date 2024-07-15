package Suntech.Java8Features;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class Stream1 {
    public static void main(String[] args) {
        
    
    //imperitive approch
    int arr1[] = {1,2,3,6,5};
    int sum =0 ;
    for(int i = 0 ;i<arr1.length;i++){
        sum+= arr1[i];
    }

    //stream
    int arr2[] = {1,2,3,4,5,6,8};
    int sum2 = Arrays.stream(arr2).filter( x -> x%2 ==0).sum();

    //stream of list
    List <String> ls = Arrays.asList("aishwarya","charls","yash","vipul");
    Stream<String> myStream = ls.stream();

    //if we dont want to mention if it is a list or am array
    Stream<Integer> IntegerStream = Stream.of(1,2,3,4,5);

    //iterate
    Stream<Integer> newList = Stream.iterate(0, n -> n+1).limit(100);

    //genrate
    System.out.println(Stream.generate(() -> "hello").limit(4));




    

}
}