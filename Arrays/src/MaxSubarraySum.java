import java.util.Scanner;

public class MaxSubarraySum {
    public static int maxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currentSum = 0;
                for(int k=i;k<=j;k++){
                    currentSum += arr[k];
                    
                }
                System.out.println("The sum of the current subarray is "+currentSum);
                if(currentSum>maxSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;        
    }
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
