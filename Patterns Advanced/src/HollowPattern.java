import java.util.Scanner;

public class HollowPattern {
    public static void printPattern(int r, int c) {
        //outer loop
        for (int i = 1; i <= r; i++) {
            //inner loop
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = in.nextInt();
        System.out.println("Enter the number of columns");
        int c = in.nextInt();
        printPattern(r,c);
    }
}
