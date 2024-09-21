import java.util.Scanner;

public class _2014B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n= in.nextInt();
            int k=in.nextInt();
            int leaves = n * (n + 1) / 2;

 
        int totalLeaves=0;
        if (n - k >= 1) {
            totalLeaves = (n - k) * (n - k + 1) / 2;
        }

        
        int leavesEnd = leaves - totalLeaves;
        if (leavesEnd%2==0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        }
    }
}
