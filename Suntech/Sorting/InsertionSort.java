package Suntech.Sorting;
public class InsertionSort {
    public static void sort(int A[]){
        for(int i =1 ;i<A.length;i++){
            int j = i-1, temp =A[i];
            while(A[j]>temp && j>=0){
                A[j+1]=A[j];
                j--;

            }
            A[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int A[]={1,32,41,12,34,67,11,33,37,44,99,5};
        sort(A);
        for(int i :A){
            System.out.print(i+ " ");

        }

    }
}
