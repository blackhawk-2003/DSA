import java.util.Scanner;

public class ArrayPairs {
    
    public static void printPairs(int arr[]){
        int tp=0;
        for(int i = 0; i < arr.length; i++){
            for(int j=i+1;j<arr.length;j++){           //Time Complexity:- O(n^2)
                System.out.print("("+arr[i] + "," + arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("The total number of pairs in the array are "+tp);
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
        printPairs(arr);
    }
}
