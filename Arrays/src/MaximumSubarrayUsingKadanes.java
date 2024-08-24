import java.util.Scanner;

public class MaximumSubarrayUsingKadanes {
    public static int maxSubarraySum(int arr[]){
        int maxSoFar = Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum = currentSum + arr[i];
            if(currentSum > maxSoFar){
                maxSoFar = currentSum;
            }
            if(currentSum<0){
                currentSum = 0;
            }
           
        }
        return maxSoFar;
    }

    //If all the elements in the array are 0 either return 0 or return the smallest negative number in the given array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of your array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum subarray sum is " + maxSum);
    }
}
