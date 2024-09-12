import java.util.Scanner;

public class _1984A {
    public static boolean isSame(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void solve(int arr[]) {
        char[] result = new char[arr.length];
        if (isSame(arr)) {
            System.out.println("NO");
        } else {
            if (arr.length % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    result[i] = 'R';
                }
                result[arr.length / 2] = 'B';
            } else {
                int i = 0;
                int j = arr.length - 1;
                while (i < j) {
                    result[i] = 'R';
                    result[j] = 'R';
                    i++;
                    j--;
                }
                result[arr.length / 2] = 'B';
            }
            System.out.println("YES");
            StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
        }
 
            System.out.println(sb.toString());
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            solve(a);
        }
    }
}
