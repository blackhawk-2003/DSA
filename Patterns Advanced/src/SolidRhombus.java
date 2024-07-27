import java.util.Scanner;

public class SolidRhombus {

    public static void printPattern(int r){
        for(int i=5;i>=1;i--){
           for(int j=0;j<=i-1;j++){
            System.out.print(" ");
           }
           for(int j=0;j<=r;j++){
            System.out.print("*");
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of stars that you want in the rhombus");
        Scanner in =new Scanner(System.in);
        int r = in.nextInt();
        printPattern(r);
    }
}
