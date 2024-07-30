import java.util.Scanner;

public class printSubarray {

    public static void printSubarray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("The total number subarrays are "+ ts);
    }
    public static void main(String[] args) {
        System.out.println("Enter the the number of elements that you want in your array");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the values of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        printSubarray(arr);

    }
}
