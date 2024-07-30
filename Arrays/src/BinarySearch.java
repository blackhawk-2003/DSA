import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int start=0;
        int mid;
        int end=arr.length-1;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
    }
        System.out.println("Enter the key that you want to find in the array");
        int key = in.nextInt();
        int result = binarySearch(arr, key);
        if(result==-1){
            System.out.println("Element is not present in array");
        }
        else{
            System.out.println("Element is present at index "+result);
        }
}
}
