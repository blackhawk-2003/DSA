import java.util.Scanner;

public class _1968A {
    public static int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            int max = Integer.MIN_VALUE;
            int maxY = 0;
            for (int y = 1; y < x; y++) {
                int curr = gcd(x, y) + y;
                if (max < curr) {
                    max = curr;
                    maxY = y;
                }
            }
            System.out.println(maxY);
        }
    }
}
