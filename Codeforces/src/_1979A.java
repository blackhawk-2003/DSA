import java.util.Scanner;

public class _1979A {
    public static boolean allElementsSame(int[] arr) {
        // Check if the array is empty
        if (arr.length == 0) {
            return true; // Consider empty array as having all elements the same
        }

        // Use the first element as a reference
        int firstElement = arr[0];

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != firstElement) {
                return false; // Found a different element
            }
        }

        return true; // All elements are the same
    }
    public static int minSubarraySum(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];
        int minSum = Integer.MAX_VALUE;
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

                if (currentSum < minSum) {
                    minSum = currentSum;
                }
            }
        }
        return minSum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            if(allElementsSame(arr)){
                System.out.println(0);
            }
            else{
                System.out.println(minSubarraySum(arr));
                int minSum=minSubarraySum(arr)-1;
                System.out.println(minSum);
            }
        }
    }
}
