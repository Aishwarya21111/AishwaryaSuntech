package Suntech.Sorting;
public class SelectionSort {
    public static void sort(int A[]){
        for(int i = 0 ;i< A.length-1;i++){
            int min = i;
            for(int j =i+1;j<=A.length-1;j++){
                if(A[j]<A[min]){
                    min = j;
                }
            }
            int temp = A[min];
            A[min]=A[i];
            A[i]= temp;
        }
    }
    public static void main(String[] args) {
        int A[]= {22,12,4,63,17,91,45,67,21,98,1};
        sort(A);
        for(int i :A){
            System.out.print(i+" ");
        }
         
        }
    
    
}
