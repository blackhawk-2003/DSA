public class tagertSum {

    public static boolean targetSumSubset(int[] arr, int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int value = arr[i - 1];
                if (value <= j && dp[i - 1][j - value]) {
                    dp[i][j] = true;
                } else if (dp[i - 1][j]) {
                    dp[i][j] = true;
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 6 };
        int sum = 5;
        System.out.println(targetSumSubset(arr, sum));

    }
}
