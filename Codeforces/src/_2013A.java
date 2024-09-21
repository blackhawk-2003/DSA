import java.util.Scanner;

public class _2013A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            int n =in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();
            int result = Math.min(x, y);
 
            int counted = n/result;
 
            if (n % result != 0) {
                counted++;
            }
 
            System.out.println(counted);


        }
    }
    }
