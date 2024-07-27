import java.util.Scanner;

public class HollowRhombus {

    public static void printPattern(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 0; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= r; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        printPattern(r);
    }
}
