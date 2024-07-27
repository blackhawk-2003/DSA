import java.util.Scanner;

public class ButterflyPattern {

    public static void printPattern(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (r - i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (r - i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows for one wing of the butterfly");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        printPattern(r);
    }
}
