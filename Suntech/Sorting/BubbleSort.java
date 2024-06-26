package Suntech.Sorting;
import java.lang.reflect.Array;
import java.util.Scanner;

public class BubbleSort {
    public static void bubble(int A[]){
        for(int i =0;i<A.length-1;i++){
            for(int j=0 ; j<A.length-i-1;j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bubble sort");
        int A[] ={ 2,33,12,46,78,11,1,49,31,44,66,99};
        bubble(A);
        for(int i:A){
            System.out.print(i+" ");
        }

    }
}
