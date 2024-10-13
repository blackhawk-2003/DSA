import java.util.*;

public class _2022A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int r = scanner.nextInt();
            int sum = 0;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            int sum1 = 0;
            int sum2 = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    sum1 += arr[i];
                    count += arr[i] / 2;
                } else {
                    sum1 += arr[i] - 1;
                    sum2 += 1;
                    count += (arr[i] - 1) / 2;
                }
            }
            int seatLeft;
            if (sum % 2 == 0) {
                count += sum2 / 2;
                seatLeft = r - count;
                sum1 += 2 * seatLeft;
            } else {
                count += (sum2 - 1) / 2;
                count++;
                sum1++;
                seatLeft = r - count;
                sum1 += 2 * seatLeft;
            }
            System.out.println(Math.min(sum, sum1));
        }
        scanner.close();
    }
}
