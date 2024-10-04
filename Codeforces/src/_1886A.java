import java.util.Scanner;

public class _1886A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (n % 3 != 0 && n > 6) {
                System.out.println("YES");
                System.out.println("1 2 " + (n - 3));
            } else if (n % 3 == 0 && n > 9) {
                System.out.println("YES");
                System.out.println("1 4 " + (n - 5));
            } else {
                System.out.println("NO");
            }
        }
    }
}
