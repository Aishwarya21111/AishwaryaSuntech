package Suntech.Searching;
import java.util.Scanner;


public class LinearSearch {
      public static int search(int A[],int n){
    for(int i =0; i<A.length;i++){
        if(A[i] == n){
            return i;
        }
    }
    return -1 ;
}
    
    public static void main(String[] args) {
        int A[] = {4,12,22,10,78,16,3};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check the index of");
        int n = sc.nextInt();
        System.out.println(search(A,n));

    }
    
}
