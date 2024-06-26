package Suntech.Searching;
import java.util.Scanner;

public class BinarySearch {
    public static int bs(int A[],int n){
        int left =0;
        int right = A.length -1;
        while (left<=right) {
            int mid = (left +right) /2;
            if(A[mid]== n){
                return mid;
            }
            else if(A[mid]<n){
                left = mid+1 ;     
            } 
            else{
                right = mid-1;   
             }

        }
        return -1;



    }
    public static void main(String[] args) {
        int A[]={3,7,10,23,32,38,45,56,79,81,91,100};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you are searching for");
        int n = sc.nextInt();
        System.out.println(bs(A, n));


    }
}
