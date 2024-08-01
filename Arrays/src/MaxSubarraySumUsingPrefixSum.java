import java.util.Scanner;

public class MaxSubarraySumUsingPrefixSum {

    public static int maxSubarraySum(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int currentSum = 0;

        // calculating prefix sum
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            prefix[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    currentSum = prefix[j];
                } else {
                    currentSum = prefix[j] - prefix[i - 1];
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in your array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of your array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int maxSum = maxSubarraySum(arr);
        System.out.println("The maximum subarray sum is " + maxSum);
    }
}
