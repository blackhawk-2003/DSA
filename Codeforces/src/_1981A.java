import java.util.Scanner;

public class _1981A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            int l= in.nextInt();
            int r=in.nextInt();
            int p=2;
            System.out.println((int)(Math.log(r) / Math.log(p)));
        }
    }
}
