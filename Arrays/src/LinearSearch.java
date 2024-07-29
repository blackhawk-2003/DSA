import java.util.Scanner;

public class LinearSearch {

    public static void LinearSearch(int arr[], int key){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element is present at index " + i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Element is not present in array");
        }

    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key = in.nextInt();
        LinearSearch(arr,key);
    }
}
