import java.util.Scanner;

public class Bubble_Sort {

    public static int[] bubbleSort(int arr[]){
        int length = arr.length;
        for(int i=0;i<=length-2;i++){
            for(int j=0;j<=length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The sorted array is:- ");
        int[] sorted = bubbleSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}
