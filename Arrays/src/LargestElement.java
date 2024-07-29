//To find the largest element in an array

import java.util.Scanner;

public class LargestElement {

    public static int LargestElement(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The largest element in the array is "+LargestElement(arr));

    }
}
