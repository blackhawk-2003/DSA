import java.util.Scanner;

public class _1956A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int k = in.nextInt();
            int q = in.nextInt();
            int arr1[] = new int[k];
            for (int i = 0; i < k; i++) {
                arr1[i] = in.nextInt();
            }
            int arr2[] = new int[q];
            for (int i = 0; i < q; i++) {
                arr2[i] = in.nextInt();
            }
            for (int i = 0; i < q; i++) {
                System.out.print(Math.min(arr1[0] - 1, arr2[i]) + " ");
            }
        }
    }

}
